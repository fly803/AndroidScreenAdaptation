package com.screenadaptation.test.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.screenadaptation.test.R;
import com.screenadaptation.utils.ResolutionAdaptationUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("cg", "onCreate: "+ ResolutionAdaptationUtils.getDensity(this));
    }
}
