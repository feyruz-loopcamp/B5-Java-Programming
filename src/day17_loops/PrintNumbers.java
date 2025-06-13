package day17_loops;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("Start the code execution.....");

        // #1 - WHILE LOOP
        // Infinite loop
        //while (true) {
        //    System.out.println("Hi!");
        //}


        int num = 1;

        while (num <= 10) {
            System.out.println(num);
            num++; // num = num + 1;
        }

        System.out.println("After if statement.");

        System.out.println("--------------------");

        int i = 1;

        // Q: Can you find all the even number from 1 to 100
        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;

        }

        System.out.println(i); // 11


        System.out.println("--------------------");

        // Q: Can you find all the numbers divisible by 5 between 1 and 100
        int start = 5;

        while (start <= 100 ) {

            if (start % 5 == 0) {
                System.out.println(start);
            }

            start++;
        }

    }
}
