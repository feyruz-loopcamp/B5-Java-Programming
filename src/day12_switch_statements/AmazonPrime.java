package day12_switch_statements;

import day31_custom_classes.Car;

/*
Task:
    declare and assign a price variable
    declare and assign a boolean - hasPrime variable

    possible outputs:

        prime member:
            Eligible for 2 day shipping

        not prime and item price is more than or equal 25:
            Eligible for regular free shipping

        not prime and item price is less than 25:
            Not eligible for free shipping. Shipping fee: 3.99

        if has prime
            do this
        else / else if
 */
public class AmazonPrime {
    public static void main(String[] args) {
        double price = 9.99;
        boolean hasPrime = false;

        // Option 1 - MULTI BRANCH IF / ELSE-IF
        if (hasPrime) {
            System.out.println("Eligible for 2 day shipping");
        } else if (!hasPrime && price >= 25) {
            System.out.println("Eligible for regular free shipping");
        } else if (!hasPrime && price < 25){
            System.out.println("Not eligible for free shipping. Shipping fee: 3.99");
        }


        System.out.println("-----------------------------------------------------------");
        // Option 2
        if (hasPrime){
            System.out.println("Eligible for 2 day shipping");
        } else {  // !hasPrime
            if (price >= 25){
                System.out.println("Eligible for regular free shipping");
            } else { // price < 25
                System.out.println("Not eligible for free shipping. Shipping fee: 3.99");
            }
        }

    }
}
