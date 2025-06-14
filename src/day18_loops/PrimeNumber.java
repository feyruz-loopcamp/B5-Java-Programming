package day18_loops;

import java.util.Scanner;

/*
            [IQ] Prime number [Loops]

            Give a number determine if it is a prime number. A prime number is a number that is ONLY divisible fully by 1 and itself.

            Ex:
                Input:
                    11  ----- > 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 --- > 2 times

                Output:
                    prime

            Ex:
                Input:
                    10 ------ > 1, 2, 4, 5, 6, 7, 8, 9, 10 --- > 4 times

                Output:
                    not prime
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a number and I will tall you if it is PRIME NUMBER or NOT: ");
        int userNUm = key.nextInt();
            // 6 --- > 1, 2, 3, 4, 5, 6
            // 11 -- > 1, 2, 3, 4, 5 ,6 7, 8, 9, 10, 11

        int counter = 0;

        if (userNUm == 0) {
            System.out.println("We can not check!");

        } else {

            for (int i = 1; i <= userNUm; i++) { // 1, 2, ........ userNum

                if (userNUm % i == 0){  // userNum % 1 == 0 |
                    counter++;  // 2
                }

            }

            if (counter == 2) {
                System.out.println("Your number is PRIME number");
            } else {
                System.out.println("Your number is NOT PRIME number ");
            }

        }


    }
}
