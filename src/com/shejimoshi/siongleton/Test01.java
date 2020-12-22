package com.shejimoshi.siongleton;

/**
 * 饿汉式
 * 因为类加载到内存，就实例化一个对象，JVM保证线程安全
 * 简单，推荐
 * 唯一缺点，不管是否使用，类装载时就完成实例化 （不用装载，浪费）
 */

public class Test01 {
    private static final Test01 INSTANCE = new Test01();

    private Test01() {
    }

    public static Test01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {

        Test01 t1 = Test01.getInstance();
        Test01 t2 = Test01.getInstance();
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
