package com.project.fanyuzeng.daggerdemo.di.component;

import com.project.fanyuzeng.daggerdemo.MainActivity;

import dagger.Component;

/**
 * @author:fanyuzeng
 * @date: 2017/11/3 15:58
 * @desc:
 */
@Component(dependencies = PotComponent.class)
public interface MainActivityComponent {
    void injectPot(MainActivity activity);
}
