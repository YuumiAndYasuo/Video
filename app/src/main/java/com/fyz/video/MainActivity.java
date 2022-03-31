package com.fyz.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private videoPlayerIJK mVideoPlayerIJK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVideoPlayerIJK=findViewById(R.id.mVideoPlayer);
        String videoPath = "http://v-cdn.zjol.com.cn/280443.mp4";
        mVideoPlayerIJK.setVideoPath(videoPath);
        mVideoPlayerIJK.start();
    }
}