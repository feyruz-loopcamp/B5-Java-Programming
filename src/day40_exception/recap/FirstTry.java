package day40_exception.recap;

import java.util.Scanner;

public class FirstTry {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("First Println Statement.");

        System.out.print("Give me the index: ");
        int index = key.nextInt();

        //String str = 'loop'; // CHECKED EXCEPTION / COMPILE TIME EXCEPTION
        String str = "loop";



        /*
        Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 9 out of bounds for length 4
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.lang.String.checkIndex(String.java:4917)
         */



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
