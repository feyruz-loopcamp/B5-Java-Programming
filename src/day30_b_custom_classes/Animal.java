package day30_b_custom_classes;
// Template Class
public class Animal {

    // Instance variables - Fields
    String species;
    int population;


    // Instance method
    // toString() - > Specials Method
    // It will helps us to print the object directly in the way I structured this method.
    public String toString () {
        //String msg; // LOCAL Variable
        String msg = "Specis: " + species + "\nPopulation: " + population;
        //String msg = "[" + species + ", " + population + "]";
        return msg;
    }
}
