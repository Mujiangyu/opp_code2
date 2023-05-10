package com.niit.opp_extendsdemo4;

public class Student {
    String name;
    int age;
    String school;

    public Student(){
        //this()表示调用本类中的其他构造方法
        this(null,0,"HNU");
    }
    public Student(String name,int age,String school){
        this.name = name;
        this.age = age;
        this.school = school;
        print();
    }
    public void print(){
        System.out.println(name + ", "+age+", "+school);
    }
}
