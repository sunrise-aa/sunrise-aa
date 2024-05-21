package com.example.homeworklearn;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

/*    private Button button_for_button_zhuce;
    private Button button_for_button_browser;
    private Button button_for_button_open_firstapp;
    private Button button_for_button_open_secondapp;*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications,R.id.navigation_message)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
       //  NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


        /*隐式intent，打开浏览器*/
  /*      button_for_button_browser = findViewById(R.id.button_browser);
        button_for_button_browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri url_open_browser_baidu = Uri.parse("http://www.baidu.com");
                Intent intent_button_for_open_browser = new Intent(Intent.ACTION_VIEW,url_open_browser_baidu);
                startActivity(intent_button_for_open_browser);
            }
        });


        *//*隐式Intent,打开firstAPP*//*
        button_for_button_open_firstapp = findViewById(R.id.button_open_firstapp);
        button_for_button_open_firstapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_open_firstapp = getPackageManager().getLaunchIntentForPackage("com.android.mms");
                startActivity(intent_button_for_open_firstapp);
            }
        });

        *//*隐式Intent,打开secondAPP*//*
        button_for_button_open_secondapp = findViewById(R.id.button_open_secondapp);
        button_for_button_open_secondapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_button_for_open_secondapp = getPackageManager().getLaunchIntentForPackage("com.android.settings");
                startActivity(intent_button_for_open_secondapp);
            }
        });
*/

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("activityState", "MainActivity_onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("activityState", "MainActivity_onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("activityState", "MainActivity_onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("activityState", "MainActivity_onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("activityState", "MainActivity_onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("activityState", "MainActivity_onDestroy");
    }
}

