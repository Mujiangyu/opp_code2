package com.niit.Test;

public class Test1 {
    public static void main(String[] args) {

        Zi z = new Zi();
        z.show();

    }
}

class Fu {
    String name = "fu";
    String hobby = "drink";
}

class Zi extends Fu {
    String name = "zi";
    String game = "LOL";

    public void show() {
        //打印zi
        System.out.println(this.name);
        //打印父
        System.out.println(super.name);
        //打印hobby
        System.out.println(super.hobby);
        //打印LOL
        System.out.println(this.game);
    }
}



