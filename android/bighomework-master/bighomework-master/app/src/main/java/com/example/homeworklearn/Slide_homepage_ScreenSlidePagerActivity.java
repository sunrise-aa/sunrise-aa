package com.example.homeworklearn;

/**
 * @ClassName : homework_ScreenSlidePagerActivity
 * @Author : 骆发茂
 * @Date: 2021/4/13 21:32
 * @Description :
 * 1.	使用Fragment和ViewPager2实现滑动切换界面的效果
 * 2.	切换的两个界面为实验2、实验4中的部分界面（如下图）
 * 3.	实验4中的界面需要保留功能（点击其中的按钮需要有效果）
 * 如果有需要，可以取消掉注释，即可使用
 */









/*
public class Slide_homepage_ScreenSlidePagerActivity extends FragmentActivity {
    */
/**
     * The number of pages (wizard steps) to show in this demo.
     *//*

    private static final int NUM_PAGES = 3;

    */
/**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     *//*

    private ViewPager2 viewPager;

    */
/**
     * The pager adapter, which provides the pages to the view pager widget.
     *//*

    private FragmentStateAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide_homepage_activity_viewpager2);

        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = findViewById(R.id.slide_homepage_activity_viewpager2);
        pagerAdapter = new Slide_homepage_ScreenSlidePagerAdapter(this);
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


    */
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
     *//*


    private class Slide_homepage_ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public Slide_homepage_ScreenSlidePagerAdapter(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    return new HomeFragment();
                case 1:
                    return new DashboardFragment();
                case 2:
                    return new NotificationsFragment();
            }
            return null;
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}
*/
