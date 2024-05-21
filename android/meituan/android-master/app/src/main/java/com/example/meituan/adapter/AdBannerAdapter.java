package com.example.meituan.adapter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.meituan.bean.ShopBean;

import java.util.ArrayList;
import java.util.List;

public class AdBannerAdapter extends FragmentStatePagerAdapter {
    private List<ShopBean> sbl;
    public AdBannerAdapter(FragmentManager fm) {
        super(fm);
        sbl = new ArrayList<>();
    }
    /**
     *  获取数据并更新界面
     */
    public void setData(List<ShopBean> sbl) {
        this.sbl = sbl;          //接受从ShopActivity中传递过来的店铺数据集合sbl
        notifyDataSetChanged();  //更新界面数据
    }
    @Override
    public Fragment getItem(int index) {
        Bundle args = new Bundle();
        if (sbl.size() > 0)
//            传递店铺数据
//            ad            表示传递数据的key值
//            sbl.get(index % sbl.size())       由于广告栏一直循环滑动，所以采取求余法来获取对应位置的店铺数据
            args.putSerializable("ad", sbl.get(index % sbl.size()));
        return AdBannerFragment.newInstance(args);
    }
    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }
    /**
     * 返回数据集中元素的数量
     */
    public int getSize() {
        return sbl == null ? 0 : sbl.size();
    }
    @Override
    public int getItemPosition(Object object) {
        //防止刷新结果显示列表的时候出现缓存数据,重载这个函数,使之默认返回POSITION_NONE
        return POSITION_NONE;
    }
}
