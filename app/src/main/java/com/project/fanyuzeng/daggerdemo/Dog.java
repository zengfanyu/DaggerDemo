package com.project.fanyuzeng.daggerdemo;

import com.project.fanyuzeng.daggerdemo.util.LogUtils;

/**
 * @author: fanyuzeng on 2018/2/27 14:39
 */
public class Dog implements Animal {
    private static final String TAG = "==Dog==";

    @Override
    public void name() {
        LogUtils.d(TAG, "My name is dog");
    }

    @Override
    public void eat() {
        LogUtils.d(TAG, "I eat bone");
    }
}
