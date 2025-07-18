package day32_custom_classes;
/*
Create a coffee class with these instance variables:
     price, size(oz), brand, types

     ex types: black, cappuccino, latte, mocchiato....

instance methods:

    - make a toString to print all the information of the coffee objects

    - drink(): print: drinking $type type of coffee

    - refill(amount in oz): print: refilling x oz
        add the number of oz to the total size

 */

// Custom Class - Template/Blueprint for objects
public class Coffee {
    /*
        Members of class
            Instance members
                4 instance variables
                3 instance methods
     */


    // INSTANCE variables
    double price;
    int sizeInOz;
    String brand;
    String type;


    // INSTANCE methods
    public String toString() {
        return "Coffee Inf: " +
                "\n\tPrice: $" + price +
                "\n\tSize In Oz: " + sizeInOz +
                "\n\tBrand: " + brand +
                "\n\tType: " + type ;
    }

    // INSTANCE method
    public void drink () {
        System.out.println("Drinking " + type + " type of coffee." );
    }

    // INSTANCE method
    public void refill (int addSize) {
        // Max the cup can hold is 18oz
        if ((sizeInOz+addSize) <= 18) {
            System.out.println("Refilling " + addSize + " oz...");
            sizeInOz += addSize;
        } else {
            System.out.println("Your cup cannot hold " + ( sizeInOz + addSize ) );
        }

    }

}
