package com.niit.abstractdemo1;

public class Student extends Person{

    public Student() {
    }

    public Student(String name,int age) {
        super(name,age);
    }

    @Override
    public void work() {
        System.out.println("学生在上课");
    }

    public String toString() {
        return "Student{}";
    }
}
