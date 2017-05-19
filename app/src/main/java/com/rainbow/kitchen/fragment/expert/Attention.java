package com.rainbow.kitchen.fragment.expert;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.ExpertDetalis.ExpertDetalis01Adapter;
import com.rainbow.kitchen.adapter.ExpertDetalis.ExpertDetalis02Adapter;
import com.rainbow.kitchen.bean.AttentionBean;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * Created by Administrator on 2017.1.9.
 */

public class Attention extends Fragment{
    private RecyclerView attention_vr;
    private String id;
    private ExpertDetalis02Adapter adapter;
    private List<AttentionBean.DataBeanX.DataBean> data = new ArrayList<>();
    private int page = 1;

    Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.attention_expert, container, false);
        attention_vr = (RecyclerView) view.findViewById(R.id.attention_vr);
        attention_vr.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));


        Bundle bundle = getArguments();//从activity传过来的Bundle
        if(bundle!=null){
            id = bundle.getString("str");
            Log.e("ffff","-----------------"+id);
            adapter = new ExpertDetalis02Adapter(data,context);
            getdata();
            attention_vr.setAdapter(adapter);
        }
        return view;
    }

    public void getdata() {
        OkHttpUtils.post()
                .url(MyURL.URL)
                .addParams("methodName","GuanzhuList")
                .addParams("size","20")
                .addParams("user_id_target",id)
                .addParams("page",page+"")
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
                            AttentionBean a = new Gson().fromJson(response,AttentionBean.class);
                            data.addAll(a.getData().getData());
                            adapter.notifyDataSetChanged();
                        }
                    }
                });
    }
}
