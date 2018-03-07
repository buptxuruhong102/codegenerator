package com.xrh.springmvcbase.annotation;

import java.lang.annotation.*;

/**
 * Created by xuruhong on 2018/3/7.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Menu {
    String value() default "";

    String name() default "";
}
