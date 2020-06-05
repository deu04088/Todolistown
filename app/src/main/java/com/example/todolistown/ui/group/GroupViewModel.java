package com.example.todolistown.ui.group;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GroupViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GroupViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("공유한 List가 없습니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}