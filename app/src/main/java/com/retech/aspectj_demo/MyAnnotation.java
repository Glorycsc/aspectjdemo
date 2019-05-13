package com.retech.aspectj_demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Create by glorizz on 2019/1/4
 * Describe:自定义注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    abstract String value() default "Glory";

    String[] getArgs() default "Glory";

}
