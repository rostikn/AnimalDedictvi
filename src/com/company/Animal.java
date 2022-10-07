package com.company;

public class Animal {

    private String name;
    private int age;
    private int numberOfLegs;
    private String fur;
    private String type;

    public Animal(String name, int age, int numberOfLegs, String fur, String type) {
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.fur = fur;
        this.type = type;
    }

    public void walk(){
        if (numberOfLegs==2){
            System.out.println(name + "is walking");
        }else{
            System.out.println(name + "is weelchair drifting");
        }
    }

    public void makeSound(){
        System.out.println(name + "rouuwwww");
    }

    public void greetings(){
        System.out.println("rouwwwww");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public String getType() {
        return type;
    }

    public void setType(int idNumber) {
        this.type = type;
    }
}
