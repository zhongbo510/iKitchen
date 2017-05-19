package com.rainbow.kitchen.fragment.coomunityfragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.communityadapter.TuijianAdapter;
import com.rainbow.kitchen.bean.Tuijian;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * 社区的最新页面
 */
public class TuijianFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener{
    private RecyclerView rv_communitytuijian;
    private List<Tuijian.DataBeanX> data = new ArrayList<>();
    private TuijianAdapter tuijianAdapter;
    private SwipeRefreshLayout swipe_tuijian;

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
        View view=inflater.inflate(R.layout.fragment_tuijian,container,false);
        rv_communitytuijian = (RecyclerView) view.findViewById(R.id.rv_communitytuijian);
        rv_communitytuijian.setLayoutManager(new LinearLayoutManager(context));
        swipe_tuijian = (SwipeRefreshLayout) view.findViewById(R.id.swipe_tuijian);
        swipe_tuijian.setOnRefreshListener(this);
        swipe_tuijian.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light, android.R.color.holo_orange_light,
                android.R.color.holo_red_light);
        getdata();

        tuijianAdapter = new TuijianAdapter(data,context);
        rv_communitytuijian.setAdapter(tuijianAdapter);

        return view;
    }


    public void getdata() {
        OkHttpUtils.post()
                .url(MyURL.URL)
                .addParams("methodName","ShequRecommend")
                .addParams("version","4.40")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(context, "请求失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        if(null != response){
                            Tuijian t = new Gson().fromJson(response,Tuijian.class);
                            data.add(t.getData());
                            data.add(t.getData());
                            data.add(t.getData());
                            data.add(t.getData());
                            tuijianAdapter.notifyDataSetChanged();
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
                    if (data.get(0).getShequ_marrow().size() == 0){
                        data.clear();
                        getdata();
                    }else {
                        tuijianAdapter.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                swipe_tuijian.setRefreshing(false);
            }
        }, 3000);
    }
}

