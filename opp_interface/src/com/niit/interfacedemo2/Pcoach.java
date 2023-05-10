package com.niit.interfacedemo2;

public class Pcoach extends Person implements SpeakEnglish{
    public Pcoach() {
    }

    public Pcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName()+"教打乒乓球");
    }

    @Override
    public void English() {
        System.out.println(getName()+"说英语");
    }
}
