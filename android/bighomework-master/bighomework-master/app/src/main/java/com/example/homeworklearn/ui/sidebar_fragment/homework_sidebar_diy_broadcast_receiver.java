package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homeworklearn.R;

/**
 * @ClassName : homework_sidebar_system_broadcast_receiver
 * @Author : 骆发茂
 * @Date: 2021/5/9 10:19
 * @Description :
 */
public class homework_sidebar_diy_broadcast_receiver extends Fragment {

    diy_broadcast_receiveer diy_broadcast_BroadcastReceiver = new diy_broadcast_receiveer();
    String CUSTOM_ACTION = "com.example.homeworklearn.ui.sidebar_fragment.diy_broadcast_receiveer";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homework_sidebar_diy_broadcast_receiver, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(CUSTOM_ACTION);
        getActivity().registerReceiver(diy_broadcast_BroadcastReceiver,intentFilter);

        Button button_DIY_getbroadcast = getActivity().findViewById(R.id.homework_sidebar_diy_broadcast_receiver_firstbutton);
        button_DIY_getbroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText broadcastMsgEditText = getActivity().findViewById(R.id.homework_sidebar_diy_broadcast_receiver_editText);
                String msg = broadcastMsgEditText.getText().toString();
                Intent intent = new Intent();
                intent.setAction(CUSTOM_ACTION);
                intent.putExtra("msg",msg);
                getActivity().sendBroadcast(intent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
