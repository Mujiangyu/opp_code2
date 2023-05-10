package com.niit.Test;

public class Test2 {
    public static void main(String[] args) {
        OverseaStudent os = new OverseaStudent();
        os.lunch();
    }
}
class Person{
    public void eat(){
        System.out.println("吃米饭");
    }
    public void drink(){
        System.out.println("喝开水");
    }
}

class OverseaStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    //当父类中的方法不能满足子类现在的需求时，需要把这个方法进行重写
    //子类中重写的方法上面需要加上@override
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}
