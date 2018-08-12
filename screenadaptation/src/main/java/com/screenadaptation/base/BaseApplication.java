package com.screenadaptation.base;

import android.app.Activity;
import android.content.Context;
import android.support.multidex.MultiDexApplication;

import java.util.Set;

/**
 * @author sam
 * @version 1.0
 * @date 2018/3/2
 */
public class BaseApplication extends MultiDexApplication {
    private static Context mContext;
    private static BaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        instance = this;
        init();
    }

    
    /**
     * 得到Application环境变量
     * @return
     */
    public static Context getContext() {
        return mContext;
    }
    
    public static BaseApplication getBaseApplication(){
        return instance;
    }

    /**
     * 初始化话app信息
     */
    private void init() {
//        initFragmentation();
    }

    
    /**
     * 退出app
     */
    public void exitApp() {
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}


