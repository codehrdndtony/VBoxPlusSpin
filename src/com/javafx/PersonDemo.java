package com.javafx;

public class PersonDemo {

        public static void main(String[] args) {

            //Instance: Thomas Edison.
            Person edison = new Person("Thomas Edison", 1847);

            System.out.println("Info:");
            System.out.println("Name: " + edison.getName());
            System.out.println("Born Year: " + edison.getBornYear());
            System.out.println("Place Of Birth: " + edison.getPlaceOfBirth());

            //Instance: Bill Gates
            Person billGates = new Person("Bill Gate", 1995, "Seatle, Washington");

            System.out.println("Info:");
            System.out.println("Name: " + billGates.getName());
            System.out.println("Born Year:" + billGates.getBornYear());
            System.out.println("Place Of Birth: " + billGates.getPlaceOfBirth());

        }

}
