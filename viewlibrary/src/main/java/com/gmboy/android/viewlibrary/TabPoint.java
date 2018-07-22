package com.gmboy.android.viewlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.logging.Logger;

public class TabPoint extends LinearLayout {

    private static final String TAG = "TabPoint";
    private Logger mLogger;

    private Context mContext;

    private float mPointWidth;
    private float mPointHeight;

    private int mPointColor;
    private float mPointSelAlpha;
    private float mPointUnSelAlpha;

    private boolean mPointUseBackground;

    private int mPointSelBackground;
    private int mPointUnSelBackground;

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
        mLogger = Logger.getLogger(TAG);

        mContext = context;
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.TabPoint,0, 0);

        try {
            mPointWidth = a.getDimension(R.styleable.TabPoint_pointWidth, 50.0f);
            mPointHeight = a.getDimension(R.styleable.TabPoint_pointHeight, 50.0f);

            mPointColor = a.getColor(R.styleable.TabPoint_pointColor, Color.BLACK);
            mPointSelAlpha = a.getFloat(R.styleable.TabPoint_pointSelAlpha, 1.0f);
            mPointUnSelAlpha = a.getFloat(R.styleable.TabPoint_pointUnSelAlpha, 0.3f);

            mPointUseBackground = a.getBoolean(R.styleable.TabPoint_pointUseBackground, false);

            mPointSelBackground = a.getResourceId(R.styleable.TabPoint_pointSelBackground, 0);
            mPointUnSelBackground = a.getResourceId(R.styleable.TabPoint_pointUnSelBackground, 0);
        } catch (Exception e) {
            mLogger.severe("init(): Fail!" + e.getMessage());
            throw e;
        }finally {
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

            if (mPointUseBackground) {
                mLogger.info("init(): Use mPointSelBackground");
                view.setBackgroundResource(mPointSelBackground);
            } else {
                mLogger.info("init(): Use mPointColor");
                myGrad.setColor(mPointColor);
                view.setBackground(myGrad);
            }

            view.setWidth((int) mPointWidth);
            view.setHeight((int) mPointHeight);

            mPointRoot.addView(view);

            view.setText(" ");
        }
    }

    public void setSelIndex(int selIndex) {

        int totalCount = mPointRoot.getChildCount();

        for (int i = 0; i < totalCount; i++) {
            Button view  = (Button) mPointRoot.getChildAt(i);
           if (i == selIndex) {
               if (mPointUseBackground) {
                   view.setBackgroundResource(mPointSelBackground);
               } else {
                   view.setAlpha(mPointSelAlpha);
               }
           } else {
               if (mPointUseBackground) {
                   view.setBackgroundResource(mPointUnSelBackground);
               } else {
                   view.setAlpha(mPointUnSelAlpha);
               }
           }

        }
    }

}
