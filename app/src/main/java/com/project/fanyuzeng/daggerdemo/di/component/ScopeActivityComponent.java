package com.project.fanyuzeng.daggerdemo.di.component;

import com.project.fanyuzeng.daggerdemo.ScopeActivity;
import com.project.fanyuzeng.daggerdemo.di.annotation.ActivityScope;

import dagger.Component;

/**
 * @author: fanyuzeng on 2018/2/27 16:03
 */
@ActivityScope
@Component(dependencies = ZoomComponent.class)
public interface ScopeActivityComponent {
    void inject(ScopeActivity activity);

}
