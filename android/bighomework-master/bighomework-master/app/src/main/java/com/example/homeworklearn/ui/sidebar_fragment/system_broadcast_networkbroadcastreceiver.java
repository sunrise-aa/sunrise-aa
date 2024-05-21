package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * @ClassName : system_broadcast_networkbroadcastreceiver
 * @Author : 骆发茂
 * @Date: 2021/5/17 8:48
 * @Description :
 */
public class system_broadcast_networkbroadcastreceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"当前网络为："+system_broadcast_networkUtil.getNetworkStatus(context),Toast.LENGTH_SHORT).show();
    }
}
