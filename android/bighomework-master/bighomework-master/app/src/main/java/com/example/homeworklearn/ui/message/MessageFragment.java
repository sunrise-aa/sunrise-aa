package com.example.homeworklearn.ui.message;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.homeworklearn.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;


/**
 * @ClassName : MessageFragment
 * @Author : 骆发茂
 * @Date: 2021/4/22 21:08
 * @Description :onviewcreate比onactivity   前发生
 */
public class MessageFragment extends Fragment {
    /*获取组件，声明变量*/

    public MessageViewModel messageViewModel;
    public AppBarConfiguration mAppBarConfiguration;
    public NavHostFragment navHostFragment;
    public NavController navController;
    public DrawerLayout drawerLayout;

    public NavigationView navigationView;
    public ActionBarDrawerToggle actionBarDrawerToggle;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //来指出fragment愿意添加item到选项菜单(否则, fragment将接收不到对 onCreateOptionsMenu()的调用)
        setHasOptionsMenu(true);
    }



    /*---------------------------------actionbar右边，配套的menu-------------------------------------------------------*/

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.slide_menu_drawer, menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.e("activityState", "actionbar右边，配套的menu");

        switch (item.getItemId()) {

            case R.id.nav_home:
                System.out.println("nav_home");
                Toast.makeText(getContext(), "nav_home,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_gallery:
                System.out.println("nav_gallery");
                Toast.makeText(getContext(), "nav_gallery,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_slideshow:
                System.out.println("nav_slideshow");
                Toast.makeText(getContext(), "nav_slideshow,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_homework_sidebar_external_storage:
                Toast.makeText(getContext(), "external_storage,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_homework_sidebar_internal_storage:
                Toast.makeText(getContext(), "internal_storage,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_homework_sidebar_sharedpreferences:
                Toast.makeText(getContext(), "sharedpreferences,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_homework_sidebar_basic_sqlite:
                Toast.makeText(getContext(), "nav_homework_sidebar_basic_sqlite,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_homework_sidebar_room_ku:
                Toast.makeText(getContext(), "nav_homework_sidebar_room_ku,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_homework_sidebar_system_broadcast_receiver:
                Toast.makeText(getContext(), "nav_homework_sidebar_system_broadcast_receiver,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_homework_sidebar_contentprovider:
                Toast.makeText(getContext(), "nav_homework_sidebar_contentprovider,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_homework_sidebar_startservice:
                Toast.makeText(getContext(), "nav_homework_sidebar_service,", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_homework_sidebar_diy_broadcast_receiver:
                Toast.makeText(getContext(), "nav_homework_sidebar_diy_broadcast_receiver,", Toast.LENGTH_SHORT).show();
                break;


        }
        return true;
    }

    /*---------------------------------actionbar右边，配套的menu-------------------------------------------------------*/

    @SuppressLint("RestrictedApi")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("==============================onviewcreate比onactivity前发生==============================");
        System.out.println("==============================是onActivityCreated================================");

        /*------------------------------------右下角悬浮按钮----------------------------------------------------*/

        /*点击悬浮按钮，提示功能*/
        FloatingActionButton floatingActionButton = requireActivity().findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "右下角悬浮按钮");

                Toast.makeText(getActivity(), "悬浮按钮", Toast.LENGTH_SHORT).show();
            }
        });

        /*------------------------------------右下角悬浮按钮----------------------------------------------------*/



        /*-------------------------------对toolbar设置---------------------------------------------------------*/
        drawerLayout = getActivity().findViewById(R.id.sidebar_main_activity);
        navigationView = getActivity().findViewById(R.id.nav_sidebar_NavigationView);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        Toolbar toolbar = requireView().findViewById(R.id.toolbar);


        activity.setSupportActionBar(toolbar);//绑定toolbar
        toolbar.setTitle("setTitle");//设置标题
        toolbar.setSubtitle("Email:2203909676@qq.com");//设置子标题
        toolbar.inflateMenu(R.menu.slide_menu_drawer);
        toolbar.setNavigationIcon(R.drawable.ic_dashboard_black_24dp);//图标
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        activity.getSupportActionBar().setIcon(R.drawable.ic_home_black_24dp);
        //创建返回键，并实现打开关/闭监听
        actionBarDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.layout.sidebar_main_activity, R.layout.sidebar_main_main_interface) {
            @Override
            public void onDrawerOpened(View drawerView) {
                Log.e("activityState", "创建返回键，并实现打开关/闭监听");

                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                Log.e("activityState", "创建返回键，并实现打开关/闭监听");

                super.onDrawerClosed(drawerView);
            }
        };
        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        /*-------------------------------实现打开侧边栏的功能容器---------------------------------------------------------*/

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_homework_sidebar_internal_storage, R.id.nav_homework_sidebar_external_storage,
                R.id.nav_homework_sidebar_sharedpreferences,
                R.id.nav_homework_sidebar_basic_sqlite,
                R.id.nav_homework_sidebar_room_ku,
                R.id.nav_homework_sidebar_system_broadcast_receiver,
                R.id.nav_homework_sidebar_contentprovider,
                R.id.nav_homework_sidebar_startservice,
                R.id.nav_homework_sidebar_diy_broadcast_receiver,
                R.id.nav_homework_sidebar_bindservice)
                .setDrawerLayout(drawerLayout)
                .build();
        NavController navController = Navigation.findNavController(getActivity(), R.id.include_in_main_interface_middle_design_fragment);
        NavigationUI.setupActionBarWithNavController((AppCompatActivity) getActivity(), navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        /*-------------------------------实现打开侧边栏的功能容器---------------------------------------------------------*/


        /*-------------------------------toolbar右边的打开菜单栏---------------------------------------------------------*/
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem i_item) {
                Log.e("activityState", "toolbar右边的打开菜单栏");

                String msg = "";
                switch (i_item.getItemId()) {
                    case R.id.nav_home:
                        Toast.makeText(getContext(), "nav_home,", Toast.LENGTH_SHORT).show();
                        msg += "search";
                        break;
                    case R.id.nav_gallery:
                        msg += "scan";
                        Toast.makeText(getContext(), "nav_gallery,", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_slideshow:
                        msg += "slideshow";
                        Toast.makeText(getContext(), "nav_slideshow,", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_homework_sidebar_external_storage:
                        msg += "nav_homework_sidebar_external_storage";
                        Toast.makeText(getContext(), "external_storage,", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_homework_sidebar_internal_storage:
                        msg += "nav_homework_sidebar_internal_storage";
                        Toast.makeText(getContext(), "internal_storage,", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_homework_sidebar_sharedpreferences:
                        msg += "nav_homework_sidebar_external_storage";
                        Toast.makeText(getContext(), "sharedpreferences,", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_homework_sidebar_basic_sqlite:
                        msg += "nav_homework_sidebar_basic_sqlite";
                        Toast.makeText(getContext(), "nav_homework_sidebar_basic_sqlite,", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_homework_sidebar_room_ku:
                        msg += "nav_homework_sidebar_room_ku";
                        Toast.makeText(getContext(), "nav_homework_sidebar_room_ku,", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_homework_sidebar_system_broadcast_receiver:
                        msg += "nav_homework_sidebar_system_broadcast_receiver";
                        Toast.makeText(getContext(), "nav_homework_sidebar_system_broadcast_receiver,", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_homework_sidebar_contentprovider:
                        msg += "nav_homework_sidebar_contentprovider";
                        Toast.makeText(getContext(), "nav_homework_sidebar_contentprovider,", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_homework_sidebar_startservice:
                        msg += "nav_homework_sidebar_service";
                        Toast.makeText(getContext(), "nav_homework_sidebar_service,", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_homework_sidebar_diy_broadcast_receiver:
                        msg += "nav_homework_sidebar_diy_broadcast_receiver";
                        Toast.makeText(getContext(), "nav_homework_sidebar_diy_broadcast_receiver,", Toast.LENGTH_SHORT).show();
                        break;
                }
                if (!msg.equals("")) {
                    Log.e("activityState", "toolbar右边的打开菜单栏");

                    System.out.println("==================from======toolbar右边的打开菜单栏=====================================");
                }
                return true;
            }
        });
    }
       /*  绑定
         这句代码，这句代码就把用toolbar代替ActionBar体现的非常具体了，
        一看就能明白是什么意思。要注意的是，ToolBar的有些方法必须要在这句话之前调用才能生效，
        比如setTitle，而有些方法则必须要在这句话之后调用才能生效，
        比如setOnMenuItemClickListener，具体哪些之前调用，哪些之后调用，
        哪些前后无所谓就需要自己去查API了。*/
    /*//设置监听.必须在setSupportActionBar()之后调用*/
    //toolbar.setNavigationOnClickListener();
    /*//显示NavigationIcon,这个方法是ActionBar的方法.Toolbar没有这个方法. */

    /*使用AppBarConfiguration存储顶部应用栏的配置
    AppBarConfiguration.Builder()中的参数为导航图中顶层目的地
    setOpenableLayout()配置对应的抽屉布局
    NavigationUI.setupActionBarWithNavController()让配置生效
    重写onSupportNavigateUp处理向上导航
    */
    /*-------------------------------toolbar右边的打开菜单栏---------------------------------------------------------*/
    /*-------------------------------对toolbar设置---------------------------------------------------------*/


    /*----------------------------------------------------------------------------------------------------------------------------------------*/


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        System.out.println("====================onviewcreate比onactivity前发生======================");
        System.out.println("=====================是onViewCreated=============================");

    }


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*setHasOptionsMenu(true) 可告知系统您的 Fragment 想要接收与菜单相关的回调。
        当发生与菜单相关的事件（创建、点击等等）时，先对 Activity 调用事件处理方法，
        然后再对 Fragment 调用。请注意，您的应用逻辑不应依赖于此顺序。
        如果多个 Fragment 由同一个 Activity 托管，每个 Fragment 都可以提供菜单选项。
        在这种情况下，回调顺序取决于 Fragment 的添加顺序。*/

        /*------------------------------------------------MessageViewModel------------------------------------------------*/
        messageViewModel =
                new ViewModelProvider(this).get(MessageViewModel.class);
        // final TextView textView = root.findViewById(R.id.text_dashboard);
        messageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });
        /*------------------------------------------------MessageViewModel------------------------------------------------*/


        View root = inflater.inflate(R.layout.sidebar_main_activity, container, false);
        return root;
    }
}
