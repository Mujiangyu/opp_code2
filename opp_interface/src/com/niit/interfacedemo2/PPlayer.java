package com.niit.interfacedemo2;

public class PPlayer extends Person implements SpeakEnglish{
    public PPlayer() {
    }

    public PPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName()+"学打乒乓球");
    }

    @Override
    public void English() {
        System.out.println(getName()+"学习说英语");
    }
}
