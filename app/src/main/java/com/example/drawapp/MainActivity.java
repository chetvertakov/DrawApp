package com.example.drawapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class MainActivity extends Activity{

    TextView mText;
    MyDrawView mDraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = this.findViewById(R.id.textX_draw);
        mDraw = this.findViewById(R.id.DrawView);
        mDraw.setmMainActivity(this);
    }
}
