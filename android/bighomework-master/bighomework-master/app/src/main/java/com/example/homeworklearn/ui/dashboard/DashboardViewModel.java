package com.example.homeworklearn.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

   public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment\n你好哇\n这里是是骆发茂的Dashboard");
    }

  public LiveData<String> getText() {
        return mText;
    }

}