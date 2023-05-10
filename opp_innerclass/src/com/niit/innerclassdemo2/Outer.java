package com.niit.innerclassdemo2;

public class Outer {


    /*class Inner{

    }*/
    private class Inner{

//        static int a = 10;
    }

    public Inner getInstance(){
        return new Inner();
    }
}
