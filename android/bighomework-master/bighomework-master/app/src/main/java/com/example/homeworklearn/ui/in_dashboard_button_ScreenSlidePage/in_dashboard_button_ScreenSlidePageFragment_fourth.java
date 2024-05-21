package com.example.homeworklearn.ui.in_dashboard_button_ScreenSlidePage;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homeworklearn.R;

import java.io.IOException;

/**
 * @ClassName : ScreenSlidePageFragment_fourth
 * @Author : 骆发茂
 * @Date: 2021/4/13 20:17
 * @Description :
 * <p>
 * onviewcreate,onactivitycreate,oncreateview
 * <p>
 * fragment,绑定
 * xml
 * 内存呢
 * view对象
 * 转化对象
 * oncreateview
 * xml========view对象
 * framgnet绑定
 * 执行完后，root，返回view
 * view创建后，再进行操作
 * 绑定之后再操作，不然就是空的
 * <p>
 * 在create之后再进行绑定
 * 不分先后，相同的，对activities
 * 对view，看谁先加载，对内对外
 */
public class in_dashboard_button_ScreenSlidePageFragment_fourth extends Fragment {
    /*获取组件，声明变量*/

    SurfaceView surfaceView;
    Button in_dashboard_button_ScreenSlidePageActivity_butn_start;
    MediaPlayer mediaPlayer;
    SurfaceHolder surfaceHolder;
    String in_dashboard_button_ScreenSlidePageActivity_path;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /*获取组件，声明变量*/

        surfaceView = requireView().findViewById(R.id.in_dashboard_button_fragment_screen_slide_page_fourthpage_surfaceView);
        in_dashboard_button_ScreenSlidePageActivity_butn_start = requireView().findViewById(R.id.in_dashboard_button_fragment_screen_slide_page_fourthpage_button_start);
        mediaPlayer = new MediaPlayer();
        in_dashboard_button_ScreenSlidePageActivity_path = "/sdcard/DCIM/Camera/86a9b5cf78a5051f66fe60af693d2bc5.mp4";


        requireView().findViewById(R.id.in_dashboard_button_fragment_screen_slide_page_fourthpage_button_start)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("activityState", "点击播放视频");

                        try {
                            Toast.makeText(getContext(), "开始播放视频", Toast.LENGTH_SHORT).show();
                            mediaPlayer.reset();
                            mediaPlayer.setDataSource(in_dashboard_button_ScreenSlidePageActivity_path);
                            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            surfaceHolder = surfaceView.getHolder();
                            mediaPlayer.setDisplay(surfaceHolder);
                            mediaPlayer.prepare();
                            mediaPlayer.start();


                        } catch (IOException e) {
                            Toast.makeText(getContext(), "播放出现错误！", Toast.LENGTH_SHORT).show();
                            e.printStackTrace();
                        }
                    }
                });


        requireView().findViewById(R.id.in_dashboard_button_fragment_screen_slide_page_fourthpage_button_pause)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("activityState", "暂停或者继续播放视频");

                        if (mediaPlayer.isPlaying()) {
                            Toast.makeText(getActivity(), "暂停播放视频", Toast.LENGTH_SHORT).show();
                            mediaPlayer.pause();

                            /*可以判断状态，是否继续或者暂停播放*/

                        } else {
                            Toast.makeText(getActivity(), "继续播放视频", Toast.LENGTH_SHORT).show();
                            mediaPlayer.start();
                        }
                    }
                });

        requireView().findViewById(R.id.in_dashboard_button_fragment_screen_slide_page_fourthpage_button_stop)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("activityState", "停止播放视频");

                        if (mediaPlayer.isPlaying()) {
                            Toast.makeText(getActivity(), "停止播放视频", Toast.LENGTH_SHORT).show();
                            mediaPlayer.reset();


                            /*停止播放之后就release释放了资源，不可继续播放*/

                        }
                        // mediaPlayer.release();
                    }


                });


        /*如果在button里面定义了button的功能，就写下面的可以了*/
/*    if(Build.VERSION.SDK_INT>=23){
        int permission = ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
        if(permission!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{
                    Manifest.permission.READ_EXTERNAL_STORAGE},0);
        }
    }*/





    /*    public void in_dashboard_button_ScreenSlidePageActivity_pause(View view){
        if(mediaPlayer.isPlaying()){
            Toast.makeText(in_dashboard_button_ScreenSlidePageActivity_fourth.this,"暂停播放视频",Toast.LENGTH_SHORT).show();
            mediaPlayer.pause();

                *//*可以判断状态，是否继续或者暂停播放*//*

        }
        else{
            Toast.makeText(in_dashboard_button_ScreenSlidePageActivity_fourth.this,"继续播放视频",Toast.LENGTH_SHORT).show();
            mediaPlayer.start();
        }
        }*/





/*
    public void in_dashboard_button_ScreenSlidePageActivity_start(View view){

        try {
            Toast.makeText(in_dashboard_button_ScreenSlidePageActivity_fourth.this,"开始播放视频",Toast.LENGTH_SHORT).show();
            mediaPlayer.reset();
            mediaPlayer.setDataSource(in_dashboard_button_ScreenSlidePageActivity_path);
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            surfaceHolder= surfaceView.getHolder();
            mediaPlayer.setDisplay(surfaceHolder);
            mediaPlayer.prepare();
            mediaPlayer.start();


        } catch (IOException e) {
            Toast.makeText(in_dashboard_button_ScreenSlidePageActivity_fourth.this,"播放出现错误！",Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

    }


    public void in_dashboard_button_ScreenSlidePageActivity_stop(View view){
        if(mediaPlayer.isPlaying()){
            Toast.makeText(in_dashboard_button_ScreenSlidePageActivity_fourth.this,"停止播放视频",Toast.LENGTH_SHORT).show();
            mediaPlayer.reset();

            */
        /*停止播放之后就release释放了资源，不可继续播放*//*

        }
       // mediaPlayer.release();
    }

    public void in_dashboard_button_ScreenSlidePageActivity_pause(View view){
        if(mediaPlayer.isPlaying()){
            Toast.makeText(in_dashboard_button_ScreenSlidePageActivity_fourth.this,"暂停播放视频",Toast.LENGTH_SHORT).show();
            mediaPlayer.pause();
            */
        /*可以判断状态，是否继续或者暂停播放*//*

        }
        else{
            Toast.makeText(in_dashboard_button_ScreenSlidePageActivity_fourth.this,"继续播放视频",Toast.LENGTH_SHORT).show();
            mediaPlayer.start();
        }
    }
*/

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.in_dashboard_button_fragment_screen_slide_page_fourthpage, container, false);
        return root;


    }

}

/*viewpager里面装的fragment
 * fragment或者activity*/