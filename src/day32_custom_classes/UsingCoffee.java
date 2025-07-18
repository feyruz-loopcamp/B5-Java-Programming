package day32_custom_classes;

// Runner class
public class UsingCoffee {
    public static void main(String[] args) {

        // Since there is no custom constructor declared, this is using default
        Coffee coffee1 = new Coffee();

        // If there is no toString method declared, this will print memory location.
        // toString() method is a special method that can be implemented to give object info
        System.out.println(coffee1);

        // You can call toString() method with object reference but NOT needed in here
        // System.out.println(coffee1.toString());

        // LETs assign values to instance variables for coffee1 object (without constructor)
        // CanNOT reach other class members directly like this from different file
        // price = 4.99;
        // We can use the Object reference of that Class
        coffee1.price = 4.99;
        coffee1.sizeInOz = 16;
        coffee1.brand = "Starbucks";
        coffee1.type = "Black";


        System.out.println("----------------------");
        // Lets print object again to see toString method with the initial values for instance variables in coffee1 object
        System.out.println(coffee1);


        // Lets call our custom instance methods
        // CanNOT reach other class members directly like this from different file
        // drink();
        // We can use the Object reference of that Class
        coffee1.drink();

        coffee1.refill(1);
        System.out.println(coffee1.sizeInOz);

        coffee1.refill(2);

    }

}
