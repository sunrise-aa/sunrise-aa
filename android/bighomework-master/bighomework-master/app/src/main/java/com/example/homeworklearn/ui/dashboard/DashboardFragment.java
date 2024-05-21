package com.example.homeworklearn.ui.dashboard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.homeworklearn.R;
import com.example.homeworklearn.in_dashboard_button_ScreenSlidePagerActivity;
import com.example.homeworklearn.many_buttonActivity;
import com.example.homeworklearn.playmusicActivity;
import com.example.homeworklearn.playvideoActivity;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;


    /*oncreate ,onactivitycreate
     * 最先执行oncreate，oncreateview，onacitivitycreate*/
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /*点击跳转屏幕，将跳转到viewpager2页面*/
        Button button_dashboard_screenslide = requireView().findViewById(R.id.button_dashboard_screenslide);
        button_dashboard_screenslide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "点击跳转屏幕，将跳转到viewpager2页面");
                Intent intent_dashboard_screenslide = new Intent(getActivity(), in_dashboard_button_ScreenSlidePagerActivity.class);
                startActivity(intent_dashboard_screenslide);
            }
        });

        /*点击（播放视频）按钮，将跳转到新的xml里面播放视频，这需要在这里和playvideoActivity进行设置，并且要在Androidmanifest中注册*/
        Button button_dashboard_playvideo = requireView().findViewById(R.id.button_dashboard_playvideo);
        button_dashboard_playvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "播放视频1");
                Intent intent_dashboard_playvideo = new Intent(getActivity(), playvideoActivity.class);
                /*
                *
                *
                *
                *
                *
                * */
                startActivity(intent_dashboard_playvideo);
            }
        });


        /*点击（播放音乐）按钮，将跳转到新的xml里面播放音乐，这需要在这里和playmusicActivity进行设置，并且要在Androidmanifest中注册*/
        Button button_dashboard_playmusic = requireView().findViewById(R.id.button_dashboard_playmusic);
        button_dashboard_playmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "播放音乐");

                Intent intent_dashboard_playmusic = new Intent(getActivity(), playmusicActivity.class);
                startActivity(intent_dashboard_playmusic);
            }
        });



        /*显示intent,点击登录跳转*/
        Button button_dashboard_denglu = requireView().findViewById(R.id.button_denglu);
        button_dashboard_denglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "登录跳转");

                Intent intent_input_info = new Intent(getActivity(),many_buttonActivity.class);

                /*将dashboard里的用户名，密码，验证码传到另一个activity，去接收数据*/
                EditText editText_username = (EditText)requireView().findViewById(R.id.name);
                EditText editText_password = (EditText)requireView().findViewById(R.id.pass);
                EditText editText_yanzhengma = (EditText)requireView().findViewById(R.id.yanzhengma);
                intent_input_info.putExtra("username",editText_username.getText().toString());
                intent_input_info.putExtra("password",editText_password.getText().toString());
                intent_input_info.putExtra("yanzhengma",editText_yanzhengma.getText().toString());
                startActivity(intent_input_info);
            }
        });


        /*显示intent,点击注册跳转*/
        Button button_for_button_zhuce = requireView().findViewById(R.id.button_DASHBOARD_zhuce);
        button_for_button_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "注册跳转");

                Intent intent_button_for_button_zhuce = new Intent(getActivity(), many_buttonActivity.class);

                /*将dashboard里的用户名，密码，验证码传到另一个activity，去接收数据*/
                EditText editText_username = (EditText)requireView().findViewById(R.id.name);
                EditText editText_password = (EditText)requireView().findViewById(R.id.pass);
                EditText editText_yanzhengma = (EditText)requireView().findViewById(R.id.yanzhengma);
                intent_button_for_button_zhuce.putExtra("username",editText_username.getText().toString());
                intent_button_for_button_zhuce.putExtra("password",editText_password.getText().toString());
                intent_button_for_button_zhuce.putExtra("yanzhengma",editText_yanzhengma.getText().toString());
                startActivity(intent_button_for_button_zhuce);
            }
        });



        /*隐式intent，打开浏览器*/
        Button button_for_button_browser = requireView().findViewById(R.id.button_DASHBOARD_browser);
        button_for_button_browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "打开浏览器");

                Uri url_open_browser_baidu = Uri.parse("https://www.bilibili.com");
                Intent intent_button_for_open_browser = new Intent(Intent.ACTION_VIEW,url_open_browser_baidu);
                startActivity(intent_button_for_open_browser);
            }
        });

        /*隐式Intent,打开设置*/
        Button button_for_button_open_secondapp = requireView().findViewById(R.id.button_DASHBOARD_open_secondapp);
        button_for_button_open_secondapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "打开设置");

                Intent intent_button_for_open_secondapp = getActivity().getPackageManager().getLaunchIntentForPackage("com.android.settings");
                startActivity(intent_button_for_open_secondapp);
            }
        });


        /*隐式Intent,打开信息*/
        Log.e("activityState", "打开信息");

        Button button_for_button_open_firstapp = requireView().findViewById(R.id.button_DASHBOARD_open_firstapp);
        button_for_button_open_firstapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_open_firstapp = getActivity().getPackageManager().getLaunchIntentForPackage("com.android.mms");
                startActivity(intent_button_for_open_firstapp);
            }
        });





    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        // final TextView textView = root.findViewById(R.id.text_dashboard);
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });



        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        return root;
    }


}