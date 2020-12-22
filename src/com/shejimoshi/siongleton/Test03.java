package com.shejimoshi.siongleton;

/**
 *  懒汉式  加锁保证多线程下是同一个对象
 *  因为加锁会带来效率下降
 */

public class Test03 {

    private static Test03 INSTANCE;

    private Test03() {
    }


    public static synchronized Test03 getInstance(){


        if (INSTANCE == null){

            //测试多线程访问
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Test03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            new Thread(()->{
                System.out.println(Test03.getInstance().hashCode());
            }).start();
        }
    }
}
