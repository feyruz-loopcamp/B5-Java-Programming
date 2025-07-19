package day33_a_static;
// Custom Class
public class Iphone {
    //Instance var
    String model;
    double price;


    // static var
    static String brand;
    static String os;
    static String appleDay;


    // Constructor -- > initialize all instance variables
    public Iphone (String model, double price){
        this.model = model;
        this.price = price;
    }


    // Static block - > initialize all static variables
    static {
        brand = "Apple";
        os = "IoS";
        appleDay = "October 21st";
        //model = "Iphone mini"; // YOu should not - static only accepts static
    }


    // Instance method - .toString();
    // Instance method can accept both - Instance and Static
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}' +
                " ----- " +
                "Brand: " + brand +
                "OS: " + os +
                "Apple Day: " + appleDay;
    }
}
