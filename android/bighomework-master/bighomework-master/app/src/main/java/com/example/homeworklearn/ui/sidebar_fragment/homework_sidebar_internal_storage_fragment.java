package com.example.homeworklearn.ui.sidebar_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homeworklearn.R;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @ClassName : homework_sidebar_internal_storage_fragment
 * @Author : 骆发茂
 * @Date: 2021/4/27 8:17
 * @Description :
 */
public class homework_sidebar_internal_storage_fragment extends Fragment {
    private Button button_hw_is_internal_storage_write;
    private Button button_hw_is_Read_file_content;
    public String internal_storage_FILE_NAME ;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        internal_storage_FILE_NAME= "/data/data/com.example.homeworklearn/databases/internal.txt";
        super.onActivityCreated(savedInstanceState);
        button_hw_is_internal_storage_write = getActivity().findViewById(R.id.hw_is_internal_storage_write);
        button_hw_is_Read_file_content = getActivity().findViewById(R.id.hw_is_Read_file_content);

        button_hw_is_internal_storage_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
/*????*/                    FileOutputStream internal_storage_write_FileOutputStream = new FileOutputStream(internal_storage_FILE_NAME);
                            //getActivity().openFileOutput(internal_storage_FILE_NAME, Context.MODE_PRIVATE);

                    BufferedWriter internal_storage_write_BufferedWriter = new BufferedWriter(new OutputStreamWriter(internal_storage_write_FileOutputStream));
                    try {
                        internal_storage_write_BufferedWriter.write("insert message by luofamao from internal_storage_write");
                        System.out.println("internal_storage_write_BufferedWriter.write(\"insert message by luofamao from internal_storage_write\");成功");
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("internal_storage_write_BufferedWriter.write(\"insert message by luofamao from internal_storage_write\");失败");
                    }
                    try {
                        internal_storage_write_BufferedWriter.close();
                        System.out.println("internal_storage_write_BufferedWriter.close();成功");
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("internal_storage_write_BufferedWriter.close unsuccessful!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("internal_storage_write_BufferedWriter.close();失败");


                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("内部数据写入不成功 unsuccessful!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }
            }
        });


        button_hw_is_Read_file_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                  /*????*/  FileInputStream is_Read_file_content_FileInputStream = new FileInputStream(internal_storage_FILE_NAME);
                            //getActivity().openFileInput(internal_storage_FILE_NAME);
                    BufferedReader is_Read_file_content_BufferedReader = new BufferedReader(new InputStreamReader(is_Read_file_content_FileInputStream));
                    String line = null;
                    try {
                        line = is_Read_file_content_BufferedReader.readLine();
                        System.out.println("line = is_Read_file_content_BufferedReader.readLine();成功");
                        System.out.println("====================================读取到的内容为："+line);

                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("is_Read_file_content_BufferedReader.readLine不成功 unsuccessful!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("line = is_Read_file_content_BufferedReader.readLine();失败");


                    }
               //     Toast.makeText(getContext(), line, Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("内部数据读取不成功 unsuccessful!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                }

            }
        });


    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homework_sidebar_internal_storage, container, false);
    }
}
