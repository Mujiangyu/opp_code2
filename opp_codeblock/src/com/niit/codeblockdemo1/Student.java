package com.niit.codeblockdemo1;

public class Student {
    private String name;
    private int age;

    //构造代码块
    //1.写在成员位置的代码块
    //2.作用:可以把多个构造方法中重复的代码抽取出来
    //3.执行时机:创建本类对象时,会先执行构造代码快中的代码再执行构造方法
//    {
//        System.out.println("创建对象");
//
//    }

    public Student() {
        this(null,0);
    }

    public Student(String name, int age) {
        System.out.println("执行带参构造");

        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


}
