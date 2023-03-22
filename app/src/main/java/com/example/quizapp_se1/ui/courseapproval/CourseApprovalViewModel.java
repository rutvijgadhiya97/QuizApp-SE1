package com.example.quizapp_se1.ui.courseapproval;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CourseApprovalViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CourseApprovalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}