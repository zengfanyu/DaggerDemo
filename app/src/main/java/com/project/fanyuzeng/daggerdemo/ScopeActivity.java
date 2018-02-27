package com.project.fanyuzeng.daggerdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.project.fanyuzeng.daggerdemo.di.component.DaggerScopeActivityComponent;
import com.project.fanyuzeng.daggerdemo.util.LogUtils;

import javax.inject.Inject;

/**
 * @author: fanyuzeng on 2018/2/27 15:59
 */
public class ScopeActivity extends AppCompatActivity {
    private static final String TAG = "==ScopeActivity==";
    @Inject
    Zoom mZoom3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        DaggerScopeActivityComponent.builder().zoomComponent(
//                DaggerZoomComponent.builder().animalComponent(
//                        DaggerAnimalComponent.create()
//                ).build())
//                .build().inject(this);

        DaggerScopeActivityComponent.builder().zoomComponent(
                ((DaggerApplication)getApplication()).getZoomComponent())
                .build().inject(this);

        LogUtils.d(TAG, "mZoom3 hashCode=" + mZoom3.hashCode());

    }

    public static void launchActivity(Activity activity) {
        Intent intent = new Intent(activity, ScopeActivity.class);
        activity.startActivity(intent);


    }
}
