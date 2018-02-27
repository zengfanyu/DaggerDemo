package com.project.fanyuzeng.daggerdemo.di.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author: fanyuzeng on 2018/2/27 15:52
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {


}
