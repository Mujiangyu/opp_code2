package com.niit.codeblockdemo1;

public class CodeBlockDemo1 {
    public static void main(String[] args) {
        //局部代码块
        {
            int a = 10;
        }//因为代码执行到这里时,变量就会消失
//        System.out.println(a);
    }
}
