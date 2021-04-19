package com.hecc.practicetestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements CourseListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if(fragmentContainer != null) {
            CourseDetailFragment details = new CourseDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setCourseId(id);
            ft.replace(R.id.fragment_container,details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_COURSE_ID, (int) id);
            startActivity(intent);
        }

    }
}