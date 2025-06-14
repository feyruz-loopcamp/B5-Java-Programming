package day18_loops;

import java.util.Scanner;

/*
    Space program [String, Loops]

    Given a String return a version of with spaces between all of the letters.
    If there is already a space in the String put an underscore

        Ex: java	-> j a v a
            space 	-> s p a c e
            more words -> m o r e _ w o r d s

 */
public class SpaceProgram {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, a sentence: ");
        String userInput = key.nextLine().replace(" ",  "_");  // more java is good ----- > .replace(" ", "_"); -- > more_java_is_good
        // java --- > j a v a
        // java book -> j a v a _ b o o k

        String userInputWithSpace = "";

        for (int i = 0; i < userInput.length(); i++) {
            //System.out.print(userInput.charAt(i));
            //System.out.print(" ");

            //userInputWithSpace = userInputWithSpace + userInput + " ";

//            if (userInput.charAt(i) == ' '){
//                userInputWithSpace += "_ ";
//            } else {
//                userInputWithSpace += userInput.charAt(i) + " ";
//            }

            userInputWithSpace += userInput.charAt(i) + " ";


        }


        userInputWithSpace = userInputWithSpace.trim();

        System.out.println("Original: " + userInput);
        System.out.println("With space: " + userInputWithSpace);




    }
}
