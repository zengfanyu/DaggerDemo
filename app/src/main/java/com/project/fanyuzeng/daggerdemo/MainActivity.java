package com.project.fanyuzeng.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.project.fanyuzeng.daggerdemo.di.component.DaggerMainActivityComponent;
import com.project.fanyuzeng.daggerdemo.util.LogUtils;

import javax.inject.Inject;

/**
 * @author fanyuzeng
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "==MainActivity==";


    @Inject
    Zoom mZoom1;

    @Inject
    Zoom mZoom2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerMainActivityComponent.builder()
//                .zoomComponent(
//                        DaggerZoomComponent.builder()
//                                .animalComponent(
//                                        DaggerAnimalComponent.create())
//                                .build())
//                .build().inject(this);


        DaggerMainActivityComponent.builder()
                .zoomComponent(
                        ((DaggerApplication)getApplication()).getZoomComponent())
                .build().inject(this);

        findViewById(R.id.id_btn_jump).setOnClickListener(v -> {
            ScopeActivity.launchActivity(MainActivity.this);

        });

        LogUtils.d(TAG, "mZoom1 hashCode=" + mZoom1.hashCode());
        LogUtils.d(TAG, "mZoom1 hashCode=" + mZoom1.hashCode());
    }
}
