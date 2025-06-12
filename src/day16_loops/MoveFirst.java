package day16_loops;

import java.util.Scanner;

/*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint: Use indexOf and substring
 */
public class MoveFirst {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = key.nextLine(); // Java is a fun language
        String part1 = sentence.substring(sentence.indexOf(" ")).trim();
        String part2 = sentence.substring( 0, sentence.indexOf(" ") );

        //String updateSentence = sentence.substring(sentence.indexOf(" ")).trim() + " " + sentence.substring( 0, sentence.indexOf(" ") );
        String updateSentence = part1 + " " + part2;
        System.out.println(updateSentence);

        // TODO: Handle if user give you single word


    }
}
