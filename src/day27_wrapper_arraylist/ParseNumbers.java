package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {

        /*
            "Hi"
            "1"
            "23.6"
            "K"
            "true"
         */

        Scanner key = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String age = key.nextLine(); // "12"

        System.out.println("You were born in " + (2025 - Integer.parseInt(age)) );  // 2025 - "12" --- > 2025 - 12 (int)
        System.out.println("You were born in " + (2025 - Integer.valueOf(age)) );   // 2025 - "12" --- > 2025 - 12 (Integer)


        System.out.println("-------------------");

        System.out.print("Please, enter true or false: " );
        String userAnswer = key.nextLine();  // "true"

        if (Boolean.parseBoolean(userAnswer)) {
            System.out.println("You entered: " + true);
        } else {
            System.out.println("You entered: " + false);
        }


    }
}
