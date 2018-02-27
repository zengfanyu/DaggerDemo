package com.project.fanyuzeng.daggerdemo.di.module;

import com.project.fanyuzeng.daggerdemo.Animal;
import com.project.fanyuzeng.daggerdemo.Zoom;
import com.project.fanyuzeng.daggerdemo.di.annotation.TigerAnimal;

import dagger.Module;
import dagger.Provides;

/**
 * @author: fanyuzeng on 2018/2/27 15:13
 */
@Module
public class ZoomModule {
    @Provides
    Zoom provideZoomWithTiger(@TigerAnimal Animal animal) {
        return new Zoom(animal);
    }

}
