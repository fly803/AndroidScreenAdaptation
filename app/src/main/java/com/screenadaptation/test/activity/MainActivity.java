package com.screenadaptation.test.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.screenadaptation.base.ScreenAdaptActivity;
import com.screenadaptation.test.R;
import com.screenadaptation.utils.ResolutionAdaptationUtils;

public class MainActivity extends ScreenAdaptActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
