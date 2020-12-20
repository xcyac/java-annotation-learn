package com.annptation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
public class ZiDingYiAnnotation {

    @MyAnnotation1("test")
    public void test1(){}
}



@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1{

    String value();  //使用value 可以不写  value=
    int age() default 1;  //默认值
    int id() default -1;  //默认值为-1，表示不存在
    String [] name() default {"aa",""}; //
}