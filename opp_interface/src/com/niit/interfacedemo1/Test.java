package com.niit.interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Animal a = new Frog("小青蛙",2);
        a.eat();
        String info = a.toString();
        System.out.println(info);
        ((Frog) a).swim();

        System.out.println("---------------------");
        Animal a1 = new Dog("小狗",2);
        String info2 = a1.toString();
        System.out.println(info2);
        ((Dog) a1).swim();
        a1.eat();
    }
}
