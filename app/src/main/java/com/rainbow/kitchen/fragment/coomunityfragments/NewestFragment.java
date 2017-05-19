package com.rainbow.kitchen.fragment.coomunityfragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.ArtworkDetailsActivity;
import com.rainbow.kitchen.adapter.communityadapter.NewestAdapter;
import com.rainbow.kitchen.bean.CommunityNewest;
import com.rainbow.kitchen.callback.OnNewesItemClickListener;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * 社区的最新页面
 */
public class NewestFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener{
    private RecyclerView recyclerView;
    private ArrayList<CommunityNewest.DataBeanX.DataBean> dataList;
    private NewestAdapter newestAdapter;
    private SwipeRefreshLayout swipe_newsest;
    private int page = 1;
    private GridLayoutManager manager;
    private int lastVisibleItem;

    Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    public NewestFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newest, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_communitynewest);
        manager = new GridLayoutManager(context, 2);
        recyclerView.setLayoutManager(manager);
        swipe_newsest = (SwipeRefreshLayout) view.findViewById(R.id.swipe_newsest);
        swipe_newsest.setOnRefreshListener(this);
        swipe_newsest.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light, android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        getCommunityNewestData(page);
        dataList = new ArrayList<>();
        newestAdapter = new NewestAdapter(context, dataList);
        recyclerView.setAdapter(newestAdapter);
        newestAdapter.setOnItemClicklistener(new OnNewesItemClickListener() {
            @Override
            public void OnNewsItemClickListener(CommunityNewest.DataBeanX.DataBean data, int position) {
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
                if(newState == RecyclerView.SCROLL_STATE_IDLE && lastVisibleItem + 1 ==newestAdapter.getItemCount()){
                    page++;
                    Toast.makeText(context, "正在刷新，请稍后", Toast.LENGTH_SHORT).show();
                    getCommunityNewestData(page);
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

    public void getCommunityNewestData(int p) {
        OkHttpUtils.post()
                .addParams("is_marrow", "0")
                .addParams("page", p + "")
                .addParams("methodName", "ShequList")
                .addParams("last_id", "0")
                .addParams("size", "20")
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
                        Log.e("@@@", "==response==" + response);
                        CommunityNewest newest = new Gson().fromJson(response, CommunityNewest.class);
                        List<CommunityNewest.DataBeanX.DataBean> dataBean = newest.getData().getData();
                        if (dataBean != null) {
                            dataList.addAll(dataBean);
                            newestAdapter.notifyDataSetChanged();
                        }
                    }
                });
    }

    @Override
    public void setMenuVisibility(boolean menuVisibile) {
        super.setMenuVisibility(menuVisibile);
        if (this.getView() != null) {
            this.getView().setVisibility(menuVisibile ? View.VISIBLE : View.GONE);
        }
    }

    @Override
    public void onRefresh() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    if (dataList.get(0).getNick() == null) {
                        page = 1;
                        dataList.clear();
                        getCommunityNewestData(page);
                    } else {
                        newestAdapter.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                swipe_newsest.setRefreshing(false);
            }
        }, 3000);
    }
}

