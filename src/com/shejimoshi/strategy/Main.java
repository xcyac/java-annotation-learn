package com.shejimoshi.strategy;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 策略设计模式
 * 扩展不同的策略
 * 角色：
 *      上下文（sorter）
 *      抽象策略  (Comparable)
 *      具体策略  (Cpmparetor)
 */

public class Main {

    public static void main(String[] args) {
//        int[] a = {3,5,7,1,9,0};
//        Cat[] a = {new Cat(3),new Cat(5),new Cat(1)};
        Dog[] a = {new Dog(3),new Dog(5),new Dog(1)};
        Sorder<Dog> sorder = new Sorder();
        sorder.sort(a,(o1,o2)->{
            if (o1.food>o2.food) return -1;
            else if (o1.food<o2.food) return 1;
            return 0;
        });
        System.out.println(Arrays.toString(a));
    }
}
