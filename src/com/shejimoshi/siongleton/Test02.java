package com.shejimoshi.siongleton;

import sun.dc.pr.PRError;

/**
 *  懒汉式
 *  使用的时候在装载类，多个线程访问时使用的不是同一个对象（线程不安全）
 */

public class Test02 {

    private static Test02 INSTANCE;

    private Test02() {
    }


    public static Test02 getInstance(){
        if (INSTANCE == null){

            //测试多线程访问
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Test02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            new Thread(()->{
                System.out.println(Test02.getInstance().hashCode());
            }).start();
        }
    }
}
