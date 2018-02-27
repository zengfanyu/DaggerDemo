package com.project.fanyuzeng.daggerdemo.di.component;

import com.project.fanyuzeng.daggerdemo.Animal;
import com.project.fanyuzeng.daggerdemo.di.annotation.DogAnimal;
import com.project.fanyuzeng.daggerdemo.di.annotation.TigerAnimal;
import com.project.fanyuzeng.daggerdemo.di.module.AnimalModule;

import dagger.Component;

/**
 * @author: fanyuzeng on 2018/2/27 15:19
 */
@Component(modules = AnimalModule.class)
public interface AnimalComponent {

    @TigerAnimal
    Animal getTigerAnimal();

    @DogAnimal
    Animal getDogAnimal();
}
