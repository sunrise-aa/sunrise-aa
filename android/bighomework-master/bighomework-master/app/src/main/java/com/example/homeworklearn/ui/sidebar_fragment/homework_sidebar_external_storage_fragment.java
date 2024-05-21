package com.example.homeworklearn.ui.sidebar_fragment;

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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @ClassName : homework_sidebar_external_storage_fragment
 * @Author : 骆发茂
 * @Date: 2021/4/27 8:16
 * @Description :
 */
public class homework_sidebar_external_storage_fragment extends Fragment {
    private Button button_hw_es_External_storage_write;
    private Button button_hw_es_Read_file_content;
    public String external_storage_FILE_NAME;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        external_storage_FILE_NAME  ="/sdcard/Android/data/com.example.homeworklearn/files/external.txt";
        super.onActivityCreated(savedInstanceState);
        button_hw_es_External_storage_write = getActivity().findViewById(R.id.hw_es_External_storage_write);
        button_hw_es_Read_file_content = getActivity().findViewById(R.id.hw_es_Read_file_content);

        button_hw_es_External_storage_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File externalPath = getActivity().getExternalFilesDir(null);
         //       File file = new File(externalPath, external_storage_FILE_NAME);
                File file = new File(external_storage_FILE_NAME);
                try {
                    FileOutputStream external_storage_FileOutputStream = new FileOutputStream(file);
                    BufferedWriter external_storage_BufferedWriter = new BufferedWriter(new OutputStreamWriter(external_storage_FileOutputStream));
                    try {
                        external_storage_BufferedWriter.write("insert message by luofamao from external_storage_write");
                        System.out.println("external_storage_BufferedWriter.write(\"insert message by luofamao from external_storage_write\");成功");

                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("external_storage_BufferedWriter.write(\"insert message by luofamao from external_storage_write\");失败");
                    }
                    try {
                        external_storage_BufferedWriter.close();
                        System.out.println("external_storage_BufferedWriter.close();成功");

                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("external_storage_BufferedWriter.close();失败");
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("外部数据写入不成功 unsuccessful!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }

            }
        });


        button_hw_es_Read_file_content = getActivity().findViewById(R.id.hw_es_Read_file_content);
        button_hw_es_Read_file_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File externalPath = getActivity().getExternalFilesDir(null);
                //File file = new File(externalPath,external_storage_FILE_NAME);
                File file = new File(external_storage_FILE_NAME);
                try {
                    FileInputStream hw_es_Read_file_FileInputStream = new FileInputStream((file));
                    BufferedReader hw_es_Read_file_BufferedReader = new BufferedReader(new InputStreamReader(hw_es_Read_file_FileInputStream));
                    String line = null;
                    try {
                        line = hw_es_Read_file_BufferedReader.readLine();
                        System.out.println("line = hw_es_Read_file_BufferedReader.readLine();成功");
                        System.out.println("====================================读取到的内容为："+line);
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("line = hw_es_Read_file_BufferedReader.readLine();失败");
                    }
                    Toast.makeText(getContext(),line,Toast.LENGTH_SHORT).show();
                    try {
                        hw_es_Read_file_FileInputStream.close();
                        System.out.println("hw_es_Read_file_FileInputStream.close();成功");
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("hw_es_Read_file_FileInputStream.close();失败");

                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("外部数据读取不成功 unsuccessful!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                }


            }
        });


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homework_sidebar_external_storage, container, false);
    }
}
