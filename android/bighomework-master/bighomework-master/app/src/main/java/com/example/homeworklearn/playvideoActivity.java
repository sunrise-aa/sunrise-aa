package com.example.homeworklearn;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;

import java.io.IOException;

/**
 * @ClassName : playvideoActivity
 * @Author : 骆发茂
 * @Date: 2021/4/10 23:35
 * @Description :
 *     --layout里面的fragment.xml就是布局文件，类似前端显示控件
 *     activity就是一个又一个活动事件，可以跳转到另一个xml里面
 *     fragment就是对控件进行设计功能-->
 */
public class playvideoActivity extends Activity {
    SurfaceView surfaceView;
    Button playvideo_butn_start;
    MediaPlayer mediaPlayer;
    SurfaceHolder surfaceHolder;
    String playvideo_path;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playvideo);


    surfaceView = findViewById(R.id.playvideo_surfaceView);
    playvideo_butn_start = findViewById(R.id.playvideo_button_start);
    mediaPlayer = new MediaPlayer();
    playvideo_path="/sdcard/DCIM/Camera/6c0b41083233f94ee7ad7b88e08d387b.mp4";


    if(Build.VERSION.SDK_INT>=23){
        int permission = ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
        if(permission!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{
                    Manifest.permission.READ_EXTERNAL_STORAGE},0);
        }
    }

    }
    public void playvideo_start(View view){

        try {
            Toast.makeText(playvideoActivity.this,"开始播放视频",Toast.LENGTH_SHORT).show();
            mediaPlayer.reset();
            mediaPlayer.setDataSource(playvideo_path);
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            surfaceHolder= surfaceView.getHolder();
            mediaPlayer.setDisplay(surfaceHolder);
            mediaPlayer.prepare();
            mediaPlayer.start();


        } catch (IOException e) {
            Toast.makeText(playvideoActivity.this,"播放出现错误！",Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

    }


    public void playvideo_stop(View view){
        if(mediaPlayer.isPlaying()){
            Toast.makeText(playvideoActivity.this,"停止播放视频",Toast.LENGTH_SHORT).show();
            mediaPlayer.reset();

            /*停止播放之后就release释放了资源，不可继续播放*/
        }
       // mediaPlayer.release();
    }

    public void playvideo_pause(View view){
        if(mediaPlayer.isPlaying()){
            Toast.makeText(playvideoActivity.this,"暂停播放视频",Toast.LENGTH_SHORT).show();
            mediaPlayer.pause();
            /*可以判断状态，是否继续或者暂停播放*/
        }
        else{
            Toast.makeText(playvideoActivity.this,"继续播放视频",Toast.LENGTH_SHORT).show();
            mediaPlayer.start();
        }
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.e("activityState","playvideoActivity_onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("activityState","playvideoActivity_onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("activityState","playvideoActivity_onPause");
    }


    @Override
    protected void onStop(){
        super.onStop();
        Log.e("activityState","playvideoActivity_onStop");
    }


    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("activityState","playvideoActivity_onRestart");
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        mediaPlayer.release();
        Log.e("activityState","playvideoActivity_onDestroy");
    }
}
