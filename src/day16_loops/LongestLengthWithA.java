package day16_loops;

import java.util.Scanner;

/*
    NOTE: FIND THE BIGGEST AND CHECK IF THE BIGGEST HAS "A" IN IT.
    ***** NOTE: All three words have a *******
    create a class LongestLengthWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"

    Output: java

 */
public class LongestLengthWithA {
    public static void main (String [] args){
        //Object Reference = actual object
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter 3 words: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        System.out.println("You entered: " + word1 + ", " + word2 + ", " + word3);

        boolean isFirstBiggestWithA = word1.contains("a") && (word1.length() > word2.length() && word1.length() > word3.length());
        boolean isSecondBiggestWithA = word2.contains("a") && (word2.length() > word1.length() && word2.length() > word3.length());
        boolean isThirdBiggestWithA = word3.contains("a") && (word3.length() > word1.length() && word3.length() > word2.length());

//        boolean isFirstBiggestWithA = word1.contains("a") && word1.length() > word2.length();
//        boolean isSecondBiggestWithA = word2.contains("a") && word2.length() > word3.length();
//        boolean isThirdBiggestWithA = word3.contains("a") && word3.length() > word1.length();



        if (isFirstBiggestWithA) {
            System.out.println("Your biggest word is: " + word1);
        } else if (isSecondBiggestWithA) {
            System.out.println("Your biggest word is: " + word2);
        } else if (isThirdBiggestWithA) {
            System.out.println("Your biggest word is: " + word3);
        }


        // TODO: Come up with a solution for if not all the words do not contain a

    }
}
