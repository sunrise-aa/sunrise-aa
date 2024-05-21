package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.Context;
import android.content.SharedPreferences;
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

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * @ClassName : homework_sidebar_sharedpreferences_fragment
 * @Author : 骆发茂
 * @Date: 2021/4/27 8:17
 * @Description :
 */
public class homework_sidebar_sharedpreferences_fragment extends Fragment {
    private String FILE_NAME;
    private EditText nameEditText;
    private EditText numEditText;
    private EditText classEditText;
    private Button duqu;
    private Button denglu;
    public static final String KEY_SHA = "SHA";


    public static String getResult(String inputStr) {
        BigInteger sha = null;
        System.out.println("=======加密前的数据:" + inputStr);
        byte[] inputData = inputStr.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
            messageDigest.update(inputData);
            sha = new BigInteger(messageDigest.digest());
            System.out.println("SHA加密后:" + sha.toString(32));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sha.toString(32);
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        nameEditText = getActivity().findViewById(R.id.sharedpreferences_name);
        numEditText = getActivity().findViewById(R.id.sharedpreferences_xuehao);
        classEditText = getActivity().findViewById(R.id.sharedpreferences_class);


        denglu = getActivity().findViewById(R.id.btn_login);
        denglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getActivity().getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("name", nameEditText.getText().toString());
                editor.putString("num", numEditText.getText().toString());
                editor.putString("class", classEditText.getText().toString());
                editor.commit();
            }
        });



        duqu = getActivity().findViewById(R.id.btn_duqu);
        duqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences getsettings = getActivity().getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
                String name = getsettings.getString("name", "");
                String num = getsettings.getString("num", "");
                String classname = getsettings.getString("class", "");

                nameEditText.setText(name);
                numEditText.setText(getResult(num));
                classEditText.setText(classname);
            }
        });

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homework_sidebar_sharedpreferences, container, false);
    }

}
