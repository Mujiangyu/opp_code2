package com.niit.opp_extendsdemo2;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}


class Fu{
    String name = "fu";
}



class Zi extends Fu{
    String name = "zi";
    public void ziShow(){
        String name = "zishow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}