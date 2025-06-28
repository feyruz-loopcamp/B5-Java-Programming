package day24_methods;

import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your date of birth year: ");
        int birthYear = key.nextInt(); // 1990
        calculateAge(birthYear); // 1990
        //calculateAge("1960"); // INVALID - the method accepts int but we are providing String


        System.out.println("---------------------------");
        calculateAge(1999);

    }


    public static void calculateAge (int birthYear) { // int birthYear =  1990

        if (birthYear < 0) {
            System.out.println("You entered invalid input!");
        } else {
            //System.out.println("You age: " + (2025 - birthYear) );
            //System.out.println(Year.now().getValue()); // Year.now().getValue() --- > Dynamic way to always get the current year.
            System.out.println("You age: " + (Year.now().getValue() - birthYear) );
        }

    }
}
