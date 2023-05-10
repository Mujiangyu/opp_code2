package com.niit.opp_extendsdemo5;

public class Manager extends Employe{
    private int aword;

    public Manager() {
    }
    //带全部参数的构造，创建时也要把父类中的参数传递进去
    public Manager(String id, String name, int salary, int aword) {
        super(id, name, salary);
        this.aword = aword;
    }

    @Override
    public void work(){
        System.out.println("管理其他人");
    }

    /**
     * 获取
     * @return aword
     */
    public int getAword() {
        return aword;
    }

    /**
     * 设置
     * @param aword
     */
    public void setAword(int aword) {
        this.aword = aword;
    }

}
