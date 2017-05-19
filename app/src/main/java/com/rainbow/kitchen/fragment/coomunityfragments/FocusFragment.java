package com.rainbow.kitchen.fragment.coomunityfragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.ArtworkDetailsActivity;
import com.rainbow.kitchen.adapter.communityadapter.FocusAdapter;
import com.rainbow.kitchen.bean.CommunityFocus;
import com.rainbow.kitchen.callback.OnFocusItemClickListenter;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;


/**
 * 社区的关注页面
 */
public class FocusFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView recyclerView;
    private ArrayList<CommunityFocus.DataBeanX.DataBean> dataBeenList;
    private FocusAdapter focusAdapter;
    private SwipeRefreshLayout swipe_focus;
    private int page = 1;
    private int lastVisibleItem;
    private LinearLayoutManager manager;


    Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_focus, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rcv_communityfocus);
        manager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(manager);
        swipe_focus = (SwipeRefreshLayout) view.findViewById(R.id.swipe_focus);
        swipe_focus.setOnRefreshListener(this);
        swipe_focus.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light, android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        getFocusData(page);
        dataBeenList = new ArrayList<>();
        focusAdapter = new FocusAdapter(context, dataBeenList);
        recyclerView.setAdapter(focusAdapter);
        focusAdapter.setOnItemClicklistener(new OnFocusItemClickListenter() {
            @Override
            public void OnFocusItemClickListener(CommunityFocus.DataBeanX.DataBean data, int position) {
                String post_id = data.getId();
                Intent intent = new Intent(context, ArtworkDetailsActivity.class);
                intent.putExtra("post_id", post_id);
                context.startActivity(intent);
            }
        });
        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE && lastVisibleItem + 1 ==focusAdapter.getItemCount()){
                    page++;
                    Toast.makeText(context, "正在刷新，请稍后", Toast.LENGTH_SHORT).show();
                    getFocusData(page);
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                lastVisibleItem = manager.findLastVisibleItemPosition();
            }
        });
        return view;
    }

    public void getFocusData(int p) {
        OkHttpUtils.post()
                .addParams("page", p+"")
                .addParams("methodName", "ShequFollow")
                .addParams("size", "10")
                .addParams("version", "4.40")
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(context, "请求失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {

                        CommunityFocus focus = new Gson().fromJson(response, CommunityFocus.class);
                        List<CommunityFocus.DataBeanX.DataBean> dataBeen = focus.getData().getData();
                        if (dataBeen != null) {
                            dataBeenList.addAll(dataBeen);
                            focusAdapter.notifyDataSetChanged();
                        }

                    }
                });
    }

    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    if (dataBeenList.get(0).getNick() == null) {
                        page = 1;
                        dataBeenList.clear();
                        getFocusData(page);
                    } else {
                        focusAdapter.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                swipe_focus.setRefreshing(false);
            }
        }, 3000);
    }
}
