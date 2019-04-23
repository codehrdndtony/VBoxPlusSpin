package com.javafx.inheritance.animal.;


public class InheritanceofDemo {

    public static void main(String[] args){

        /* Create an Animal object.
        Animal is abstract class,
        you can not create an objext from Animal's Constructor.*/

        Animal tom = new Cat("Tom", 3, 20);

        System.out.println("name:" + tom.getName());
        System.out.println("animalName: " + tom.getAnimalName());

        //Using 'instanceof' operator to
        //check if an object is an instance of a specific class.
        boolean isMouse = tom instanceof Mouse;
        System.out.println("Tom is mouse? " + isMouse);

        boolean isCat = tom instanceof Mouse;
        System.out.println("Tom is a cat? " + isCat);

        boolean isAnimal = tom instanceof Animal;
        System.out.println("Tom is animal? " + isAnimal);

    }

}
