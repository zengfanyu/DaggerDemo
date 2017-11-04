package com.project.fanyuzeng.daggerdemo.di.module;

import com.project.fanyuzeng.daggerdemo.Flower;
import com.project.fanyuzeng.daggerdemo.Lily;
import com.project.fanyuzeng.daggerdemo.Rose;
import com.project.fanyuzeng.daggerdemo.di.component.FlowerComponent;

import dagger.Module;
import dagger.Provides;

/**
 * @author:fanyuzeng
 * @date: 2017/11/3 16:44
 * @desc:
 */
@Module
public class FlowerModule {

    @Provides
    @FlowerComponent.RoseFlower
    public Flower provideFlowerRose() {
        return new Rose();
    }
    @Provides
    @FlowerComponent.LilyFlower
    public Flower provideFlowerLily() {
        return new Lily();
    }
}
