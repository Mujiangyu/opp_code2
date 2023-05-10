package com.niit.interfacedemo2;

public class Test {
    public static void main(String[] args) {
        PPlayer p = new PPlayer("norman",22);
        p.English();
        p.work();

        Pcoach pc = new Pcoach("mei",23);
        pc.English();
        pc.work();
    }
}
