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
import com.rainbow.kitchen.bean.ExpertDetalis;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * Created by Administrator on 2017.1.9.
 */

public class Production extends Fragment{

    private RecyclerView production_vr;
    private ExpertDetalis01Adapter adapter;
    private List<ExpertDetalis.DataBeanX.DataBean> data = new ArrayList<>();
    private String id;
    private int page = 1;

    Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.production_expert, container, false);

        production_vr = (RecyclerView) view.findViewById(R.id.production_vr);
        production_vr.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));

        Bundle bundle = getArguments();//从activity传过来的Bundle
        if(bundle!=null){
            id = bundle.getString("str");
            adapter = new ExpertDetalis01Adapter(data,context);
            getdata();
            production_vr.setAdapter(adapter);
        }

        return view;
    }

    public void getdata() {
        OkHttpUtils.post()
                .url(MyURL.URL)
                .addParams("methodName","ShequUlist")
                .addParams("size","20")
                .addParams("page",page+"")
                .addParams("visitor_id",id)
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
                            ExpertDetalis e = new Gson().fromJson(response,ExpertDetalis.class);
                            data.addAll(e.getData().getData());
                            adapter.notifyDataSetChanged();
                        }
                    }
                });
    }
}
