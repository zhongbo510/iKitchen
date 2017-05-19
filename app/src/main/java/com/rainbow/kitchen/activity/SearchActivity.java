package com.rainbow.kitchen.activity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.db.RecordSQLiteOpenHelper;
import com.rainbow.kitchen.view.MyListView;

import java.util.Date;

/**
 * 搜索页面
 */

public class SearchActivity extends AppCompatActivity{
    EditText search;
    TextView cancle,tv_tip;
    MyListView myList;
    TextView clear;
    SQLiteDatabase db;
    RecordSQLiteOpenHelper helper = new RecordSQLiteOpenHelper(this,"search.db",null,1);
    BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
        onClickEvent();
    }

    /**
     * 点击事件
     */
    public void onClickEvent() {
        /**
         * 清空搜索历史
         */
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deletData();
                queryData("");
            }
        });

        /**
         * 搜索框搜索回调
         */
        search.setOnKeyListener(new View.OnKeyListener() {
            //修改回车键的功能
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_ENTER
                        && event.getAction() == KeyEvent.ACTION_DOWN)
                    //隐藏键盘
                    ((InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(
                            getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS
                    );
                //按完搜索将当前搜索的关键字保存起来，如果该关键字已经存在就不保存
                boolean hasData =hasData(search.getText().toString().trim());
                if (!hasData){
                    insertData(search.getText().toString().trim());
                    queryData("");
                }

                return false;
            }
        });

        /**
         * 搜索框文本监听时实监听
         */
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().trim().length() ==0){
                    tv_tip.setText("搜索历史");
                }else {
                    tv_tip.setText("搜索结果");
                }
                //模糊查询数据库中有没有数据
                String tempName = search.getText().toString();
                queryData(tempName);
            }
        });

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                String name = textView.getText().toString();
                search.setText(name);
                Toast.makeText(SearchActivity.this, name, Toast.LENGTH_SHORT).show();
                //TODO 获取item上的文字，根据关键字跳转到另外一个页面查询
            }
        });

        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        //测试
        Date date = new Date();
        long time = date.getTime();
        insertData("query" + time);

        // 第一次进入查询所有的历史记录
        queryData("");

    }


    /**
     * 插入数据
     */
    public void insertData(String tempName){
        db = helper.getWritableDatabase();
        db.execSQL("insert into records(name) values('" + tempName + "')");
        db.close();
    }
    /**
     * 模糊查询数据
     * @param tempName
     */
    public void queryData(String tempName) {
        Cursor cursor = helper.getReadableDatabase().rawQuery(
          "select id as _id,name from records where name like '%" + tempName + "%' order by id desc", null);

        adapter = new SimpleCursorAdapter(this,android.R.layout.simple_list_item_1,
                cursor,new String[]{"name"},new int[]{android.R.id.text1}, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
        myList.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }


    /**
     *检查该数据库中是否已经存在该数据
     * @param tempName
     * @return
     */
    public boolean hasData(String tempName) {
        Cursor cursor = helper.getReadableDatabase().rawQuery(
                "select id as _id,name from records where name =?", new String[]{tempName});

        return cursor.moveToNext();
    }

    /**
     * 清空数据
     */
    public void deletData() {
        db = helper.getWritableDatabase();
        db.execSQL("delete from records");
        db.close();
    }




    /**
     * 初始化控件
     */
    public void initView() {
        search = (EditText) findViewById(R.id.search);
        cancle = (TextView) findViewById(R.id.cancle);
        myList = (MyListView) findViewById(R.id.myList);
        clear = (TextView) findViewById(R.id.clear);
        tv_tip = (TextView) findViewById(R.id.tv_tip);
    }


}
