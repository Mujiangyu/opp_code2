package com.niit.interfacedemo3;

public interface Inter2 {

    public default void show(){
        System.out.println("inter2接口中的默认方法,实现类在实现其时,可以不用重写");
    }
}
