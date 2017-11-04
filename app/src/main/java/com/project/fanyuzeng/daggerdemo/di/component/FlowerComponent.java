package com.project.fanyuzeng.daggerdemo.di.component;

import com.project.fanyuzeng.daggerdemo.Flower;
import com.project.fanyuzeng.daggerdemo.di.module.FlowerModule;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

import dagger.Component;

/**
 * @author:fanyuzeng
 * @date: 2017/11/3 17:18
 * @desc:
 */
@Component(modules = FlowerModule.class)
public interface FlowerComponent {
///////////////////////这里是定义注解/////////////////////////////////
    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface RoseFlower {
    }

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LilyFlower {
    }
///////////////////////////////////////////////////////
    @RoseFlower
    Flower getRoseFlower();

    @LilyFlower
    Flower getLilyFlower();
}
