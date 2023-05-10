package com.niit.innerclassdemo5;

public class Outer {

    int b = 20;
    public void show(){
        int a = 30;
        class Inner{
            String name;
            int age;

            public void method(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的方法method");
            }

            public static void method2(){
                System.out.println("局部内部类中方的静态方法method2");
            }
        }


        //创建具备内部类的对象
        Inner i =  new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method();
        Inner.method2();
    }
}
