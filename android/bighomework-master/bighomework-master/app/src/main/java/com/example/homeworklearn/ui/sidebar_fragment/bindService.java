package com.example.homeworklearn.ui.sidebar_fragment;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class bindService extends Service {
    private MusicHelper musicHelper = null;

    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        musicHelper = new MusicHelper(this);
        Log.e("activityState", "service create");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        musicHelper.destroy();
        musicHelper = null;
        Log.e("activityState", "service destroy");

    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        musicHelper.play();
        Log.e("activityState", "service onStartCommand");

        return super.onStartCommand(intent, flags, startId);

    }


    public class MyBinder extends Binder {
        private bindService service;

        public MyBinder(bindService service) {
            this.service = service;
        }

        public void play() {
            service.musicHelper.play();
            Log.e("activityState", "Binder play");

        }

        public void next() {
            service.musicHelper.next();
            Log.e("activityState", "Binder next");

        }

        public void pause() {
            service.musicHelper.pause();
            Log.e("activityState", "Binder pause");

        }

        public void destroy() {
            service.musicHelper.destroy();
            Log.e("activityState", "Binder destroy");

        }
    }


}