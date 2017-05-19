package com.rainbow.kitchen.fragment.recipefragment.ingredientsdetail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.recipeitemadapters.ingredientsadapter.IngredientsRvAdapter2;
import com.rainbow.kitchen.bean.IngredientsDetailBean;
import com.rainbow.kitchen.callback.GsonCallback;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;

import okhttp3.Call;

/**
 * Created by Administrator on 2017/1/6.
 * 营养功效
 */
public class Nutritionfragment extends Fragment {
    private RecyclerView recyclerView;
    private String id;
    Context context;
    private IngredientsRvAdapter2 myadapter;
    private IngredientsDetailBean.DataBean dataBean;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context =context;
    }

    public Nutritionfragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_ingredients_frg, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.precycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        Intent intent=getActivity().getIntent();
        id= intent.getStringExtra("id");
        Log.i("id","==ccc=="+id);
        getvgdata();
        myadapter=new IngredientsRvAdapter2(getActivity(),dataBean);
        recyclerView.setAdapter(myadapter);
        return view;
    }

    private void getvgdata() {
        OkHttpUtils.post()
                .addParams("methodName","MaterialView")
                .addParams("material_id",id)
                .addParams("version","4.40")
                .url(MyURL.URL)
                .build()
                .execute(new GsonCallback<IngredientsDetailBean>() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("hhh", "GsonCallback error==" + e.getMessage());
                        Toast.makeText(getActivity(), "  请求失败，" + e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                    @Override
                    public void onResponse(IngredientsDetailBean response, int id) {
                        Log.e("b2","==="+response.getData());

                        if (response.getData()!=null){
                            dataBean=response.getData();
                            myadapter.setData(dataBean);
                        }else {
                            Log.e("hhh", "response is null");
                        }
                    }
                });
    }
}
