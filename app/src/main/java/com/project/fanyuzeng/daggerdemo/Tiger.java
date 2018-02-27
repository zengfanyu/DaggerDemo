package com.project.fanyuzeng.daggerdemo;

import com.project.fanyuzeng.daggerdemo.util.LogUtils;

/**
 * @author: fanyuzeng on 2018/2/27 14:40
 */
public class Tiger implements Animal {
    private static final String TAG = "==Tiger==";

    @Override
    public void name() {
        LogUtils.d(TAG, "My name is tiger");
    }

    @Override
    public void eat() {
        LogUtils.d(TAG, "I eat meat");
    }
}
