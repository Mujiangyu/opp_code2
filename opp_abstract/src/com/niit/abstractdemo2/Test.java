package com.niit.abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙", 2);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.drink();
    }
}
