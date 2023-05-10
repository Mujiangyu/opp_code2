package com.niit.abstractdemo1;

public class Test {
    public static void main(String[] args) {

        Person p = new Student("norman",22);
        System.out.println(p.getAge()+", "+p.getName());
        p.work();
    }
}
