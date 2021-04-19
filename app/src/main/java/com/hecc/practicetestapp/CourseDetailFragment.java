package com.hecc.practicetestapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CourseDetailFragment extends Fragment {
    public long courseId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_course_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null) {
            //Todo populate question fragment
            TextView questionTitle = (TextView) view.findViewById(R.id.questionTitle);
            //Workout workout = Workout.workouts[(int) workoutId];
            questionTitle.setText("Android Test Question 1");
            TextView question = (TextView) view.findViewById(R.id.question);
            question.setText("Here's the first question");
            RadioButton option1 = (RadioButton) view.findViewById(R.id.option1);
            option1.setText("Radio option 1");
            RadioButton option2 = (RadioButton) view.findViewById(R.id.option2);
            option2.setText("Radio option 2");
            RadioButton option3 = (RadioButton) view.findViewById(R.id.option3);
            option3.setText("Radio option 3");
            RadioButton option4 = (RadioButton) view.findViewById(R.id.option4);
            option4.setText("Radio option 4");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        saveInstanceState.putLong("courseId", courseId);
    }

    public void setCourseId(long id) {
        this.courseId = id;
    }
}