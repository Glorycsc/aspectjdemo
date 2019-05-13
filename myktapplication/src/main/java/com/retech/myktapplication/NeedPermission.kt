package com.retech.myktapplication

import java.lang.annotation.RetentionPolicy

/**
 *Create by glorizz on 2019/1/7
 *Describe:
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class NeedPermission(val pemissionName:String)

@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class MyAnnotation(val value: String = "Glory", val getArgs: Array<String> = arrayOf("Glory"))