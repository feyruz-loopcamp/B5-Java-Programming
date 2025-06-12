package day15_string;

import java.util.Locale;
import java.util.Scanner;

/*
    Ask user for:
        first name
        last name

    fix to print proper name:
    capital first letter, the rest of the letter lowercase,  no extra space
 */
public class FixName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String firstName = key.next();
        // tom -- > Tom
        // TOM -- > Tom

        System.out.print("Please, enter your lastname: ");
        String lastName = key.next();

        System.out.println("----------------------------");
        System.out.println("Your Full Name (before fix): " + firstName + " " + lastName);

        //System.out.println("Chages: ");
        // .charAt(0); + rest do it in lowercase
        //firstName = (""+firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase(); // OPTION 1
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase(); // OPTION 2
        //lastName = ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase(); // OPTION 1
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase(); // OPTION 2


        System.out.println("Your Full Name (after fix): " + firstName + " " + lastName);



    }
}
