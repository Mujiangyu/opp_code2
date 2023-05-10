package com.niit.polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Norman",22);
        Person p2 = new Person("mei",23);

        Animal a = new Dog("黑色",2);
        p1.keepPet(a,"骨头");
        ((Dog) a).lookHome();
        Animal a2 = new Cat("黑色",2);
        p2.keepPet(a2,"小鱼干");

    }
}
