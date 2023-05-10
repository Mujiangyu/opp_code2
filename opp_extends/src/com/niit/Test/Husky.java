package com.niit.Test;

public class Husky extends Dog{
    Husky(){
        super();
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("吃狗粮");
    }
    public void beakHome(){
        System.out.println("拆家");
    }
}
