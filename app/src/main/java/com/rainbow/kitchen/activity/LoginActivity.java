package com.rainbow.kitchen.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.rainbow.kitchen.R;

import java.util.HashMap;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.tencent.qq.QQ;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void qqLogin(View view) {
        login(QQ.NAME);
    }

    public void login(String name) {
        ShareSDK.initSDK(this);
        final Platform p = ShareSDK.getPlatform(this,name);
        p.SSOSetting(false);
        p.showUser(null);
        p.setPlatformActionListener(new PlatformActionListener() {
            @Override
            public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                String icon = platform.getDb().getUserIcon();
                String name = platform.getDb().getUserName();
                String platformName=platform.getDb().getPlatformNname();
                SharedPreferences sp =getSharedPreferences("setting",MODE_PRIVATE);
                sp.edit().putString("icon",icon)
                        .putString("name",name)
                        .putBoolean("isLogin",true)
                        .putString("platformName",platformName)
                        .commit();
                String string = sp.getString("icon", null);
                Log.i("juiji","==icon2==="+string);

                Intent intent = new Intent(LoginActivity.this, LoginActivity.class);
                intent.putExtra("icon",icon);
                intent.putExtra("name",name);
                setResult(RESULT_OK,intent);
                finish();
            }

            @Override
            public void onError(Platform platform, int i, Throwable throwable) {

            }

            @Override
            public void onCancel(Platform platform, int i) {

            }
        });
    }
}
