package com.project.fanyuzeng.daggerdemo.di.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author: fanyuzeng on 2018/2/27 15:07
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface TigerAnimal {
}
