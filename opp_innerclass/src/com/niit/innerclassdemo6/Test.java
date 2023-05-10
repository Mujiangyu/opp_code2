package com.niit.innerclassdemo6;

public class Test {
    public static void main(String[] args) {
        /*匿名内部类的格式:
        new 类名或接口名(){
          重写方法;
        };

        */
        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        Animal a = new Animal(){

            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        };
        method(a);

    }

    public static void method(Animal a){
        a.eat();
    }
}
