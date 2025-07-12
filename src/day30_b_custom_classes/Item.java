package day30_b_custom_classes;

// Custom clss - Template how the object of this class will behave
public class Item {
    // Instance Variables
    String name;
    double price;


    public String toString() {
        String msg = "Item Info: " +
                "\n\tName: " + name +
                "\n\tPrice: " + price;

        return msg;
    }
}

