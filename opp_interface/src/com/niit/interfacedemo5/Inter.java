package com.niit.interfacedemo5;

public interface Inter {

    public default void show(){
        System.out.println("show1开始执行 了");
        show3();
    }

    public default void show2(){
        System.out.println("show2开始执行 了");
        show3();
    }


    //普通的私有方法是给接口中的默认方法服务的
    //静态的私有方法是给接口中的静态方法服务的
    public default /*private*/ void show3(){
        System.out.println("记录程序在运行过程中的各种细节,这里有100行代码");
    }

}
