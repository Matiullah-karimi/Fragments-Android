package com.matiullahkarimi.fragmentsexample;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment1 extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("LifeCycle", "onCreate called");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("LifeCycle", "onCreateView called");
        return inflater.inflate(R.layout.fragment_fragment1, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("LifeCycle", "onActivityCreated called");

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("LifeCycle", "onAttach called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d("LifeCycle", "onDestroyView called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("LifeCycle", "onDetach called");
    }

}
