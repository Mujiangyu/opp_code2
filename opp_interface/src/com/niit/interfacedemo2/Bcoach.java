package com.niit.interfacedemo2;

public class Bcoach extends Person{
    public Bcoach() {
    }

    public Bcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教打篮球");
    }
}
