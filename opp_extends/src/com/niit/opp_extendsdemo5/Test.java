package com.niit.opp_extendsdemo5;

public class Test {
    public static void main(String[] args) {
        //创建对象并赋值调用
        Manager m = new Manager("101","norman",100000,50000);
        System.out.println(m.getId()+", "+m.getName()+", "+m.getSalary()+", "+m.getAword());
        m.work();
        m.eat();



        Cooker c = new Cooker();
        c.setId("102");
        c.setName("qingshan");
        c.setSalary(100000);
        System.out.println(c.getId()+", "+c.getName()+", "+c.getSalary());

        c.work();
        c.eat();
    }
}
