package com.niit.interfacedemo4;

public interface Inter {

    public abstract void method();

    //接口中的静态方法,不能被重写,调用时直接用"接口名.方法名()"
    public static void show(){
        System.out.println("inter接口中的静态方法");
    }
}
