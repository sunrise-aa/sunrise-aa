package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * @ClassName : diy_broadcast_receiveer
 * @Author : 骆发茂
 * @Date: 2021/5/17 9:20
 * @Description :
 */
public class diy_broadcast_receiveer extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,intent.getStringExtra("msg"),Toast.LENGTH_SHORT).show();
        Log.e("activityState", "diy_broadcast_receiveer");

    }
}
