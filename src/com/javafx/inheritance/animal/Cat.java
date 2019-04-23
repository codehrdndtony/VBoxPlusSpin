package com.javafx.inheritance.animal;

public class Cat extends Animal {

    private int age;
    private int height;

    public Cat(int age, int height) {
        //Call the default Constructor of the parent class (Animal).
        //For the purpose of assigning values to fields of superclass.
        super();
        //Next, Assign values to its fields.
        this.age = age;
        this.height = height;
    }

    public Cat(String name, int age, int height) {
        //Call the default Constructor of the parent class (Animal).
        //For the purpose of assigning values to fields of superclass.
        super();
        //Next, Assign values to its fields.
        this.age = age;
        this.height = height;
    }

    public Cat(String name, int age, int height) {
        //Call the default Constructor of the parent class (Animal)
        //For the purpose of assigning values to fields of superclass.
        super(name);
        //Next, Assign values to its fields.
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    //Implemented content for abstract method declared in the parent class.
    @Override
    public String getAnimalName() {
        return "Cat";
    }

}
