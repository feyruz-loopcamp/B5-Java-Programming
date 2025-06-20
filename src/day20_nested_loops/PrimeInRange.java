package day20_nested_loops;

import java.util.Scanner;
// IQ: Find all the PRIME numbers until XX number

public class PrimeInRange {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a number and I will tell you all PRIME numbers until that number: ");  // 7

        // 5 ----> 1, 2, 3, 4, 5
        // 1 --> 1, 1
        // 2 --> 1, 2
        // 3 --> 1, 2, 3
        // 4 --> 1, 2, 3, 4
        // 5 --> 1, 2, 3, 4, 5

        int userNUm = key.nextInt(); //

        // OUTER LOOP - taking each number from 1 in the range up to whatever user gave us.
        for (int eachNum = 1; eachNum <= userNUm ; eachNum++) { // 1, 2, 3, 4, 5, 6, 7 --> 1, 2, 3, 5, 7


            int counter = 0;

            if (eachNum == 0) {
                System.out.println("We can not check!");

            } else {

                // INNER LOOP - I am check on eachNumber to see how many times it is fully divisible from 1 to itself
                for (int i = 1; i <= eachNum; i++) { // 1, 2, ........ userNum

                    if (eachNum % i == 0){  // userNum % 1 == 0 |
                        counter++;  // 2
                    }

                }

                if (counter == 2) {
                    System.out.println(eachNum + " is PRIME number");
                }

            }


        }

    }

}
