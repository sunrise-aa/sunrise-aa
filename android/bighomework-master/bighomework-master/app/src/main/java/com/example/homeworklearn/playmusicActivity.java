package com.example.homeworklearn;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;

/**
 * @ClassName : playmusicActivity
 * @Author : 骆发茂
 * @Date: 2021/4/11 18:32
 * @Description :上面声明，oncreate里面赋值,findViewById要在oncreate里面才可以找到的
 * 有些漏洞，比如说没点击音乐，但按了停止或者暂停，就退出了
 * 还有点击两次停止之后，就退出页面
 * 还比如说，打开了两个音乐（不管是同一个还是两个不同的），都能同时播放，应该判断如果有播放其他的话，之后就不给播放其他的歌了
 * 出现的问题说明及解决：
 * 可以尝试使用数组，把歌曲放入数组中，不用重复写
 * 是因为if的顺序判断问题，所以之后的歌曲会闪退！！
 */
public class playmusicActivity extends Activity {
    /*-------------------------------------------------------------------------*/

    MediaPlayer mediaPlayer_playmusic_first;/*可以播放SD上的资源文件*/
    RadioButton radioButton_first_music;

    /*-------------------------------------------------------------------------*/

    Button button_playmusic_start;
    Button button_playmusic_pause;
    Button button_playmusic_stop;

    /*-------------------------------------------------------------------------*/

    /*-------------------------------------------------------------------------*/


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playmusic);
        System.out.println("-------------------------------------------------");
        /*-------------------------------------------------------------------------------------------------------*/

        radioButton_first_music = (RadioButton) findViewById(R.id.RadioButton_music_first);

        /*-------------------------------------------------------------------------------------------------------*/
        button_playmusic_start = (Button) findViewById(R.id.playvideo_button_start);
        button_playmusic_pause = (Button) findViewById(R.id.playvideo_button_pause);
        button_playmusic_stop = (Button) findViewById(R.id.playvideo_button_stop);
    }

    public void playmusic_start(View view) {
        if (radioButton_first_music.isChecked()) {

            Toast.makeText(playmusicActivity.this, "开始播放音乐", Toast.LENGTH_SHORT).show();
            mediaPlayer_playmusic_first = MediaPlayer.create(playmusicActivity.this, R.raw.jiaojie_first_music);
            mediaPlayer_playmusic_first.start();
        }
        /*-------------------------------------------------------------------------------------------------------*/


    }

    public void playmusic_pause(View view) {
        if (mediaPlayer_playmusic_first.isPlaying()) {
            Toast.makeText(playmusicActivity.this, "暂停播放音乐", Toast.LENGTH_SHORT).show();
            mediaPlayer_playmusic_first.pause();
        } else if (!mediaPlayer_playmusic_first.isPlaying()) {
            Toast.makeText(playmusicActivity.this, "继续播放音乐", Toast.LENGTH_SHORT).show();
            mediaPlayer_playmusic_first.start();
        }
    }

    public void playmusic_stop(View view) {

        if (mediaPlayer_playmusic_first.isPlaying()) {
            Toast.makeText(playmusicActivity.this, "停止播放音乐", Toast.LENGTH_SHORT).show();
            mediaPlayer_playmusic_first.reset();
            mediaPlayer_playmusic_first.release();
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("activityState", "playmusicActivity_onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("activityState", "playmusicActivity_onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("activityState", "playmusicActivity_onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("activityState", "playmusicActivity_onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("activityState", "playmusicActivity_onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("activityState", "playmusicActivity_onDestroy");
    }
}
