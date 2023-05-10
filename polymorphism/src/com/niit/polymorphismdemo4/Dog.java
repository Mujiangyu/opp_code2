package com.niit.polymorphismdemo4;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "的狗,保住" + food + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}
