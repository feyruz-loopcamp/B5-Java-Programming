package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = key.nextLine().toLowerCase(); //

        // Get the first and last character
        System.out.println("First Char: " + sentence.charAt(0));
        System.out.println("Last Char: " + sentence.charAt( sentence.length() - 1 ));


        // Check if those character are same or not (ignoring case sensitiveness)
        if (sentence.charAt(0) == sentence.charAt( sentence.length() - 1 )){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }


        // Ternary: (condition) ? trueResult : falseResult
        System.out.println(  sentence.charAt(0) == sentence.charAt( sentence.length() - 1 )  ? "Same" : "Different");


        // TODO: check if last 2 characters are same or not? -- > loop
    }
}
