package com.example.todofragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // call the super class onCreate to complete the creation of activity like
        // the view hierarchy
        super.onCreate(savedInstanceState);

        // set the user interface layout for this Activity
        // the layout file is defined in the project res/layout/activity_main.xml file
        setContentView(R.layout.activity_main);


        //Return the FragmentManager for interacting with fragments associated with this fragments activity
        FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null){
            TodoFragment todoFragment = new TodoFragment();

            // adds fragment to calling activities view.
            // a fragment is inserted into FrameLayout view object of MainActivity
            fm.beginTransaction().add(R.id.fragment_container, todoFragment).commit();
        }
    }
}
