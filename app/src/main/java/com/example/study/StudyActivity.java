package com.example.study;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class StudyActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        FragmentManager fm = getSupportFragmentManager(); // Fragment의 onActivityCreated() 호출
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new StudyFragment(); // Fragment의 onAttach() onCreate() onCreateView() 호출  // Fragment의 onActivityCreated() 호출
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

        /*
            FragmentManager 하는 일.
           1. 액티비티의 생명주기 상태를 따라잡고
           2. 액티비티의 상태와 Fragment의 상태를 fm이 동조시킴 */
    }


}
