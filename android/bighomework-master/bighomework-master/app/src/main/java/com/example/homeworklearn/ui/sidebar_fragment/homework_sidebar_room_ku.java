package com.example.homeworklearn.ui.sidebar_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homeworklearn.R;

import java.util.List;

/**
 * @ClassName : homework_sidebar_room_ku
 * @Author : 骆发茂
 * @Date: 2021/5/6 20:22
 * @Description :
 */
public class homework_sidebar_room_ku extends Fragment {
    private String FILE_NAME;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button btn_add = getActivity().findViewById(R.id.btn_room_ku_add);
        Button btn_lower_18 = getActivity().findViewById(R.id.btn_room_ku_lower_18);
        // Button btn_create_db = getActivity().findViewById(R.id.btn_room_ku_db);
        EditText username = getActivity().findViewById(R.id.room_ku_name);
        EditText age = getActivity().findViewById(R.id.room_ku_age);
        EditText id = getActivity().findViewById(R.id.room_ku_id);
        TextView room_ku_show_TextView = getActivity().findViewById(R.id.room_ku_TextView);

        /*---------------------------------------添加-------------------------------------------------*/
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                room_ku_DataBase db = room_ku_DataBase.getInstance(getActivity());
                room_ku_user user = new room_ku_user();
/*                SharedPreferences getsettings = getActivity().getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
                String username = getsettings.getString("username", "");
                String age = getsettings.getString("age", "");
                String id = getsettings.getString("id", "");*/
                String string_username = username.getText().toString();
                String string_age = age.getText().toString();
                long long_id = Long.parseLong(id.getText().toString());
                String msg = long_id == -1 ? "添加失败" : "添加成功";
                Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
                user.username = string_username;
                user.age = string_age;
                user.id = long_id;
                db.userdao().insert(user);
                db.close();
            }

        });
        /*---------------------------------------添加-------------------------------------------------*/




        /*---------------------------------------小于18-------------------------------------------------*/

        btn_lower_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                room_ku_DataBase db = room_ku_DataBase.getInstance(getActivity());
                List<room_ku_user> room_ku_users = db.userdao().searchUsersByAge(18);
                StringBuilder stringBuilder = new StringBuilder();
                for (room_ku_user user : room_ku_users) {
                    stringBuilder.append("id: ").append(user.id)
                            .append("  username: ").append(user.username)
                            .append("  age: ").append(user.age)
                            .append("\n");
                    System.out.println("=================" + id);
                    System.out.println("=================" + username);
                    System.out.println("=================" + age);

                }
                room_ku_show_TextView.setText(stringBuilder.toString());


            }
        });
    }

    /*---------------------------------------小于18-------------------------------------------------*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homework_sidebar_room_ku, container, false);
    }
}
