package com.mindpin.android.loadingview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by dd on 14-7-4.
 */
public class LoadingView extends LinearLayout {
    public LoadingView(Context context) {
        this(context, null);
    }

    public LoadingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.loadingview, this,  true);
    }

    // 显示 LoadingView
    public void show(){
        setVisibility(VISIBLE);
    };

    // 隐藏 LoadingView
    public void hide(){
        setVisibility(GONE);
    };
}
