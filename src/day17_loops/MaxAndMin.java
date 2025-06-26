package day17_loops;

import java.util.Scanner;

/*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
    1
    Ask a user:
    Tell if it is biggest or smallest.


    2
    Ask a user:
    Tell if it is biggest or smallest.

    3
    Ask a user:
    Tell if it is biggest or smallest.
 */
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please, tell me how many numbers do you want to compare: "); // 5 - 23, 12, 43, 65, 13
        int userDesiredCycle = keyboard.nextInt();
        int smallest = 2_147_483_647;
        int biggest = -2_147_483_648;


        // -2,147,483,648 to 2,147,483,647,
        while (userDesiredCycle >= 1) {
            System.out.print("Please, enter number: ");
            int userNumOnEachCycle = keyboard.nextInt();

            if (userNumOnEachCycle < smallest) {
                smallest = userNumOnEachCycle;
            }

            if (userNumOnEachCycle > biggest) {
                biggest = userNumOnEachCycle;
            }


            userDesiredCycle--;
        }

        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);


    }
}

