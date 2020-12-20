package com.annptation;


import java.lang.annotation.*;

//元注解
public class YuanAnnotation {

    public void test(){

    }
}

//注解作用域
@Target({ElementType.TYPE,ElementType.METHOD})
//注解在什么地方有效
@Retention(RetentionPolicy.RUNTIME)
//注解是否生成在javadoc中
@Documented
//子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
