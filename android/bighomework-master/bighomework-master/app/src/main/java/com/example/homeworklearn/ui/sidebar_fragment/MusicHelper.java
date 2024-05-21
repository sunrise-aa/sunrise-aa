package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.Toast;

import com.example.homeworklearn.R;

import java.io.IOException;

/**
 * @ClassName : MusicHelper
 * @Author : 骆发茂
 * @Date: 2021/5/11 8:17
 * @Description :
 */
public class MusicHelper {
    private MediaPlayer mediaPlayer;
    private Context context;
    private int musicindex = 0;
    private boolean prepared = false;
    private final int[] musics = new int[]{
            R.raw.jiaojie_first_music,
            R.raw.past_lives
    };

    public MusicHelper(Context context) {
        this.context = context;
        createMediaPlayer();
    }

    public void createMediaPlayer() {
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
    }

    public void play() {
        if (mediaPlayer.isPlaying()) {
            return;
        }
        if (prepared) {
            mediaPlayer.start();
            return;
        }

        try {
              mediaPlayer.setDataSource(context, Uri.parse("android.resource://com.example.homeworklearn/" + musics[musicindex]));
            Toast.makeText(context, "开始播放", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.prepareAsync();//preparation中不允许操作按钮
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                prepared = true;
            }
        });

    }


    public void pause() {
        if (!mediaPlayer.isPlaying()) {
            return;
        }
        mediaPlayer.pause();
    }


    public void next() {
        musicindex = musicindex + 1;
        musicindex = musicindex % musics.length;
        destroy();
        createMediaPlayer();
        play();
    }

    public void destroy() {
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = null;
        prepared = false;
    }


}
