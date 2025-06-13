package day17_loops;

import org.w3c.dom.ls.LSOutput;

public class DoWhileExample {
    public static void main(String[] args) {
        // WHILE LOOP
        int m = 1;
        while (m <= 10){
            System.out.println("WHILE loop " + m);
            m++;
        }
        // flow
        //      1st check condition
        //      if true then execution code block

        System.out.println("-------------------");


        // DO WHILE loop
        int n = 1;
        do {
            System.out.println("DO WHILE loop " + n);
            n++;
        } while (n <= 10);
        // flow
        //      1 execute code block of DO
        //      then check condition

    }
}
