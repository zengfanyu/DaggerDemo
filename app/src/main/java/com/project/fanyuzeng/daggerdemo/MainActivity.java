package com.project.fanyuzeng.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.project.fanyuzeng.daggerdemo.di.component.DaggerAnimalComponent;
import com.project.fanyuzeng.daggerdemo.di.component.DaggerMainActivityComponent;
import com.project.fanyuzeng.daggerdemo.di.component.DaggerZoomComponent;

import javax.inject.Inject;

/**
 * @author fanyuzeng
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "==MainActivity==";


    @Inject
    Zoom mZoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent.builder()
                .zoomComponent(
                        DaggerZoomComponent.builder()
                                .animalComponent(
                                        DaggerAnimalComponent.create())
                                .build())
                .build().inject(this);


        mZoom.show();
    }
}
