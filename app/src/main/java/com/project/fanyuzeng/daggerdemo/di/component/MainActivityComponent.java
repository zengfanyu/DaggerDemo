package com.project.fanyuzeng.daggerdemo.di.component;

import com.project.fanyuzeng.daggerdemo.MainActivity;
import com.project.fanyuzeng.daggerdemo.di.annotation.ActivityScope;

import dagger.Component;

/**
 * @author: fanyuzeng on 2018/2/27 14:23
 */
@ActivityScope
@Component(dependencies = ZoomComponent.class)
public interface MainActivityComponent {

    void inject(MainActivity activity);

}
