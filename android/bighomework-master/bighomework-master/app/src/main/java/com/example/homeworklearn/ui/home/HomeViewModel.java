package com.example.homeworklearn.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
       mText.setValue("骆发茂的第一个程序,你好哇\n希望你会喜欢我的作品\n虽然它很简陋\nHello World!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}