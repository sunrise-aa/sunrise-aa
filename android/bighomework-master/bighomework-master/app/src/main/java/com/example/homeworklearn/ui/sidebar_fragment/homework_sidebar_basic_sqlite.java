package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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

import com.example.homeworklearn.DbHelper;
import com.example.homeworklearn.R;

/**
 * @ClassName : homework_sidebar_basic_sqlite
 * @Author : 骆发茂
 * @Date: 2021/5/6 20:22
 * @Description :
 */
public class homework_sidebar_basic_sqlite extends Fragment {


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        /**dbHelper为之前创建的DbHelper类的对象
         db = dbHelper.getWritableDatabase()获取可写的对象
         db.insert()插入数据
         */
        TextView textView = getActivity().findViewById(R.id.basic_sqlite_TextView);
        DbHelper dbHelper = new DbHelper(getContext(), "basicsqlite.db", null, 1);

        EditText username = getActivity().findViewById(R.id.basic_sqlite_name);
        EditText age = getActivity().findViewById(R.id.basic_sqlite_age);
        EditText id = getActivity().findViewById(R.id.basic_sqlite_id);


        Button basic_sqlite_create_db = getActivity().findViewById(R.id.btn_basic_sqlite_create_db);
        basic_sqlite_create_db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.getWritableDatabase();
                System.out.println("=========basic_sqlite_create_db已执行============");
            }

        });



        /*---------------------------------------添加-------------------------------------------------*/


        Button btn_sqlite_create_add = getActivity().findViewById(R.id.btn_sqlite_create_add);
        btn_sqlite_create_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase add_db = dbHelper.getWritableDatabase();
                ContentValues add_values = new ContentValues();
                String string_username = username.getText().toString();
                String string_age = age.getText().toString();
                long long_id = Long.parseLong(id.getText().toString());
                add_values.put("username", string_username);
                add_values.put("age", string_age);
                add_values.put("id", long_id);
                long add_users = add_db.insert("users", null, add_values);
                String msg = add_users == -1 ? "添加失败" : "添加成功";
                Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
                dbHelper.close();
            }
        });

        /*---------------------------------------添加-------------------------------------------------*/



        /*---------------------------------------小于18-------------------------------------------------*/

        /**
         * db = dbHelper.getReadableDatabase()获取可读的对象
         * db.query查询所有数据，selection传null
         * cursor.moveToNext将游标指向下一行数据：下一行有数据时返回true，否则返回false
         * cursor.getString/getInt/getLong等方法获取数据
         * cursor.getColumnIndex通过列名获取列序号*/
        Button btn_sqlite_create_lower_18 = getActivity().findViewById(R.id.btn_sqlite_create_lower_18);
        btn_sqlite_create_lower_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase Query_db_lower_18 = dbHelper.getReadableDatabase();
                StringBuilder stringBuilder = new StringBuilder();
                Cursor cursor = Query_db_lower_18.query("users", null, "age<18", null, null, null, null);
                System.out.println("===========btn_sqlite_create_lower_18往下测试中============");
                while (cursor.moveToNext()) {
                    long id = cursor.getLong(cursor.getColumnIndex("id"));
                    String username = cursor.getString(cursor.getColumnIndex("username"));
                    int age = cursor.getInt(cursor.getColumnIndex("age"));
                    System.out.println("=================" + id);
                    System.out.println("=================" + username);
                    System.out.println("=================" + age);
                    stringBuilder.append("id: ").append(id)
                            .append("  username: ").append(username)
                            .append("  age: ").append(age)
                            .append("\n");
                }
                textView.setText(stringBuilder.toString());

                // cursor.close();

            }
        });
        /*---------------------------------------小于18-------------------------------------------------*/


    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homework_sidebar_basic_sqlite, container, false);
    }
}
