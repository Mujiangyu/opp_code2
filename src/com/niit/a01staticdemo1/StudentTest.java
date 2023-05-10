package com.niit.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //需求，为学生对象新增一个属性，老师的姓名
        //可以使用static
        //一旦定义了static属性，该类的所有对象就都共享了该属性的值

        //static修饰的属性可以用类名直接调用
        Student.teacher = "norman";//与第十五行的效果是一样的
        Student s1 = new Student();
        s1.setName("norman");
        s1.setAge(22);
        s1.setGender("男");
//        s1.teacher = "norman";
        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("mei");
        s2.setAge(23);
        s2.setGender("女");
        s2.study();
        s2.show();
    }
}
