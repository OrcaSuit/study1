package com.example.study;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class StudyActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new StudyFragment();
    }
}
