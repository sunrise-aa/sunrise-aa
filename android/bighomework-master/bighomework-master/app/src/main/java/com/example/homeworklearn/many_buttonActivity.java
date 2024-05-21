package com.example.homeworklearn;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @ClassName : second_MainActivity
 * @Author : 骆发茂
 * @Date: 2021/4/6 8:32
 * @Description :
 * 注意，布局xml文件之后，那些button之类的跳转是要在activity下面编写的，比如在DASHBOARD里面写了几个按钮药进行跳转，就在DASHBOARDFRAGMENT
 * 里面写，因为public class DashboardFragment extends Fragment
 *
 * 总结：上面写的可能乱，主要结束button在哪个布局fragment或者activity里面，就把代码写在哪个布局fragment或者activity里面
 * 这个项目我就在DashboardFragment和many_buttonActivity里面写了button要进行跳转的代码内容
 *
 *
 *
 * 2.Activity/ActionBarActivity/AppCompatActivity的区别：
 * 在开始讲解创建Activity之前要说下这三个的一个区别：
 * Activity就不用说啦，后面这两个都是为了低版本兼容而提出的提出来的，
 * 他们都在v7包下， ActionBarActivity已被废弃，从名字就知道，ActionBar~，
 * 而在5.0后，被Google弃用了，现在用 ToolBar...而我们现在在Android Studio创建一个Activity默认继承的会是
 * ：AppCompatActivity! 当然你也可以只写Activity，不过AppCompatActivity给我们提供了一些新的东西而已！
 * 两个选一个，Just you like~
 */
public class many_buttonActivity extends Activity {


/*在代码中获取控件，实例化*/
    private Button button_for_button_zhuce;
    private Button button_for_button_browser;
    private Button button_for_button_open_firstapp;
    private Button button_for_button_open_secondapp;

    /*----------------------------------------------------------*/

    private Button button_for_button_open_wechat;
    private Button button_for_button_open_zhifubao;
    private Button button_for_button_open_eleme;
    private Button button_for_button_open_meituanwaimai;
    private Button button_for_button_open_baiduditu;

    /*----------------------------------------------------------*/




    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.many_button_activity);




        /*显示intent，点击注册之后*/
/*        button_for_button_zhuce = findViewById(R.id.button_many_button_activity_browser);
        button_for_button_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_button_zhuce = new Intent(many_buttonActivity.this,many_buttonActivity.class);
                startActivity(intent_button_for_button_zhuce);
            }
        });*/


        /*隐式intent，搜索B站*/
        button_for_button_browser = findViewById(R.id.button_many_button_activity_browser);
        button_for_button_browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri url_open_browser_baidu = Uri.parse("https://www.bilibili.com");
                Intent intent_button_for_open_browser = new Intent(Intent.ACTION_VIEW,url_open_browser_baidu);
                startActivity(intent_button_for_open_browser);
            }
        });


        /*隐式Intent,打开信息*/
        button_for_button_open_firstapp = findViewById(R.id.button_many_button_activity_open_firstapp);
        button_for_button_open_firstapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_open_firstapp = getPackageManager().getLaunchIntentForPackage("com.android.mms");
                startActivity(intent_button_for_open_firstapp);
            }
        });

        /*隐式Intent,打开设置*/
        button_for_button_open_secondapp = findViewById(R.id.button_many_button_activity_open_secondapp);
        button_for_button_open_secondapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_open_secondapp = getPackageManager().getLaunchIntentForPackage("com.android.settings");
                startActivity(intent_button_for_open_secondapp);
            }
        });

/*-----------------------------------------------------------------------------------------------------------*/
        /*隐式Intent,打开wechat*/
        button_for_button_open_wechat = findViewById(R.id.button_many_button_activity_open_wechat);
        button_for_button_open_wechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_open_wechat = getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
                startActivity(intent_button_for_open_wechat);
            }
        });


        /*隐式Intent,打开zhifubao*/
        button_for_button_open_zhifubao = findViewById(R.id.button_many_button_activity_open_zhifubao);
        button_for_button_open_zhifubao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_open_zhifubao = getPackageManager().getLaunchIntentForPackage("com.eg.android.AlipayGphone");
                startActivity(intent_button_for_open_zhifubao);
            }
        });


        /*隐式Intent,打开eleme*/
        button_for_button_open_eleme = findViewById(R.id.button_many_button_activity_open_eleme);
        button_for_button_open_eleme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_open_eleme = getPackageManager().getLaunchIntentForPackage("me.ele");
                startActivity(intent_button_for_open_eleme);
            }
        });


        /*隐式Intent,打开meituanwaimai*/
        button_for_button_open_meituanwaimai = findViewById(R.id.button_many_button_activity_open_meituanwaimai);
        button_for_button_open_meituanwaimai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_open_meituanwaimai = getPackageManager().getLaunchIntentForPackage("com.sankuai.meituan.takeoutnew");
                startActivity(intent_button_for_open_meituanwaimai);
            }
        });


        /*隐式Intent,打开baiduditu*/
        button_for_button_open_baiduditu = findViewById(R.id.button_many_button_activity_open_baiduditu);
        button_for_button_open_baiduditu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_open_baiduditu = getPackageManager().getLaunchIntentForPackage("com.baidu.BaiduMap");
                startActivity(intent_button_for_open_baiduditu);
            }
        });

        /*    private TextView textView_show_username = findViewById(R.id.name);*/
        Intent intent_get_inf =getIntent();
        String string_username = intent_get_inf.getStringExtra("username");
        String string_password = intent_get_inf.getStringExtra("password");
        String string_yanzhengma = intent_get_inf.getStringExtra("yanzhengma");
        TextView usernameTV = (TextView)findViewById(R.id.usr);
        TextView passwordTV = (TextView)findViewById(R.id.pwd);
        TextView yanzhengmaTV = (TextView)findViewById(R.id.yzm);
        usernameTV.setText("username is:"+string_username);
        passwordTV.setText("password is:"+string_password);
        yanzhengmaTV.setText("Verification Code is:"+string_yanzhengma);

    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.e("activityState","many_buttonActivity_onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("activityState","many_buttonActivity_onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("activityState","many_buttonActivity_onPause");
    }


    @Override
    protected void onStop(){
        super.onStop();
        Log.e("activityState","many_buttonActivity_onStop");
    }


    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("activityState","many_buttonActivity_onRestart");
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("activityState","many_buttonActivity_onDestroy");
    }
}
