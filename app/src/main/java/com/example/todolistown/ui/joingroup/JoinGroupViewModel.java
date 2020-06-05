package com.example.todolistown.ui.joingroup;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JoinGroupViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JoinGroupViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(" ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}