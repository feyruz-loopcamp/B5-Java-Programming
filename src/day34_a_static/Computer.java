package day34_a_static;
// Custom Class
/*
    Computer - static

    class name: Computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

 */
public class Computer {
    // instance variables - each obj has its own version/copy
    double price;
    String brand;
    String color;


    //static variables - all obj shares SAME version/copy
    static boolean hasScreen;
    static boolean hasBatter;
    static boolean hasMemory;


    // Static Block - to initialize static var
    static {
        hasScreen = true;
        hasBatter = true;
        hasMemory = true;
    }


    // Constructor - to initialize instance var
    public Computer(double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    // toString() - is spacial method to print obj directly.
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", Has Screen: " + hasScreen +
                ", Has Battery: " + hasBatter +
                ", Has Memory: " + hasMemory +
                '}';
    }
}
