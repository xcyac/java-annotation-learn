package com.shejimoshi.siongleton;

/**
 *  懒汉式    双重检查机制
 *  加锁保证多线程下是同一个对象
 *  因为加锁会带来效率下降
 *  优化加锁操作，加在代码块上
 *
 */

public class Test04 {

    private static volatile Test04 INSTANCE;   //指令重排

    private Test04() {
    }


    public static Test04 getInstance(){

        //避免多次上锁
        if (INSTANCE == null){
            synchronized (Test04.class){
                //双重检查机制
                if (INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    INSTANCE = new Test04();
                }

            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            new Thread(()->{
                System.out.println(Test04.getInstance().hashCode());
            }).start();
        }
    }
}
