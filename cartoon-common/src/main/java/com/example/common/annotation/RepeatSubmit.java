package com.example.common.annotation;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepeatSubmit {

    //默认间隔时间
    public int interval() default 5000;

    //提示消息
    public String message() default "无法重复提交";
}
