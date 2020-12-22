package com.shejimoshi.siongleton;


/**
 * 不仅解决线程同步，还可以防止反序列化，最优写法
 */

public enum  Test06 {

    INSTANCE;

    public static void test(){
        System.out.println("业务方法");
    }

    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            new Thread(()->{
                System.out.println(Test06.INSTANCE.hashCode());
                Test06.test();
            }).start();
        }
    }
}
