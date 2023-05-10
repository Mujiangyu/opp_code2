package com.niit.polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //创建一个父类引用，将子类对象赋值给父类引用
        Animal a = new Cat();
        //调用成员变量：编译看左边，运行也看左边
        //编译看左边：javac编译代码的时候，会看左边的父类中是否有这个变量，如果有，编译成功，否则就编译失败
        //运行也看左边：java运行代码的时候，实际获取的就是左边父类中的成员变量的值
        System.out.println(a.name);
        //调用成员方法：编译看左边，运行看右边
        //编译看左边：javac编译代码的时候，会看左边的父类中是否有这个方法，如果有，编译成功，否则就编译失败
        //运行看右边：java运行代码的时候，实际上运行的是子类中的方法
        a.show();

        //理解：
        //Animal a = new Cat();
        //a是animal类型的，所以默认都会从animal这个类中去找

        //成员变量：在子类对象中，会把父类的成员变量也继承下来，父：name   子：name，因为使用父类的对象调用的，所以会访问父：name
        //成员方法：如果子类对方法进行了重写，那么再虚方法表中，那么在虚方法表中会把父类的方法进行覆盖

    }
}

class Animal {
    String name = "动物";

    public void show() {
        System.out.println("Animal---------show");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat---------show");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog----------show");
    }
}