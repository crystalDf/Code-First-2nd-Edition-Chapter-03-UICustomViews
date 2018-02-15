package com.star.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class TitleLayout extends LinearLayout {

    private Button mTitleBack;
    private Button mTitleEdit;

    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);

        mTitleBack = findViewById(R.id.title_back);
        mTitleBack.setOnClickListener(v -> ((Activity) getContext()).finish());

        mTitleEdit = findViewById(R.id.title_edit);
        mTitleEdit.setOnClickListener(v -> Toast.makeText(getContext(), "Edit Button", Toast.LENGTH_LONG).show());
    }
}
