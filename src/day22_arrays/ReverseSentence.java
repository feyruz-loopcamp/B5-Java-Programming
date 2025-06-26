package day22_arrays;

import java.util.Arrays;

/*
    Given a sentence
        today is monday

     reverse the sentence with words
        monday is today

 */
public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "today is monday"; // ["today", "is", "monday"]
        String reversedSentence = "";

        String [] sentenceInArr = sentence.split(" ");
        //System.out.println(Arrays.toString(sentenceInArr)); // ["today", "is", "monday"]
        //                                                          0     1       2

        for (int i = sentenceInArr.length - 1; i >= 0; i--) {
            //System.out.println(sentenceInArr[i]);
            reversedSentence += sentenceInArr[i] + " "; // monday_is_today_
        }

        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reversedSentence.trim());

    }
}
