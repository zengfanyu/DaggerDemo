package com.project.fanyuzeng.daggerdemo.di.component;

import com.project.fanyuzeng.daggerdemo.Pot;
import com.project.fanyuzeng.daggerdemo.di.module.PotModule;

import dagger.Component;

/**
 * @author:fanyuzeng
 * @date: 2017/11/3 17:21
 * @desc:
 */
@Component(modules = PotModule.class , dependencies = FlowerComponent.class)
public interface PotComponent {

    Pot getPot();

}
