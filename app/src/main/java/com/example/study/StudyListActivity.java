package com.example.study;

import android.support.v4.app.Fragment;

public class StudyListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new StudyListFragment();
    }
}
