package com.example.homeworklearn.ui.in_dashboard_button_ScreenSlidePage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homeworklearn.R;

/**
 * @ClassName : ScreenSlidePageFragment_second
 * @Author : 骆发茂
 * @Date: 2021/4/13 20:17
 * @Description :
 */
public class in_dashboard_button_ScreenSlidePageFragment_second extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.in_dashboard_button_fragment_screen_slide_page_secondpage, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        /*打开信息*/
        Button button_open_message = requireView().findViewById(R.id.in_dashboard_button_fragment_screen_slide_page_secondpage_open_firstapp);
        button_open_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "打开信息");

                Intent intent_open_message = getActivity().getPackageManager().getLaunchIntentForPackage("com.android.mms");
                startActivity(intent_open_message);

            }
        });
        /*打开美团外卖*/
        Button button_open_meituanwaimai = requireView().findViewById(R.id.in_dashboard_button_fragment_screen_slide_page_secondpage_open_meituanwaimai);
        button_open_meituanwaimai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "打开美团外卖");

                Intent intent_open_meituanwaimai = getActivity().getPackageManager().getLaunchIntentForPackage("com.sankuai.meituan.takeoutnew");
                startActivity(intent_open_meituanwaimai);

            }
        });

        /*打开微信*/
        Button button_open_wechat = requireView().findViewById(R.id.in_dashboard_button_fragment_screen_slide_page_secondpage_open_wechat);
        button_open_wechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("activityState", "打开微信");

                Intent intent_open_wechat = getActivity().getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
                startActivity(intent_open_wechat);

            }
        });


    }


    /* 不可以在fragment里面这么写功能，button里面的onclick只能从activity里面查找到
      public void open_message(View view) {
        Intent intent_open_message = requireActivity().getPackageManager().getLaunchIntentForPackage("com.android.mms");
        startActivity(intent_open_message);
    }

    public void open_wechat(View view) {
        Intent intent_open_wechat = requireActivity().getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
        startActivity(intent_open_wechat);
    }

    public void open_meituanwaimai(View view) {
        Intent intent_open_meituanwaimai = requireActivity().getPackageManager().getLaunchIntentForPackage("com.sankuai.meituan.takeoutnew");
        startActivity(intent_open_meituanwaimai);
    }*/

}


