package com.niit.interfacedemo3;

public class Test {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.method();
        ii.show();//可以直接调用接口中的默认方法
    }
}
