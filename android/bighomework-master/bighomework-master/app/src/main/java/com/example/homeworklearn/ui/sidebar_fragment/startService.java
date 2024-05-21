package com.example.homeworklearn.ui.sidebar_fragment;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * onCreate时创建MusicHelper对象
 * onDestroy时销毁MusicHelper对象
 * onStartCommand时，播放音乐
 */
public class startService extends Service {

    private MusicHelper musicHelper = null;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        musicHelper = new MusicHelper(this);
        System.out.println("startService is onCreate!");

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        musicHelper.destroy();
        musicHelper = null;

        System.out.println("startService is Destroyed!");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("startService is onStartCommand!");
        musicHelper.play();
        return super.onStartCommand(intent, flags, startId);
    }


}