package day39_b_exception;

import java.util.Scanner;

public class FirstTry {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("First Println Statement.");

        System.out.print("Give me the index: ");
        int index = key.nextInt();

        //String str = 'loop'; // CHECKED EXCEPTION / COMPILE TIME EXCEPTION
        String str = "loop";



        // try-catch block is the only way to HANDLE EXCEPTION
        try {
            System.out.println( str.charAt( index )); // StringIndexOutOfBoundsException
        } catch (Exception e){
            //System.out.println("Exception occurred and we caught it");
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }


        // If the index user gave is causing an issue, the code will crash in this line. - UNCHECKED EXCEPTION / RUNTIME EXCEPTION
        // After the crash, the code ends execution.

        System.out.println("Last Println Statement.");


    }
}
