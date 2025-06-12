package day15_string;

import java.util.Scanner;

/*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */
public class Initials {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter yor first name: ");
        String userFirstName = key.next().toUpperCase().trim();

        key.nextLine();
        System.out.print("Please, enter your last name: ");
        String userLastName = key.nextLine().toUpperCase().trim();

        //userFirstName.charAt(0); // T
        //userLastName.charAt(0); // J

        String initials = "" + userFirstName.charAt(0) + userLastName.charAt(0);
        System.out.println("Your initial: " + initials);


    }
}
