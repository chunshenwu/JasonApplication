package com.gmboy.android.viewlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CircularIconView extends RelativeLayout {

    public CircularIconView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CircularIconView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public CircularIconView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, @Nullable AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CircularIconView,0, 0);

        String iconText = null;
        String nameText = null;
        try {
            iconText = a.getString(R.styleable.CircularIconView_iconText);
            nameText = a.getString(R.styleable.CircularIconView_nameText);
        } finally {
            a.recycle();
        }

        LayoutInflater.from(context).inflate(R.layout.circular_icon, this);

        Button btn = (Button) findViewById(R.id.circularButton);
        TextView tv = (TextView)findViewById(R.id.nameTextView);

        btn.setText(iconText);
        tv.setText(nameText);
        inflate(getContext(), R.layout.circular_icon, this);
    }
}
