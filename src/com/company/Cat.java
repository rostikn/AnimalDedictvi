package com.company;

public class Cat extends Animal {
    public Cat(String name, int age, int numberOfLegs, String fur, String type) {
        super(name, age, numberOfLegs, fur, type);
    }
    public void greetings(){
        System.out.println("mnoww");
    }

    public int getAge() {
        System.out.println("mnow");
        return 0;
    }
}
