package com.example.homeworklearn;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @ClassName : SiderbarActivity
 * @Author : 骆发茂
 * @Date: 2021/4/23 19:39
 * @Description :
 */
public class SiderbarActivity extends AppCompatActivity {
/*    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sidebar_main_activity);




//        Toolbar toolbar = findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });




        DrawerLayout drawer = findViewById(R.id.sidebar_main_activity);
        NavigationView navigationView = findViewById(R.id.nav_sidebar_NavigationView);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.



        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.include_in_main_interface_middle_design_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.slide_menu_drawer, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.include_in_main_interface_middle_design_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }*/
}
