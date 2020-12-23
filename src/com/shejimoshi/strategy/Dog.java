package com.shejimoshi.strategy;

public class Dog implements Comparable<Dog>{
    int food;

    public Dog(int food) {
        this.food = food;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }

    @Override
    public int compareTo(Dog c) {
        System.out.println(this.food);
        System.out.println(c.food);
        if (this.food<c.food) return -1;
        else if (this.food>c.food) return 1;
        else return 0;
    }
}
