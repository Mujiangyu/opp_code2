package com.niit.polymorphismdemo4;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫,保住" + food + "猛吃");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
