package com.project.fanyuzeng.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.project.fanyuzeng.daggerdemo.di.component.DaggerFlowerComponent;
import com.project.fanyuzeng.daggerdemo.di.component.DaggerMainActivityComponent;
import com.project.fanyuzeng.daggerdemo.di.component.DaggerPotComponent;
import com.project.fanyuzeng.daggerdemo.di.component.FlowerComponent;
import com.project.fanyuzeng.daggerdemo.di.component.MainActivityComponent;
import com.project.fanyuzeng.daggerdemo.di.component.PotComponent;

import javax.inject.Inject;

/**
 * @author fanyuzeng
 */
public class MainActivity extends AppCompatActivity {
    /**
     * 需要注入的依赖
     */
    @Inject
    Pot mPot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tip = (TextView) findViewById(R.id.id_tv_tip);



        /*DaggerMainActivityComponent.create() == DaggerMainActivityComponent.builder().build();*/

        FlowerComponent flowerComponent = DaggerFlowerComponent.create();
        PotComponent potComponent = DaggerPotComponent.builder().flowerComponent(flowerComponent).build();
        MainActivityComponent mainActivityComponent = DaggerMainActivityComponent.builder().potComponent(potComponent).build();

        mainActivityComponent.injectPot(this);

        String show = mPot.show();
        tip.setText(show);

    }
}
