package day32_custom_classes;
/*
    create a class called Food

       - data:
           name, quantity, unit price, total price

    - constructor
        - create a constructor that creates a Food object with the name
        - create a constructor that creates a Food object with the name and quantity
        - create a constructor that creates a Food object with the name, quantity, and unit price
            -> call calculatePrice() method here

    - method:

        - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

        - toString()
            print all the Food information
*/
// Custom Class - Template for objects of this class how to behave
public class Food {
    // INSTANCE variables
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    // CONSTRUCTOR with 1 parameter - name
    public Food (String name){
        this.name = name;
    }


    // CONSTRUCTOR with 2 parameter - name, quantity
    public Food (String inputName, int quantity){
        //this.name = name;
        this(inputName);
        this.quantity = quantity;
    }

    // CONSTRUCTOR with 3 parameter - name, quantity, unitPrice
    public Food (String name, int quantity, double unitPrice){
        //this.name = name;
        //this.quantity = quantity;
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculateTotalPrice();
    }


    // INSTANCE method
    public void calculateTotalPrice () {
        totalPrice = quantity * unitPrice;
    }


    // INSTANCE method - special one - toString()
    public String toString() {
        return "Food Info: " + name + ": " + quantity + " * " + unitPrice + " = " + totalPrice;
    }



}
