package com.niit.test;

public class test {
    public static void main(String[] args) {
       /* final修饰方法:
            表示方法时最终方法,不能被重写
          final修饰类
            表示该类时最终类,不能被继承
          final修饰变量
            表示将改变量转变为常量,只能被赋值一次


            final修饰的变量是基本类型,变量存储的数据值不能发生改变
            final修饰的变量是引用类型,变脸存储的地址值不能发生改变,但对象内部的数据可以发生改变
       */

        /*final*/ int a = 10;
        System.out.println(a);
//        Cannot assign a value to final variable 'a'
        a = 20;

    }
}
/*final*/ class Fu{
    public /*final*/ void show(){
        System.out.println("父类的show方法");
    }
}
//    Cannot inherit from final 'com.niit.test.Fu'
class Zi extends Fu{
    @Override
//    'show()' cannot override 'show()' in 'com.niit.test.Fu'; overridden method is final
    public void show() {
        System.out.println("子类的show方法");
    }
}