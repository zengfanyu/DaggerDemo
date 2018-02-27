package com.project.fanyuzeng.daggerdemo.di.module;

import com.project.fanyuzeng.daggerdemo.Animal;
import com.project.fanyuzeng.daggerdemo.Dog;
import com.project.fanyuzeng.daggerdemo.Tiger;
import com.project.fanyuzeng.daggerdemo.di.annotation.DogAnimal;
import com.project.fanyuzeng.daggerdemo.di.annotation.TigerAnimal;

import dagger.Module;
import dagger.Provides;

/**
 * @author: fanyuzeng on 2018/2/27 14:37
 */
@Module
public class AnimalModule {
    @Provides
    @TigerAnimal
    Animal provideTiger() {
        return new Tiger();
    }

    @Provides
    @DogAnimal
    Animal provideDog() {
        return new Dog();
    }
}
