package day35_inheritance.pizza;
/*
    create a class called Pizza

    - data:

        size (String), number of toppings

    - constructor

        - create a constructor that creates a Pizza object with the size and the number of toppings

            call setters here

    - encapsulate the Pizza class

        - setter condition:
            size can only be:
                small, medium, or large

            number of toppings must be a positive number

    - other methods methods:

        - calculatePrice()
                calculate the price of the pizza based on:

                    small base: $4
                    medium base: $6
                    large base: $8

                    each topping adds $0.75 to the price

                    calculate the total price and return the cost

        - toString()
            print the size, number of toppings, and cost of the pizza
 */
public class Pizza {
    // Instance Var
    // private - made them not directly accessible.
    private String size;
    private int numOfToppings;

    //Constructor
    public Pizza(String size, int numOfToppings) {
        //this.size = size;
        setSize(size);
        //this.numOfToppings = numOfToppings;
        setNumOfToppings(numOfToppings);
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Medium") ||
        size.equalsIgnoreCase("Small") ||
        size.equalsIgnoreCase("Large")){
            this.size = size;
        }
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings >= 0) {
            this.numOfToppings = numOfToppings;
        }
    }


    // Instance method - each pizza will have a different price
    public double calculatePrice () {
        double price = 0;

        if (size != null) {
            if (size.equalsIgnoreCase("small")){// null.eqaul
                price = 4;
            } else if (size.equalsIgnoreCase("medium")) {
                price = 6;
            } else if (size.equalsIgnoreCase("large")){
                price = 8;
            }
        }

        price += numOfToppings * 0.75;

        return price;
    }


    // toString() - to print object
    public String toString() {
        return "Pizza Info: " +
                "\n\tSize: " + size +
                "\n\tNumber Of Toppings: " + numOfToppings +
                "\n\tPrice: " + calculatePrice();
    }
}
