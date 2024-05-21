package com.example.homeworklearn.ui.message;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @ClassName : MessageViewModel
 * @Author : 骆发茂
 * @Date: 2021/4/22 21:09
 * @Description :
 */
public class MessageViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MessageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is MessageViewModel fragment\n你好哇\n这里是是骆发茂的MessageViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
