package day19_nested_loops;

import java.util.Scanner;

/*
Reverse only second word [String, Loops]

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
    Ex:
    I love java

    Ouput:
    I evol java
 */
public class ReverseMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a sentence with 3 words: "); // I Love Java
        String sentence = input.nextLine().trim();  // I love java language.
        int countSpace = 0;
        String copyOfSentence = sentence;

        while (copyOfSentence.contains(" ")){
            countSpace++;
            copyOfSentence = copyOfSentence.replaceFirst(" ", "*");
        }
        // I*Love*Java

        // System.out.println("You have " + (countSpace+1) + " words");

        if (countSpace == 2 ) { // one two three

            int firstSpaceIndex = sentence.indexOf(" ");
            int lastSpaceIndex = sentence.lastIndexOf(" ");


            String middleWord = sentence.substring(firstSpaceIndex, lastSpaceIndex).trim();  // " two"
            //sentence.substring(firstSpaceIndex+1, lastSpaceIndex);  // "two"

            String reversedMiddle = "";

            for (int i = middleWord.length() - 1; i >= 0 ; i--) {
                reversedMiddle += middleWord.charAt(i);
            }

            // System.out.println(reversedMiddle);

            String firstWord = sentence.substring(0, firstSpaceIndex);
            String thirdWord = sentence.substring(lastSpaceIndex+1);

            System.out.println(firstWord + " " + reversedMiddle + " " + thirdWord);


        } else {
            System.out.println("You did not give me 3 words");
        }

    }
}


// TODO: Implement this code to ask user until user give 3 words