package com.project.fanyuzeng.daggerdemo.util;

import android.util.Log;

/**
 * @author: fanyuzeng on 2018/2/27 14:28
 */
public class LogUtils {
    private static final String TAG = "===DaggerDemo===";

    public static void d(String tag, String msg) {
        Log.d(TAG, tag + " " + msg);
    }
}
