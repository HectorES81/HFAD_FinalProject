package com.hecc.practicetestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_COURSE_ID = "id";
    public static final String EXTRA_QUESTION_ID = "QId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        CourseDetailFragment frag = (CourseDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int courseId = (int) getIntent().getExtras().get(EXTRA_COURSE_ID);
        int questionId = (int) getIntent().getExtras().get(EXTRA_QUESTION_ID);
        frag.setCourseId(courseId);
        frag.setQuestionId(questionId);
    }
}