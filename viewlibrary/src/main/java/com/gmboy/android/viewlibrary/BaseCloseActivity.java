package com.gmboy.android.viewlibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BaseCloseActivity extends AppCompatActivity {

    protected LinearLayout mRootView;
    protected TextView mCloseTextView;
    protected ImageView mCloseImageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addCloseToolbar();
    }


    private void addCloseToolbar() {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View toolbarRootView = inflater.inflate(R.layout.actionbar_close, null);
        mRootView = toolbarRootView.findViewById(R.id.myRootView);

        mCloseImageView = toolbarRootView.findViewById(R.id.closeImageView);
        mCloseTextView = toolbarRootView.findViewById(R.id.closeTextView);

        ViewGroup activityRootViewParent = findViewById(android.R.id.content);
        View activityRootView = activityRootViewParent.getChildAt(0);
        activityRootViewParent.removeView(activityRootView);

        ViewGroup toolbarRootViewGroup = (ViewGroup)toolbarRootView;
        toolbarRootViewGroup.addView(activityRootView, 1);
        setContentView(toolbarRootView);
    }

    public void onClickClose(View view) {
        finish();
    }

    protected void setTitleTextSupportTouch() {
        mCloseTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
