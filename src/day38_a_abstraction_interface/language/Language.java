package day38_a_abstraction_interface.language;

public interface Language {
    // public static final - CONSTANT
    //public static final  String topic = "Language";
    String TOPIC = "Language";


    // public abstract void sayHi();
    void sayHi();
    void sayBye();

}


    /*
        All variables are "public static final"
        Only "public" access modifier is allowed
        Methods with no Body is "public abstract" by default
        We can have "static" method with body
            -since we can have static variables, we can use them in this method
        We can have "default" method with body
            -can be called with Child class object
     */
