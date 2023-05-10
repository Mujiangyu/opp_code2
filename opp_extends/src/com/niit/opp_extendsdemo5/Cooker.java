package com.niit.opp_extendsdemo5;

public class Cooker extends Employe{
    public Cooker() {
    }

    public Cooker(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
