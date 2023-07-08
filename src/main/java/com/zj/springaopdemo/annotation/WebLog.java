package com.zj.springaopdemo.annotation;

import java.lang.annotation.*;

/**
 * 切点
 * 使用了该注解的方法会进行日志的打印
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface WebLog {
}
