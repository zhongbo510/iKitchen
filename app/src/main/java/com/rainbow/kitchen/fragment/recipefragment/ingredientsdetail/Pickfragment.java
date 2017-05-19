package com.rainbow.kitchen.fragment.recipefragment.ingredientsdetail;

import android.app.Activity;
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
import com.rainbow.kitchen.adapter.recipeitemadapters.ingredientsadapter.IngredientsRvAdapter;
import com.rainbow.kitchen.bean.IngredientsDetailBean;
import com.rainbow.kitchen.callback.GsonCallback;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;

import okhttp3.Call;

import static android.R.attr.id;

/**
 * 食材详情 选购
 * Created by Administrator on 2017/1/6.
 */
public class Pickfragment extends Fragment {
    private RecyclerView recyclerView;
    private String id;
    private IngredientsRvAdapter myadapter;
    private IngredientsDetailBean.DataBean dataBean;
    private Activity activity;

    public Pickfragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_ingredients_frg, container,false);

        Intent intent=activity.getIntent();
        id= intent.getStringExtra("id");
        Log.i("id","==ddd=="+id);

        recyclerView = (RecyclerView) view.findViewById(R.id.precycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        myadapter=new IngredientsRvAdapter(activity);
        recyclerView.setAdapter(myadapter);
        getvgdata();
        return view;

    }

    private void getvgdata() {
        //内部传输数据
        if (getArguments()!=null){
            Bundle bundle= Pickfragment.this.getArguments();
            //显示传递来的数据
            dataBean= (IngredientsDetailBean.DataBean) bundle.getSerializable("data");
            myadapter.setData(dataBean);
            Log.i("data", "getvgdata: "+dataBean.getPick());
        }else {
            OkHttpUtils.post()
                    .addParams("methodName","MaterialView")
                    .addParams("material_id",id)
                    .addParams("version","4.40")
                    .url(MyURL.URL)
                    .build()
                    .execute(new GsonCallback<IngredientsDetailBean>() {
                        @Override
                        public void onError(Call call, Exception e, int id) {
                            Toast.makeText(getActivity(), "  请求失败，" + e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                        @Override
                        public void onResponse(IngredientsDetailBean response, int id) {
                            // Log.e("a1","==="+response.getData());

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
}
