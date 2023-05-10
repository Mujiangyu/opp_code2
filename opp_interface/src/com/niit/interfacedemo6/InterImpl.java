package com.niit.interfacedemo6;

public class InterImpl extends InterAdapter{

    //当一个接口中抽象方法过多时,如果我只想使用接口中众多方法的某一个方法,而不想去重写其他方法,可以使用适配器设计模式,
    // 即让一个抽象中间类去实现这个接口,对接口中的所有抽象方法进行空实现(方法体不写),再让类继承这个抽象类然后重写所需要的方法即可

    public void method5(){
        System.out.println("只需要使用第五个方法");
    }


   /* @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }

    @Override
    public void method8() {

    }

    @Override
    public void method9() {

    }

    @Override
    public void method10() {

    }*/
}
