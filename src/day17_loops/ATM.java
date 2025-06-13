package day17_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int validPinCode = 9876;
        int userEnterPinCode;
        int attemptCount = 3;


        System.out.println("Welcome to ATM");

        do {
            System.out.print("Please, enter pin code: ");
            userEnterPinCode = key.nextInt();


            attemptCount--;

            if ( userEnterPinCode != validPinCode && attemptCount != 0) {
                System.out.println("Try again!");
            }

        } while ( userEnterPinCode != validPinCode && attemptCount > 0 );




        if (attemptCount == 0 && userEnterPinCode != validPinCode ) {
            System.out.println("You have tried 3 times and you are locked out. Please, call us!");
        } else {
            System.out.println("You successfully logged in!");
        }

    }
}
