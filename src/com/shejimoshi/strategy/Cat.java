package com.shejimoshi.strategy;

public class Cat implements Comparable<Cat>{
    int weight;

    public Cat(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Cat c) {
        if (this.weight<c.weight) return -1;
        else if (this.weight>c.weight) return 1;
        else return 0;
    }
}
