package com.niit.innerclassdemo3;

public class Outer {
    private int a = 10;
    class Inner{
        private int a = 20;
        //outer.this 获取了外部类对象的地址值
        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(new Outer().a);
            System.out.println(Outer.this.a);
        }
    }
}
