package com.javafx.inheritance.animal;


public class Mouse extends Animal {

    private int weight;

    //Default constructor.
    public Mouse() {
        //Call to constructor Mouse(int)
        this(100);
    }

    //The Constructor has one parameter.
    public Mouse(int weight) {
        /*If you do not call any super (..).
        * Java will call a default super().
        * super();
         */
        this.weight = weight;
    }

    //The constructor has 2 parameters.
    public Mouse(String name, int weight){
        super(name);
        this.weight = weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public String getAnimalName() {
        return "Mouse";
    }
}
