package com.screenadaptation.test.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.screenadaptation.base.BaseScreenAdaptActivity;
import com.screenadaptation.base.ScreenAdaptActivity;
import com.screenadaptation.test.R;
import com.screenadaptation.test.api.AppConfig;
import com.screenadaptation.utils.ResolutionAdaptationUtils;
import com.screenadaptation.utils.ScreenUtils;

public class SplashActivity extends BaseScreenAdaptActivity {
    @Override
    protected void initScreenAdaption() {
        if (ScreenUtils.isPortrait()) {
            ScreenUtils.adaptScreen4VerticalSlide(this, AppConfig.widthInPx);
        } else {
            ScreenUtils.adaptScreen4HorizontalSlide(this, AppConfig.heightInPx);
        }
    }

    @Override
    protected int getActivityLayoutId() {
        return R.layout.activity_splash_layout;
    }

    @Override
    protected void initViews() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                /* Create an Intent that will start the Main WordPress Activity. */
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                SplashActivity.this.finish();
            }
        }, 1000);
    }

    @Override
    protected void initData() {

    }
}
