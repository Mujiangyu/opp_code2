package com.niit.innerclassdemo5;

public class Test {
    //1.将内部类定义在方法里面就叫做局部内部类,类似于方法里面的局部变量
    //2.外界是无法直接使用局部内部类,需要在方法内部创建对象并使用
    //3.该类可以直接访问外部类成员,也可以访问方法内的局部变量

    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();
    }

}
