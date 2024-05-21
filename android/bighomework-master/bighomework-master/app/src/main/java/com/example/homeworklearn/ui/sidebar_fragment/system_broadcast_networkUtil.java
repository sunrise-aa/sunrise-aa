package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * @ClassName : system_broadcast_networkUtil
 * @Author : 骆发茂
 * @Date: 2021/5/17 8:49
 * @Description :
 */
public class system_broadcast_networkUtil {
    static public String getNetworkStatus(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
/*        if (networkInfo == null || networkInfo.isConnected()) {
            return "无网络";
        }*/
        if (networkInfo == null ) {
            return "无网络";
        }

        switch (networkInfo.getType()) {
            case ConnectivityManager.TYPE_WIFI:
                return "WIFI";
            case ConnectivityManager.TYPE_MOBILE:
                return "移动网络";
            default:
               return  "未知网络";

        }
    }
}
