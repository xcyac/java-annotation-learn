package com.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
类的运行结构
 */
public class Test7 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
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

        //获取指定属性的值
        Field name = c1.getDeclaredField("name");

        //获取类中的方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println("本类和父类全部的public方法:"+method);
        }

        methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("本类的全部方法:"+method);
        }

        //获取类的指定方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        //获取类的构造方法
        System.out.println("============");
        Constructor[] constructors = c1.getConstructors();     //获取public的构造方法
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        constructors  = c1.getDeclaredConstructors();         //获取全部的构造方法
        for (Constructor constructor : constructors) {
            System.out.println("###:"+constructor);
        }

        //获取类的指定构造器
        System.out.println("===========");
        Constructor constructor = c1.getConstructor();
        System.out.println(constructor);
        constructor = c1.getConstructor(String.class,int.class,String.class);
        System.out.println(constructor);

    }
}
