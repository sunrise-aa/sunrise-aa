package com.example.homeworklearn.ui.newworldtwo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homeworklearn.R;

/**
 * @ClassName : newworldtwo_mainactivity
 * @Author : 骆发茂
 * @Date: 2021/5/18 7:54
 * @Description :
 */
public class newworldtwo_mainactivity extends AppCompatActivity {

    private boolean isMute;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e("activityState", "开始游戏");

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.newworldtwo_activity_main);

        findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(newworldtwo_mainactivity.this, GameActivity.class));
                Toast.makeText(newworldtwo_mainactivity.this, "开始游戏", Toast.LENGTH_SHORT).show();

            }
        });

        TextView highScoreTxt = findViewById(R.id.highScoreTxt);

        final SharedPreferences prefs = getSharedPreferences("game", MODE_PRIVATE);
        highScoreTxt.setText("HighScore: " + prefs.getInt("highscore", 0));

        isMute = prefs.getBoolean("isMute", false);

        final ImageView volumeCtrl = findViewById(R.id.volumeCtrl);

        if (isMute)
            volumeCtrl.setImageResource(R.drawable.ic_volume_off_black_24dp);
        else
            volumeCtrl.setImageResource(R.drawable.ic_volume_up_black_24dp);

        volumeCtrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                isMute = !isMute;
                if (isMute)
                    volumeCtrl.setImageResource(R.drawable.ic_volume_off_black_24dp);
                else
                    volumeCtrl.setImageResource(R.drawable.ic_volume_up_black_24dp);

                SharedPreferences.Editor editor = prefs.edit();
                editor.putBoolean("isMute", isMute);
                editor.apply();

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("activityState", "newworldtwo_mainactivity_onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("activityState", "newworldtwo_mainactivity_onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("activityState", "newworldtwo_mainactivity_onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("activityState", "newworldtwo_mainactivity_onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("activityState", "newworldtwo_mainactivity_onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("activityState", "newworldtwo_mainactivity_onDestroy");
    }
}
