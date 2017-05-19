package com.rainbow.kitchen.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.FunItemDetailActivity;
import com.rainbow.kitchen.adapter.FunAdapter;
import com.rainbow.kitchen.bean.Foods;
import com.rainbow.kitchen.callback.OnFunItemClickListener;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;


/**
 * 乐活
 * A simple {@link Fragment} subclass.
 */
public class Fun extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView recyclerView;
    private SwipeRefreshLayout fun_swiprefresh;
    private ArrayList<Foods.DataBeanX.DataBean> dataList;
    private FunAdapter funAdapter;
    private int page = 1;
    private int lastVisibleItem;
    private boolean isend = false;
    private LinearLayoutManager manager;

    public Fun() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fun, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        fun_swiprefresh = (SwipeRefreshLayout) view.findViewById(R.id.fun_swiprefresh);
        fun_swiprefresh.setOnRefreshListener(this);
        getFoodsData(page);
        manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        dataList = new ArrayList<>();
        funAdapter = new FunAdapter(getActivity(), dataList);
        recyclerView.setAdapter(funAdapter);

        funAdapter.setOnFunItemClickListener(new OnFunItemClickListener() {
            @Override
            public void onFunItemClick(Foods.DataBeanX.DataBean dataBean, int position) {
                int series_id = dataBean.getSeries_id();
                Intent intent = new Intent(getActivity(), FunItemDetailActivity.class);
                intent.putExtra("series_name", dataBean.getSeries_name());
                intent.putExtra("series_id", series_id);
                startActivity(intent);
            }
        });

        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE && lastVisibleItem + 1 == funAdapter.getItemCount()) {
                    if (!isend) {
                        page++;
                        Toast.makeText(getActivity(), "正在加载，请稍后", Toast.LENGTH_SHORT).show();
                        getFoodsData(page);
                    } else {
                        Toast.makeText(getActivity(), "已经加载全部数据", Toast.LENGTH_SHORT).show();
                    }
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

    //http://api.izhangchu.com/
    public void getFoodsData(int page) {
        OkHttpUtils.post()
                .addParams("page", String.valueOf(page))
                .addParams("methodName", "CourseIndex")
                .addParams("size", "20")
                .addParams("version", "4.40")
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        Foods foods = new Gson().fromJson(response, Foods.class);
                        List<Foods.DataBeanX.DataBean> dataBeen = foods.getData().getData();
                        if (foods.getData().getData().size() != 0) {
                            dataList.addAll(dataBeen);
                            Log.e("====funDataList====", "===" + dataList.size());
                            funAdapter.notifyDataSetChanged();
                        } else {
                            isend = true;
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
//                这里没网的时候会报空指针崩溃，所以try，catch一下，
                try {
                    if (dataList.get(0).getImage() == null) {
                        page = 1;
                        dataList.clear();
                        getFoodsData(page);
                    } else {
                        funAdapter.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //停止刷新
                fun_swiprefresh.setRefreshing(false);
            }
        }, 3000);
    }


}
