package com.rainbow.kitchen.fragment.recipefragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.recipeitemadapters.classificationadapter.ClassificationAdapter;
import com.rainbow.kitchen.bean.Classification;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * A simple {@link Fragment} subclass.
 * 食谱分类
 */
public class Classificationfragment extends Fragment {

    private RecyclerView rcv_classification;
    private ArrayList<Classification.DataBeanXX.DataBeanX> dataBeanList;
    private ClassificationAdapter classificationAdapter;

    public Classificationfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        initDatas();
        dataBeanList=new ArrayList<>();
        View view=inflater.inflate(R.layout.fragment_classificationfragment,container,false);
        rcv_classification= (RecyclerView) view.findViewById(R.id.rcv_classification);
        //在碎片里面获取到布局管理器  相当重要
        rcv_classification.setLayoutManager(new LinearLayoutManager(getContext()));
        classificationAdapter=new ClassificationAdapter(getActivity(),dataBeanList);
        rcv_classification.setAdapter(classificationAdapter);
        return view;
    }

    private void initDatas() {

        OkHttpUtils.post()
                .addParams("methodName","CategoryIndex")
                .addParams("version","4.40")
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        Classification classification=new Gson().fromJson(response,Classification.class);
                       List<Classification.DataBeanXX.DataBeanX> databean=  classification.getData().getData();
                        if(databean!=null){
                            dataBeanList.addAll(databean);
                            classificationAdapter.notifyDataSetChanged();
                        }
                    }
                });
    }


}