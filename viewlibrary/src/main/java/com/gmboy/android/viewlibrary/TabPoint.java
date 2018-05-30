package com.gmboy.android.viewlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class TabPoint extends LinearLayout {

    private Context mContext;

    private int mPointColor;
    private float mPointWidth;
    private float mPointHeight;
    private float mPointUnSelAlpha;
    private ViewGroup mPointRoot;

    public TabPoint(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public TabPoint(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public TabPoint(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        mContext = context;
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.TabPoint,0, 0);

        try {
            mPointColor = a.getColor(R.styleable.TabPoint_pointColor, Color.BLACK);
            mPointWidth = a.getDimension(R.styleable.TabPoint_pointWidth, 50.0f);
            mPointHeight = a.getDimension(R.styleable.TabPoint_pointHeight, 50.0f);
            mPointUnSelAlpha = a.getFloat(R.styleable.TabPoint_pointUnselAlpha, 0.0f);
        } finally {
            a.recycle();
        }

        LayoutInflater.from(context).inflate(R.layout.tab_point, this);
        mPointRoot = findViewById(R.id.tab_point_root);
    }

    public void setPointNum(int pointNum) {
        mPointRoot.removeAllViews();
        Button view = null;
        for (int i = 0 ; i < pointNum; i++) {
            view = new Button(mContext, null, 0, R.style.circularBtn);
            GradientDrawable myGrad = (GradientDrawable)view.getBackground();
            myGrad.setColor(mPointColor);
            view.setWidth((int) mPointWidth);
            view.setHeight((int) mPointHeight);
            mPointRoot.addView(view);
            view.setText(" ");
        }
    }

    public void setSelIndex(int selIndex) {

        int totalCount = mPointRoot.getChildCount();

        for (int i = 0; i < totalCount; i++) {
           if (i == selIndex) {
               mPointRoot.getChildAt(i).setAlpha(1.0f);
           } else {
               mPointRoot.getChildAt(i).setAlpha(mPointUnSelAlpha);
           }

        }
    }

}
