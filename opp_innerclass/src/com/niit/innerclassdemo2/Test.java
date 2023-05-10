package com.niit.innerclassdemo2;

public class Test {
    public static void main(String[] args) {

        //获取成员内部类的两种方式
        //1.外部类编写方法,对外提供内部类对象
        //2.直接创建:外部类名.内部类名 对象名 = new 外部类().new 内部类()

//        Outer.Inner in = new Outer().new Inner();
        Object inner = new Outer().getInstance();
        System.out.println(new Outer().getInstance());
    }
}
