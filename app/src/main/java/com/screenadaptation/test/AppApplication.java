package com.screenadaptation.test;

import com.screenadaptation.base.BaseApplication;
/**
 * @author sam
 * @version 1.0
 * @date 2018/3/2
 */
public class AppApplication extends BaseApplication {
    private static AppApplication application;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        initConfig();
    }

    public static AppApplication getInstance() {
        return application;
    }

    private void initConfig(){
    }
}


