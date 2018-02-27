package com.project.fanyuzeng.daggerdemo;

import com.project.fanyuzeng.daggerdemo.util.LogUtils;


/**
 * @author: fanyuzeng on 2018/2/27 15:01
 */
public class Zoom {
    private static final String TAG = "==Zoom==";
    private Animal mAnimal;

    public Zoom(Animal animal) {
        mAnimal = animal;
    }

    public void show() {
        LogUtils.d(TAG, "Zoom contains " + mAnimal.getClass().getName());
    }
}
