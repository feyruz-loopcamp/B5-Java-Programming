package day37_a_abstraction.car;

public class Honda extends Car {
    @Override
    public void start () {
        System.out.println("Starting by inserting the key");
    }
    // Child class of abstract parent class has to implement/override parent class abstract method
    // I am giving information on "HOW" this method will behave for Child class


}
