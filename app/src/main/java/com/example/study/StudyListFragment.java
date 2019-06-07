package com.example.study;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StudyListFragment extends Fragment {

    private RecyclerView mStudyRecyclerView;
    private StudyAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_study_list, container, false);
        mStudyRecyclerView = (RecyclerView) view.findViewById(R.id.crime_recycler_view);
        mStudyRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private class StudyHolder extends RecyclerView.ViewHolder {
        public TextView mTitleTextView;

        public StudyHolder(View itemView){
            super(itemView);

            mTitleTextView = (TextView)itemView;
        }
    }

    private class StudyAdapter extends RecyclerView.Adapter<StudyHolder>{
        private List<Study> mStudies;

        public StudyAdapter(List<Study> Studies){
            mStudies = Studies;
        }

        @NonNull
        @Override
        public StudyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
            return new StudyHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull StudyHolder studyHolder, int i) {
            Study study = mStudies.get(i);
            studyHolder.mTitleTextView.setText(study.getTitle());
        }

        @Override
        public int getItemCount() {
            return mStudies.size();
        }
    }

    private void updateUI(){
        StudyLab studyLab = StudyLab.get(getActivity());
        List<Study> studies = studyLab.getStudies();

        mAdapter = new StudyAdapter(studies);
        mStudyRecyclerView.setAdapter(mAdapter);
    }


}
