package com.reflection;


import java.lang.reflect.Field;

/*
类的运行结构
 */
public class Test7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("com.reflection.User");

        //获取类的名字
        System.out.println(c1.getName());      //包名+类名
        System.out.println(c1.getSimpleName());   //类名

        //获取类的属性
        Field[] fields = c1.getFields();//获取pubilc属性
        for (Field field :fields){
            System.out.println(field);
        }
        Field[] fields1 = c1.getDeclaredFields();   //获取所有属性
        for (Field field:fields1){
            System.out.println(field);
        }

    }
}
