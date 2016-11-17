package com.example.telematica.uiappexample;

import android.os.Bundle;

import com.example.telematica.uiappexample.fragment.ListFragment;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentFrame(R.id.content_frame);
        switchContent(ListFragment.newInstance(), null);
    }

}
