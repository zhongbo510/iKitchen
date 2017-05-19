package com.rainbow.kitchen.fragment.recipefragment;

import android.app.Activity;
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
import com.rainbow.kitchen.adapter.recipeitemadapters.ingredientsadapter.IngredientsAdapter;
import com.rainbow.kitchen.bean.Ingredients;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

/**
 * 食材页碎片
 * A simple {@link Fragment} subclass.
 *
 */
public class Ingredientsfragment extends Fragment {

    //    上下文
    Context context;
    //食材的数据源(共17个bean对象的那个集合)
    List<Ingredients.DataBeanXX.DataBeanX> dataBeanXList;
    //    大的recycleview
    RecyclerView recyclerView;
    private Activity activity;
    //    食材的适配器
    IngredientsAdapter ingredientsAdapter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.activity = getActivity();
    }

    public Ingredientsfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ingredientsfragment, container, false);
//        找到recycleview控件
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_shicai);
//        recyclerview设置布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        //请求到数据不为空，我们就给适配器数据，
        initData();



        return view;
    }

    /**
     * 初始化数据源
     */
    private void initData() {
        OkHttpUtils.post()
                .addParams("methodName", "MaterialSubtype")
                .addParams("version", "4.40")
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("hhh", "GsonCallback error==" + e.getMessage());
                        Toast.makeText(getActivity(), "  请求失败，" + e.getMessage(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Ingredients ingredients = new Gson().fromJson(response, Ingredients.class);
//                        这个是array17的那个list集合，共17个元素,每个元素里还套了一个array，
                        dataBeanXList = ingredients.getData().getData();

                        if (dataBeanXList != null) {
                            ingredientsAdapter = new IngredientsAdapter(activity);
                            // 绑定适配器
                            recyclerView.setAdapter(ingredientsAdapter);
                            ingredientsAdapter.setData(dataBeanXList);
                        }else {
                            Log.e("hhh", "response is null");
                        }
                    }
                });

    }
}