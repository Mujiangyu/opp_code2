package com.niit.a01staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中的两个方法是否正确
        int[] arr1 = {1,2,3,3,4,5};
        String s = ArrUtil.printArr(arr1);
        System.out.println(s);

        double[] arr2 = {1.3, 3.4, 4.3, 2.3};
        double avg = ArrUtil.getAvg(arr2);
        System.out.println(avg);
    }
}
