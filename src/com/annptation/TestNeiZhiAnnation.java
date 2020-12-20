package com.annptation;



//内置注解

public class TestNeiZhiAnnation {

    //重写注解
    @Override
    public String toString() {
        return super.toString();
    }

    //废弃的注解，不建议使用
    @Deprecated
    public void test(){

    }

    //忽略警告的注解
    @SuppressWarnings("all")
    public void test1(){

    }
}
