package com.niit.opp_extendsdemo3;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("父类的无参构造");
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(this.age+", " +this.name);
    }
}
