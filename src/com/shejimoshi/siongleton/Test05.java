package com.shejimoshi.siongleton;

/**
 *  静态内部类
 *  线程安全（JVM保证，保证只有一个class对象）
 *
 */

public class Test05 {


    private Test05() {
    }

    private static class Test05Holder{
        private static final Test05 INSTANCE = new Test05();
    }

    public static Test05 getInstance(){

        return Test05Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            new Thread(()->{
                System.out.println(Test05.getInstance().hashCode());
            }).start();
        }
    }
}
