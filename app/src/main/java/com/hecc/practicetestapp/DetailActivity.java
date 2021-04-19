package com.hecc.practicetestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_COURSE_ID = "id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        CourseDetailFragment frag = (CourseDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int courseId = (int) getIntent().getExtras().get(EXTRA_COURSE_ID);
        frag.setCourseId(courseId);
    }
}