package day37_a_abstraction.car;

import day34_c_inheritance.animal.Cat;

public class Toyota extends Car {

    @Override
    public void start () {
        System.out.println("Starting by pressing the button");
    }
//    // Child class of abstract parent class has to implement/override parent class abstract method
//    // I am giving information on "HOW" this method will behave for Child class

}
