package com.example.homeworklearn;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.homeworklearn.ui.in_dashboard_button_ScreenSlidePage.in_dashboard_button_ScreenSlidePageFragment_fifth;
import com.example.homeworklearn.ui.in_dashboard_button_ScreenSlidePage.in_dashboard_button_ScreenSlidePageFragment_first;
import com.example.homeworklearn.ui.in_dashboard_button_ScreenSlidePage.in_dashboard_button_ScreenSlidePageFragment_fourth;
import com.example.homeworklearn.ui.in_dashboard_button_ScreenSlidePage.in_dashboard_button_ScreenSlidePageFragment_second;
import com.example.homeworklearn.ui.in_dashboard_button_ScreenSlidePage.in_dashboard_button_ScreenSlidePageFragment_third;

/**
 * @ClassName : ScreenSlidePagerActivity
 * @Author : 骆发茂
 * @Date: 2021/4/13 8:30
 * @Description :
 */


/*    下面的是private class in_dashboard_button_ScreenSlidePagerAdapter extends FragmentStateAdapter  */
public class in_dashboard_button_ScreenSlidePagerActivity extends FragmentActivity {
    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 5;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager2 viewPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private FragmentStateAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_dashboard_button_activity_viewpager2);

        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = findViewById(R.id.in_dashboard_button_activity_viewpager2);
        pagerAdapter = new in_dashboard_button_ScreenSlidePagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);
    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }


    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment_first objects, in
     * sequence.
     * <p>
     * 创建可执行以下操作的 Activity：
     * <p>
     * 将内容视图设置为包含 ViewPager2 的布局。
     * 创建扩展 FragmentStateAdapter 抽象类的类，
     * 并实现 createFragment() 方法以提供 ScreenSlidePageFragment_first 实例作为新页面。
     * 页导航控件适配器还要求您实现 getItemCount() 方法，
     * 该方法返回适配器将创建的页数（示例中为 5 页）。
     * 将 FragmentStateAdapter 与 ViewPager2 对象挂钩。
     */

    /*上面的是：public class in_dashboard_button_ScreenSlidePagerActivity extends FragmentActivity */
    private class in_dashboard_button_ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public in_dashboard_button_ScreenSlidePagerAdapter(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    return new in_dashboard_button_ScreenSlidePageFragment_first();
                case 1:
                    return new in_dashboard_button_ScreenSlidePageFragment_second();
                case 2:
                    return new in_dashboard_button_ScreenSlidePageFragment_third();
                case 3:
                    return new in_dashboard_button_ScreenSlidePageFragment_fourth();
                case 4:
                    return new in_dashboard_button_ScreenSlidePageFragment_fifth();
            }
            return null;
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}
