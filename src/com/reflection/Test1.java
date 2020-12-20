package com.reflection;

public class Test1 {

    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取class对象
        Class c1 = Class.forName("com.reflection.User");
        System.out.println(c1);

        Class c2 = Class.forName("com.reflection.User");
        Class c3 = Class.forName("com.reflection.User");

        //一个类在内存中只有一个class对象
        //一个类被加载后整个结构都会被加载在class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

    }
}


class User{
    private String name;
    private int age;
    private String sex;

    public User(){

    }

    public User(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
