package com.hecc.practicetestapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FooterNav#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FooterNav extends Fragment implements View.OnClickListener {
    public long courseId;
    public long questionId;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FooterNav() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FooterNav.
     */
    // TODO: Rename and change types and number of parameters
    public static FooterNav newInstance(String param1, String param2) {
        FooterNav fragment = new FooterNav();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_footer_nav, container, false);

        Button startButton = (Button)layout.findViewById(R.id.prev_button);
        startButton.setOnClickListener(this);
        Button stopButton = (Button)layout.findViewById(R.id.next_button);
        stopButton.setOnClickListener(this);
        Button resetButton = (Button)layout.findViewById(R.id.next_button);
        resetButton.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.prev_button:
                onClickPrev();
                break;
            case R.id.exit_button:
                onClickExit();
                break;
            case R.id.next_button:
                onClickNext();
                break;
        }
    }

    private void onClickNext() {
        //todo add transation of fragment with current question +1

        CourseDetailFragment nextFrag= new CourseDetailFragment();
        //nextFrag.setCourseId(nextFrag.getCourseId());
        nextFrag.setQuestionId(nextFrag.getQuestionId() + 1);

        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, nextFrag, "question")
                .addToBackStack(null)
                .commit();
    }

    private void onClickExit() {
        //todo destroy the fragment and restart parent activity
    }

    private void onClickPrev() {
        //todo display the current question minus 1
    }

}