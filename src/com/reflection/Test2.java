package com.reflection;

//测试class类的创建方式有哪些
public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println(person.name);

        //通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //forname获得
        Class c2 = Class.forName("com.reflection.Student");
        System.out.println(c2.hashCode());

        //通过.class
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //基本内置类型的包装类都有一个TYPE属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        //获取父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }
}


class Person{
    public String name;

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}


