package com.niit.a01staticdemo2;

public class ArrUtil {
    //创建工具类
    //私有化构造方法，不让外界调用
    private ArrUtil() {
    }

    ;

    //定义静态方法，方便调用
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }

        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAvg(double[] arr) {
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = count + arr[i];
        }
        return count / arr.length;
    }
}
