package com.rainbow.kitchen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.rainbow.kitchen.fragment.Community;
import com.rainbow.kitchen.fragment.Fun;
import com.rainbow.kitchen.fragment.Mine;
import com.rainbow.kitchen.fragment.Recipe;

/**
 * 进入app主activity
 */
public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    RadioGroup radioGroup;
    RadioButton radioButtonrecipe;
    RadioButton radioButtonfun;
    RadioButton radioButtoncommunity;
    RadioButton radioButtonmine;
    boolean ischeck = true;

    //    一共四个碎片
    static final int NUM_ITEMS = 4;
    private long mExitTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        frameLayout = (FrameLayout) findViewById(R.id.mHomeContent);
        radioGroup = (RadioGroup) findViewById(R.id.mHomeRadioGroup);
        radioButtonrecipe = (RadioButton) findViewById(R.id.recipe);
        radioButtonfun = (RadioButton) findViewById(R.id.fun);
        radioButtoncommunity = (RadioButton) findViewById(R.id.community);
        radioButtonmine = (RadioButton) findViewById(R.id.mine);

//        四个radiobutton监听事件
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                int index = 0;
                switch (checkedId) {
                    case R.id.recipe:
                        index = 0;
                        break;
                    case R.id.fun:
                        index = 1;
                        break;
                    case R.id.community:
                        index = 2;
                        break;
                    case R.id.mine:
                        index = 3;
                        break;
                }
                //通过fragments这个adapter还有index来替换帧布局中的内容
                Fragment fragment = (Fragment) fragments.instantiateItem(frameLayout, index);
                fragments.setPrimaryItem(frameLayout, 0, fragment);
                fragments.finishUpdate(frameLayout);

            }
        });


    }

    private void initData() {

    }


    //第一次启动时，我们让recipe这个radiobutton处于选中状态。
    @Override
    protected void onStart() {
        super.onStart();
        if(ischeck){
            radioGroup.check(R.id.recipe);
            ischeck = false;
        }

    }

    FragmentStatePagerAdapter fragments = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0://食谱
                    fragment = new Recipe();
                    break;
                case 1://乐活
                    fragment = new Fun();
                    break;

                case 2://社区
                    fragment = new Community();
                    break;

                case 3://我的
                    fragment = new Mine();
                    break;
                default:
                    new Recipe();
                    break;
            }
            return fragment;
        }
    };


    //    再按一次退出程序
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {//
                // 如果两次按键时间间隔大于2000毫秒，则不退出
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();// 更新mExitTime
            } else {
                System.exit(0);// 否则退出程序
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


}
