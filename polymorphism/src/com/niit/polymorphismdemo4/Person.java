package com.niit.polymorphismdemo4;

public class Person {
    private String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animal a, String food){
        if(a instanceof Dog){
            Dog d = (Dog) a;
            System.out.println("年龄为"+getAge()+"的"+getName()+"用"+food+"喂养了一只"+d.getAge()+"岁的"+d.getColor()+"色的狗");
            d.eat(food);

        }else if(a instanceof Cat){
            Cat c = (Cat) a;
            System.out.println("年龄为"+getAge()+"的"+getName()+"用"+food+"喂养了一只"+c.getAge()+"岁的"+c.getColor()+"色的猫");
            c.eat(food);
        }

    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


}
