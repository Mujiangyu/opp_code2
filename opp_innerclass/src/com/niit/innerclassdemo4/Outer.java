package com.niit.innerclassdemo4;

public class Outer {
    int a = 10;
    static int b = 10;
    //静态内部类
    static class Inner{

        public void show(){
            /*Outer o = new Outer();

            System.out.println(o.a);

            System.out.println(b);*/


            System.out.println("非静态方法调用");
        }

        public static void show2(){
            System.out.println("静态方法调用");
        /*    Outer o = new Outer();

            System.out.println(o.a);

            System.out.println(b);*/
        }
    }
}
