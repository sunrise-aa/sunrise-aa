package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homeworklearn.R;

public class homework_sidebar_bindservice extends Fragment {

    MediaPlayer mediaPlayer_playmusic_first;/*可以播放SD上的资源文件*/
    MyConn myConn;

    /**调用bindService之后，客户端端连上Service
     触发MyConn类的onServiceConnected方法，获取Binder对象
     之后可以Binder对象和Service交互（播放、暂停、下一首）
     */
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(getContext(),"一打开这个页面就会自动播放音乐",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getActivity(), bindService.class);
        getActivity().startService(intent);

        //bindservice
        if (myConn ==null){
            myConn = new MyConn();
            intent = new Intent(getActivity(),bindService.class);
            getActivity().bindService(intent,myConn,0);

        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homework_sidebar_bindservice, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button_pause = getActivity().findViewById(R.id.homework_sidebar_bindservice_pause);
        button_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myConn.myBinder==null){
                    return;
                }
                myConn.myBinder.pause();
            }
        });
        Button button_start = getActivity().findViewById(R.id.homework_sidebar_bindservice_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myConn.myBinder==null){
                    return;
                }
            myConn.myBinder.play();
            }
        });
        Button button_lastsong = getActivity().findViewById(R.id.homework_sidebar_bindservice_lastsong);
        button_lastsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                       Toast.makeText(getContext(),"上一首",Toast.LENGTH_SHORT).show();
                if (myConn.myBinder==null){
                    return;
                }
                myConn.myBinder.next();
            }
        });
        Button button_nextsong = getActivity().findViewById(R.id.homework_sidebar_bindservice_nextsong);
        button_nextsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"下一首",Toast.LENGTH_SHORT).show();

                if (myConn.myBinder==null){
                    return;
                }
                myConn.myBinder.next();
            }
        });
    }


}
