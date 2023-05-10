package com.niit.codeblockdemo2;

public class Student {
    private String name;
    private int age;

    //执行时机:
    //随着类的加载而加载的,并且只执行一次
    //可以在程序刚开始时,初始化一些数据
    static {
        System.out.println("静态代码块执行");
    }


    public Student() {
        System.out.println("执行空参构造");
    }

    public Student(String name, int age) {
        System.out.println("执行带参构造");

        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


}
