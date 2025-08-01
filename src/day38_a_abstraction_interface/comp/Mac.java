package day38_a_abstraction_interface.comp;

public interface Mac {
    // everything in interface is - public
    // all variables - public static final - CONSTANT
    // all the method without body - public abstract
    // cannot have constructor (not even the default constructor)
    // cannot have any block - static block
    // can have static and default method

    // 1 - CONSTANTs: public static final
    String NAME = "Apple";
    String OS = "IoS";

    // 2 - abstract method: public abstract
    void turnOn();


    // 3 - public static method
    static void company () {
        System.out.println("Company name: " + NAME);
        System.out.println("Operating System: " + OS);
    }


    // 4 - public default method
    public default void faceTime () {
        System.out.println("Calling through Facetime");
    }


}
