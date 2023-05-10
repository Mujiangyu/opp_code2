package com.niit.interfacedemo3;

public class InterImpl implements Inter,Inter2{
    @Override
    public void method() {
        System.out.println("实现接口中的抽象放法");
    }

    //同时实现的多个接口中,如果有重名的默认方法,则在实现类中必须对其进行强制重写

    @Override
    public void show() {
        System.out.println("重写接口中的默认方法,重写时,不能再加上default关键字");
    }
}
