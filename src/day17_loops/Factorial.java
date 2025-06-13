package day17_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // n! = n * (n-1); ......
        // 4!=  4 * 3 * 2 * 1  - > 24
        // 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720

        Scanner key = new Scanner(System.in);
        System.out.print("Please, give me a number and I will tell you the factorial result: ");
        int num = key.nextInt(); // 4
        int result = 1;

        while ( num >= 1 ) {
            result = result * num;  // result = 1 * 4   | result = 4 * 3    | result = 12 * 2 | result = 24 * 1
            num--;  //                 num = 3          | num = 2           | num = 1         | num = 0
        }

        System.out.println(result);


    }
}
