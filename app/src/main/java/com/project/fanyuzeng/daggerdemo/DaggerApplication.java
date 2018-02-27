package com.project.fanyuzeng.daggerdemo;

import android.app.Application;

import com.project.fanyuzeng.daggerdemo.di.component.DaggerAnimalComponent;
import com.project.fanyuzeng.daggerdemo.di.component.DaggerZoomComponent;
import com.project.fanyuzeng.daggerdemo.di.component.ZoomComponent;

/**
 * @author: fanyuzeng on 2018/2/27 16:11
 */
public class DaggerApplication extends Application {
    private ZoomComponent mZoomComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mZoomComponent = DaggerZoomComponent.builder().animalComponent(DaggerAnimalComponent.create())
                .build();
    }

    public ZoomComponent getZoomComponent() {
        return mZoomComponent;
    }
}
