package com.example.homeworklearn.ui.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * @ClassName : dynamic_Myreceiver
 * @Author : 骆发茂
 * @Date: 2021/4/16 10:33
 * @Description :
 */
public class dynamic_Myreceiver extends BroadcastReceiver {


    public static void setDynamic_interface(Dynamic_interface dynamic_interface) {
        dynamic_Myreceiver.dynamic_interface = dynamic_interface;
    }



    public interface Dynamic_interface{
        void set_dynamic_message();
    }

    static Dynamic_interface dynamic_interface;



    @Override
    public void onReceive(Context context, Intent intent) {
        //Toast.makeText(context, "动态广播发送成功", Toast.LENGTH_SHORT).show();
        System.out.println("==================这里是dynamic_Myreceiver，测试是否开启！=====================================");
        Log.e("activityState", "dynamic_Myreceiver，测试是否开启");

        String dynamic_info =intent.getStringExtra("dynamic_msg");
        Log.i(intent.getAction(), dynamic_info);
        Toast.makeText(context,"这里是dynamic_Myreceiver，收到动态广播了~",Toast.LENGTH_LONG).show();
        dynamic_interface.set_dynamic_message();

    }
}


