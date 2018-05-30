package com.gmboy.android.jasonapplication;

import android.os.Bundle;

import com.gmboy.android.viewlibrary.BaseCloseActivity;
import com.gmboy.android.viewlibrary.TabPoint;

public class MainActivity extends BaseCloseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        TabPoint tp = findViewById(R.id.tp);
        tp.setPointNum(3);
        tp.setSelIndex(0);
    }
}
