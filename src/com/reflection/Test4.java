package com.reflection;

/*
类的加载过程
 */
public class Test4 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);

        /*
        1.加载到内存，产生一个class对象
        2.链接，链接结束后 m = 0
        3.初始化
            <clinit>(){

            }
         */
    }
}


class A{



    static {
        System.out.println("A类静态方法");
        m = 300;
    }

    static int m = 100;


    public A() {
        System.out.println("A类的构造方法");
    }
}
