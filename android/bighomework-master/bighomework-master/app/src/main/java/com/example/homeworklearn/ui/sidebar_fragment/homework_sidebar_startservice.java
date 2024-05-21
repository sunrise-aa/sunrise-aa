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

/**
 * @ClassName : homework_sidebar_service
 * @Author : 骆发茂
 * @Date: 2021/5/9 10:34
 * @Description :
 */
public class homework_sidebar_startservice extends Fragment {
    MediaPlayer mediaPlayer_playmusic_first;/*可以播放SD上的资源文件*/
    MyConn myConn;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homework_sidebar_startservice, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button_stop = getActivity().findViewById(R.id.homework_sidebar_startservice_stop);
        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "stop", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), startService.class);
                getActivity().stopService(intent);
            }
        });
        Button button_start = getActivity().findViewById(R.id.homework_sidebar_startservice_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "start", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), startService.class);
                getActivity().startService(intent);
            }
        });
/*        Button button_lastsong = getActivity().findViewById(R.id.homework_sidebar_startservice_lastsong);
        button_lastsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //       Toast.makeText(getContext(),"button_lastsong",Toast.LENGTH_SHORT).show();
                if (myConn.myBinder == null) {
                    return;
                }
                myConn.myBinder.next();
            }
        });
        Button button_nextsong = getActivity().findViewById(R.id.homework_sidebar_startservice_nextsong);
        button_nextsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Toast.makeText(getContext(),"button_nextsong",Toast.LENGTH_SHORT).show();
                if (myConn.myBinder == null) {
                    return;
                }
                myConn.myBinder.next();
            }
        });*/
    }
}
