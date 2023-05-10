package com.niit.innerclassdemo4;

public class Test {
    public static void main(String[] args) {
        //1.静态内部类是成员内部类的一种
        //2.静态内部类只能访问外部类中的静态方法和静态变量,
        //如果要访问非静态成员,则需要创建外部类对象

        //创建静态内部类对象的格式:
        //      外部类名.内部类名 对象名 = new 外部类名.内部类名();
        //调用静态方法的格式:
        //      外部类名.内部类名.方法名();
        Outer.Inner oi = new Outer.Inner();
        oi.show();
//        oi.show2();由于调用的是内部类,等价与下面这行代码
        Outer.Inner.show2();




    }
}
