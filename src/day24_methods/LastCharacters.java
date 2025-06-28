package day24_methods;

import java.util.Arrays;

/*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

    Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

    Output:
        ssk
        esre
        sw

 */
public class LastCharacters {
    public static void main(String[] args) {
        String [][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };

        /*
            Loop and get each single D array
                loop and get each elem
                    char var - > charAt(lastChar)
                print
         */


        // with foreach loop
        for ( String []  eachArr : words) {
            String lastChars = "";

            for (String eachWord : eachArr) {
                char lastLetterOfEachWords = eachWord.charAt( eachWord.length() - 1 );
                lastChars += lastLetterOfEachWords;
            }

            System.out.println(lastChars);
        }

        System.out.println("---------------------------------------------------------");

        // with fori/traditional loop
        /*
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
         */
        for (int i = 0; i < words.length; i++) {
            String lastChars = "";
            //words[i]

            for (int j = 0; j < words[i].length; j++) {
                char lastLetterOfEachWords =  words[i][j].charAt( words[i][j].length() -1  );
                lastChars += lastLetterOfEachWords;
            }

            System.out.println(lastChars);
        }



    }
}
