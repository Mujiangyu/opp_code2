package com.niit.test2;

public class test {
    public static void main(String[] args) {
       /* final修饰的变量是基本类型,变量存储的数据值不能发生改变
        final修饰的变量是引用类型,变脸存储的地址值不能发生改变,但对象内部的数据可以发生改变*/

        final double PI = 3.14;
//        PI = 3.1415926;
        //创建对象
        final Student S = new Student("norman",22);
        S.setName("mei");
        S.setAge(23);
        System.out.println(S.getAge()+", "+S.getName());
//        Cannot assign a value to final variable 'S'
//        S = new Student();

        final int[] arr={1,2,3,4,5};
        arr[0] = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
