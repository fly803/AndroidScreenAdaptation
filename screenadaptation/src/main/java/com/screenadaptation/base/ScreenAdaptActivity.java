package com.screenadaptation.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.screenadaptation.utils.ResolutionAdaptationUtils;
import com.screenadaptation.utils.ScreenUtils;

/**
 * @author sam
 * @version 1.0
 * @date 2018/8/12
 */
public class ScreenAdaptActivity extends AppCompatActivity {

    private TextView tvUp;
    private TextView tvDown;
    private static Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData(savedInstanceState);
        if (!ScreenUtils.isPortrait()) {
            updateLayout();
        }
    }

    public void initData(@Nullable Bundle bundle) {
        if (ScreenUtils.isPortrait()) {
            ScreenUtils.adaptScreen4VerticalSlide(this, 360);
        } else {
            ScreenUtils.adaptScreen4HorizontalSlide(this, 360);
        }
    }

    public void toggleFullScreen(View view) {
        ScreenUtils.toggleFullScreen(this);
        updateLayout();
    }

    private void updateLayout() {
        int statusBarHeight = ResolutionAdaptationUtils.getNavigationBarHeight(this);
        float statusBarHeightInDp = ResolutionAdaptationUtils.px2dip(this, statusBarHeight);
        ViewGroup.LayoutParams upLayoutParams = tvUp.getLayoutParams();
        ViewGroup.LayoutParams downLayoutParams = tvDown.getLayoutParams();
        if (ScreenUtils.isFullScreen(this)) {
            int height = 360 / 2;
            String s = height + "dp";
            upLayoutParams.height = ResolutionAdaptationUtils.dip2px(this, height);
            tvUp.setLayoutParams(upLayoutParams);
            tvUp.setText(s);

            downLayoutParams.height = ResolutionAdaptationUtils.dip2px(this, height);
            tvDown.setLayoutParams(downLayoutParams);
            tvDown.setText(s);
        } else {
            float height = 360 / 2 - statusBarHeightInDp / 2;
            String s = height + "dp";
            upLayoutParams.height = ResolutionAdaptationUtils.dip2px(this, height);
            tvUp.setLayoutParams(upLayoutParams);
            tvUp.setText(s);

            downLayoutParams.height = ResolutionAdaptationUtils.dip2px(this, height);
            tvDown.setLayoutParams(downLayoutParams);
            tvDown.setText(s);
        }
    }
}
