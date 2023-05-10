package com.niit.a01staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){};

    public static int getMaxAge(ArrayList<Student> list){
        int maxage = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();
            if(maxage < age){
                maxage = age;
            }
        }
        return maxage;
    }
}
