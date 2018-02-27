package com.project.fanyuzeng.daggerdemo.di.component;

import com.project.fanyuzeng.daggerdemo.Zoom;
import com.project.fanyuzeng.daggerdemo.di.module.ZoomModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author: fanyuzeng on 2018/2/27 15:24
 */
@Singleton
@Component(modules = ZoomModule.class, dependencies = AnimalComponent.class)
public interface ZoomComponent {

    Zoom getRoom();

}
