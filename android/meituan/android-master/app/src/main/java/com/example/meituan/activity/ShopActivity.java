package com.example.meituan.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.meituan.R;
import com.example.meituan.adapter.AdBannerAdapter;
import com.example.meituan.adapter.ShopAdapter;
import com.example.meituan.bean.ShopBean;
import com.example.meituan.utils.Constant;
import com.example.meituan.utils.JsonParse;
import com.example.meituan.views.ShopListView;
import com.example.meituan.views.ViewPagerIndicator;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ShopActivity extends AppCompatActivity {
    private TextView tv_back, tv_title;        //返回键与标题控件
    private ShopListView slv_list;             //列表控件
    private ShopAdapter adapter;               //列表的适配器
    private RelativeLayout rl_title_bar;
    private ViewPager adPager;         //广告
    private ViewPagerIndicator vpi;   //小圆点
    private View adBannerLay;          //广告条容器
    private AdBannerAdapter ada;      //适配器
    public static final int MSG_AD_SLID = 1;  //广告自动滑动
    public static final int MSG_SHOP_OK = 2;  //获取数据
    private MHandler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        mHandler = new MHandler();
        initData();
        init();
    }

    /**
     * 初始化界面控件
     */
    private void init() {
        tv_back = findViewById(R.id.tv_back);
        tv_title = findViewById(R.id.tv_title);
        tv_title.setText("店铺");
        rl_title_bar = findViewById(R.id.title_bar);
        rl_title_bar.setBackgroundColor(getResources().getColor(
                R.color.blue_color));
        tv_back.setVisibility(View.GONE);
        slv_list = findViewById(R.id.slv_list);
        adapter = new ShopAdapter(this);
        slv_list.setAdapter(adapter);
        adBannerLay = findViewById(R.id.adbanner_layout);
        adPager = findViewById(R.id.slidingAdvertBanner);
        vpi = findViewById(R.id.advert_indicator);
        adPager.setLongClickable(false);
        ada = new AdBannerAdapter(getSupportFragmentManager());
        adPager.setAdapter(ada);
//        实现小圆点的颜色效果
        adPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int index) {
                if (ada.getSize() > 0) {
                    vpi.setCurrentPostion(index % ada.getSize()); //设置当前小圆点
                }
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
        resetSize();
        new AdAutoSlidThread().start();
    }

    //    实现广告的自动切换效果
    class AdAutoSlidThread extends Thread {
        @Override
        public void run() {
            super.run();
            while (true) {
                try {
                    sleep(5000); //睡眠5秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (mHandler != null)
                    mHandler.sendEmptyMessage(MSG_AD_SLID);
            }
        }
    }

    private void initData() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(Constant.WEB_SITE +
                Constant.REQUEST_SHOP_URL).build();
        Call call = okHttpClient.newCall(request);
        Log.i("shopActivity", String.valueOf(request));
        // 开启异步线程访问网络
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String res = response.body().string(); //获取店铺数据
                Message msg = new Message();
                msg.what = MSG_SHOP_OK;
                msg.obj = res;
                mHandler.sendMessage(msg);
            }

            @Override
            public void onFailure(Call call, IOException e) {
            }
        });
    }

    /**
     * 事件捕获
     */
    class MHandler extends Handler {
        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            switch (msg.what) {
                case MSG_SHOP_OK:
                    if (msg.obj != null) {
                        String vlResult = (String) msg.obj;
                        //getShopList()解析获取的JSON数据，传递到sbl中
                        List<ShopBean> sbl = JsonParse.getInstance().
                                getShopList(vlResult);
//                        将集合数据sbl传递到店铺列表的数据适配器ShopAdapter中
                        adapter.setData(sbl);
                        if (sbl != null) {
                            if (sbl.size() > 0) {
                                ada.setData(sbl); //设置广告栏数据到界面上
                                vpi.setCount(sbl.size()); //设置小圆点数目
                                vpi.setCurrentPostion(0); //设置当前小圆点的位置为0
                            }
                        }
                    }
                    break;
                case MSG_AD_SLID:
                    if (ada.getCount() > 0) {
                        //设置滑动到下一张广告图片
                        adPager.setCurrentItem(adPager.getCurrentItem() + 1);
                    }
                    break;
            }
        }
    }

    /**
     * 计算控件大小
     */
    private void resetSize() {
        int sw = getScreenWidth();//获取屏幕宽度
        int adLheight = sw / 3; //广告条高度
        ViewGroup.LayoutParams adlp = adBannerLay.getLayoutParams();
        adlp.width = sw;
        adlp.height = adLheight;
        adBannerLay.setLayoutParams(adlp);
    }

    /**
     * 获取屏幕宽度
     */
    public int getScreenWidth() {
        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.widthPixels;
    }

    protected long exitTime;//记录第一次点击时的时间

    //    实现点击两次返回键的时间间隔小于或等于2秒时,退出仿美团外卖应用程序的功能
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        keyCode               判断值是否为用户点击了返回键
//        event.getAction()     判断返回键是否处于被按下的状态
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
//            判断两次按下返回键的时间是否大于2秒
//            若大于，则提示用户"再按一次退出仿美团外卖应用"，并保存当前时间
//            否则，调用finish()方法关闭当前页面，同时调用exit(0)方法退出当前应用程序
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                Toast.makeText(ShopActivity.this, "再按一次退出仿美团外卖应用",
                        Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                ShopActivity.this.finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
