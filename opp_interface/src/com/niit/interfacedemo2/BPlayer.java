package com.niit.interfacedemo2;

public class BPlayer extends Person{
    public BPlayer() {
    }

    public BPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学打蓝球");
    }


}
