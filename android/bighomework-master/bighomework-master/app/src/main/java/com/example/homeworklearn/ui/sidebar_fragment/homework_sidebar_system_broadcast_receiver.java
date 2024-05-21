package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

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
public class homework_sidebar_system_broadcast_receiver extends Fragment {
    private system_broadcast_networkbroadcastreceiver networkbroadcastreceiver = new system_broadcast_networkbroadcastreceiver();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homework_sidebar_system_broadcast_receiver, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        getActivity().registerReceiver(networkbroadcastreceiver, intentFilter);
        Toast toast = Toast.makeText(getContext(), "打开此页面，我将为你显示当前网络状态", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        getActivity().unregisterReceiver(networkbroadcastreceiver);
    }
}
