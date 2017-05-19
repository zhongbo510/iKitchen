package com.rainbow.kitchen.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.view.FullScreenVideoView;

public class PlayVideoActivity extends AppCompatActivity {

    private RelativeLayout mVideoLayout;
    private FullScreenVideoView video_play;
    String videourl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                , WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        setContentView(R.layout.activity_play_video);
        mVideoLayout= (RelativeLayout) findViewById(R.id.video_layout);
        video_play= (FullScreenVideoView) findViewById(R.id.video_play);
        Intent intent=getIntent();
        videourl=intent.getStringExtra("video");

        MediaController controller = new MediaController(PlayVideoActivity.this);

        //设置给videoView作为控制器
        controller.setAnchorView(video_play);
        video_play.setMediaController(controller);


        //获取到总的时间 ,如果直接获取总的长度，会发现，返回值为-1。
        //是因为 视频的播放，需要时间，对于VideoView来说，是异步的。
        int duration = video_play.getDuration();
        Log.i("@@@", "==duration=" + duration);


        //这个监听，就是准备好的监听，这个监听被调用之后，视频就可以开始播放了。
        video_play.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //这个方法里面，才可以获取到视频的一些信息
                int dd = video_play.getDuration();
            }
        });


        video_play.postDelayed(new Runnable() {
            @Override
            public void run() {
                int position = video_play.getCurrentPosition();
                Log.i("@@@", "===position=" + position);
                video_play.postDelayed(this, 1000);
            }
        }, 1000);

        video_play.setVideoPath(videourl);
        video_play.start();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        mVideoLayout.setLayoutParams(layoutParams);

    }


}
