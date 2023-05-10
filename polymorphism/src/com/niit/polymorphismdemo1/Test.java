package com.niit.polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("norman");
        s.setAge(22);

        Teacher t = new Teacher();
        t.setName("mei");
        t.setAge(23);

        Adminstractor a = new Adminstractor();
        a.setName("qian");
        a.setAge(23);


        register(s);
        register(t);
        register(a);
    }


    //希望这个方法既能接收老师，学生也能接收管理员
    //只能吧参数携程这三个类型的父类
    public static void register(Person p){
        p.show();
    }
}
