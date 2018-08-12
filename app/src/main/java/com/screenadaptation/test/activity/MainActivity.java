package com.screenadaptation.test.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.screenadaptation.base.BaseScreenAdaptActivity;
import com.screenadaptation.base.ScreenAdaptActivity;
import com.screenadaptation.test.R;
import com.screenadaptation.test.api.AppConfig;
import com.screenadaptation.utils.ResolutionAdaptationUtils;
import com.screenadaptation.utils.ScreenUtils;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
