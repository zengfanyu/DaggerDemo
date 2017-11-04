package com.project.fanyuzeng.daggerdemo.di.module;

import com.project.fanyuzeng.daggerdemo.Flower;
import com.project.fanyuzeng.daggerdemo.Pot;
import com.project.fanyuzeng.daggerdemo.di.component.FlowerComponent;

import dagger.Module;
import dagger.Provides;

/**
 * @author:fanyuzeng
 * @date: 2017/11/3 17:04
 * @desc:
 */
@Module
public class PotModule {

    @Provides
    Pot providePot(@FlowerComponent.RoseFlower Flower flower) {
        return new Pot(flower);
    }


}
