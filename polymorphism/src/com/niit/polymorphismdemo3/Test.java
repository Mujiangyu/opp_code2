package com.niit.polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        //调用成员变量时,编译看左边,运行看右边
        a.eat();
        //多态的弊端
        //不能调用子类的特有功能(即父类中没有的方法)
//        a.catchMouse();
        //报错的原因
        //调用成员变量时,编译看左边,运行看右边,先在父类中检查有没有该方法,如果没有方法,直接报错

        //解决方案
        //变回子类类型
        /*if(a instanceof Dog) {
            Dog d = (Dog) a;
        }else if(a instanceof Cat){
            Cat c = (Cat) a;
        }else {
            System.out.println("没有这个类型");
        }*/
        //新特性
        //先判断a是否为dog类型,如果是,直接强转成dog类型,变量名为d,不是就不进行墙砖,结果为false
        /*if (a instanceof Dog d) {
            Dog d = (Dog) a;
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
        } else {
            System.out.println("没有这个类型");

        }*/
    }
}
class Animal{
    public void eat(){
        System.out.println("动物吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗在啃骨头");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫在吃小鱼干");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}