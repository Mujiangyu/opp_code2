package com.niit.opp_extendsdemo1;

public class Animal {
    //只有将父类中的成员的修饰符定义为public，子类才能调用
    //若为private，则子类无法进行调用
    //子类只能访问父类中非私有的成员
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
