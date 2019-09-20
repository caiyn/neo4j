package com.example.myexample1.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DemoAnnotation {
    String username() default "aa";
}
