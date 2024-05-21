package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/**
 * @ClassName : homework_sidebar_service
 * @Author : 骆发茂
 * @Date: 2021/5/9 10:34
 * @Description :
 */



public class MyConn implements ServiceConnection {
    public bindService.MyBinder myBinder = null;
    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        myBinder = (bindService.MyBinder) service;
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {

    }
}


