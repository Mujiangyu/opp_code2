package com.niit.opp_extendsdemo3;

public class Student extends Person{
    public Student(){
        //子类的构造方法中隐藏着一个super()，用以访问父类的无参构造方法
        //必须写在第一行
        super();
        System.out.println("子类的无参构造");
    }
    public Student(String name,int age){
        //调用父类的带参构造,需要自己手动书写
        super(name,age);
    }

}
