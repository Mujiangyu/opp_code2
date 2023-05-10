package com.niit.a01staticdemo3;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("norman",29,"man");
        Student s2 = new Student("mei",23,"nv");
        Student s3 = new Student("qian",26,"nv");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxage = StudentUtil.getMaxAge(list);

        System.out.println(maxage);
    }
}
