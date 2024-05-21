package com.example.homeworklearn;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homeworklearn.ui.newworldtwo.newworldtwo_mainactivity;

/**
 * @ClassName : new_world_java
 * @Author : 骆发茂
 * @Date: 2021/5/17 23:59
 * @Description :
 */
public class new_world_java extends AppCompatActivity {

    private Button button_new_world_first;
    private Button button_new_world_second;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_world);
        button_new_world_first = findViewById(R.id.new_world_first);
        button_new_world_second = findViewById(R.id.new_world_second);

        button_new_world_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new_world_java.this, MainActivity.class);
                Toast.makeText(new_world_java.this, "这里是旧世界", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        button_new_world_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new_world_java.this, newworldtwo_mainactivity.class);
                Toast.makeText(new_world_java.this, "这里是新世界", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("activityState", "new_world_onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("activityState", "new_world_onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("activityState", "new_world_onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("activityState", "new_world_onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("activityState", "new_world_onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("activityState", "new_world_onDestroy");
    }
}
