package com.example.meituan.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;


import com.bumptech.glide.Glide;
import com.example.meituan.R;
import com.example.meituan.activity.ShopDetailActivity;
import com.example.meituan.bean.ShopBean;

public class AdBannerFragment extends Fragment {
    private ShopBean sb;   //广告
    private ImageView iv;  //图片
    public static AdBannerFragment newInstance(Bundle args) {
        AdBannerFragment af = new AdBannerFragment();
        af.setArguments(args);
        return af;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arg = getArguments();
        sb = (ShopBean) arg.getSerializable("ad"); //获取一个店铺对象，即店铺广告图片对应的店铺数据
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public void onResume() {
        super.onResume();
        if (sb != null) {
            //调用Glide框架加载图片
            Glide
                    .with(getActivity())    //上下文
                    .load(sb.getBanner())   //网络图片数据
                    .error(R.mipmap.ic_launcher)    //当网络图片加载失败时，界面上默认显示的图片
                    .into(iv);              //显示广告图片的控件
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        iv = new ImageView(getActivity()); //创建一个ImageView控件的对象，用于显示广告图片
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        iv.setLayoutParams(lp);                       //设置ImageView控件的宽高参数
        iv.setScaleType(ImageView.ScaleType.FIT_XY); //把图片填满整个控件
//      实现广告图片的点击事件
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到店铺详情界面，同时将数据也传递到店铺详情界面
                if (sb == null) return;
                Intent intent = new Intent(getActivity(), ShopDetailActivity.class);
                intent.putExtra("shop", sb);
                getActivity().startActivity(intent);
            }
        });
        return iv;
    }
}
