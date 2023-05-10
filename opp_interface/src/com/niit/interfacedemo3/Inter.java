package com.niit.interfacedemo3;

public interface Inter {

    public abstract void method();

    //默认方法不是抽象方法,不需要强制重写
    public default void show(){
        System.out.println("inter接口中的默认方法,实现类在实现其时,可以不用重写");
    }
}
