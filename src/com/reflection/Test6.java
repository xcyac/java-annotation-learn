package com.reflection;

/*
类加载器
 */
public class Test6 {

    public static void main(String[] args) throws ClassNotFoundException {

        /**
         * 三种加载器
         * 1.根加载器 c++
         * 2.扩展类加载器
         * 3.系统类加载器
         */

        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器--》扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器--》根加载器(c++) 会返回 null
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.reflection.Test6").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置类的加载器
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //双亲委派机制   如果自己命名的包和系统的包一样，会加载系统的，不会加载自己的

        //获得系统类加载加载的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
