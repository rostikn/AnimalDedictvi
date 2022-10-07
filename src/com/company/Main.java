package com.company;

public class Main {

    public static void main(String[] args) {
        Animal myCat = new Cat("Marka", 18, 2, "white", "cat");
        Animal myDog = new Dog("Rostyslav", 17, 3, "white", "dogo");
       myDog.makeSound();
       myCat.makeSound();
       if (myDog instanceof Dog){
           System.out.println(myDog.getName() + " is a man");
       }
    }
}
