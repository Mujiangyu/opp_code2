package com.niit.innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;

    //外部类不能直接访问内部类,若要访问,必须创建对象
    public void show(){
        System.out.println(carName);
//        System.out.println(engineName);
        Engine e = new Engine();
        e.engineNmae = "mei";
        System.out.println(e.engineNmae);
    }

    //何时用到内部类
    //B类表示的事物是A类的一部分,且B类单独存在没有意义
    class Engine{
        String engineNmae;
        int engineAge;
        //内部类可以访问外部类的成员,包括私有
        public void show(){
            System.out.println(engineNmae);
            System.out.println(carName);
        }
    }

}
