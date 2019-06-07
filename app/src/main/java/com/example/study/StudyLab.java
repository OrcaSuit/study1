package com.example.study;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudyLab {
    private static StudyLab sStudyLab;

    private List<Study> mStudies;

    public static StudyLab get(Context context) {
        if(sStudyLab == null){
            sStudyLab = new StudyLab(context);
        }
        return sStudyLab;
    }

    private StudyLab(Context context){
        mStudies = new ArrayList<Study>();
        for(int i = 0; i < 100 ; i++) {
            Study study = new Study();
            study.setTitle("공부 #" + i);
            study.setSolved(i % 2 == 0);
            mStudies.add(study);
        }
    }


    public List<Study> getStudies(){
        return mStudies;
    }

    public Study getStudy(UUID id){
        for(Study study : mStudies){
            if(study.getId().equals(id)){
                return study;
            }
        }
        return null;
    }
}
