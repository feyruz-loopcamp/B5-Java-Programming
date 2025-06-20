package day20_nested_loops;
/*
    Given two Strings determine if they are anagram or not.
    Strings are anagram if they are built up of the same characters
     Ex:
        listen vs silent
            listen  ->  eilnst
            silent  ->  eilnst

        funeral vs  realfun
        a gentleman vs elegant man

     -> anagram
     Hint: use replaceFirst();

 */
public class Anagram {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        if (word1.length() != word2.length()) {

            System.out.println("It is not Anagram!");

        } else {
            // word1 = listen --- > l       | i     | s     | t     | e     | n
            // word2 = silent --- > sient   | sent  | ent   | en    | n     | ""

            for (int i = 0; i < word1.length(); i++) {

                String eachCharInWord1 = "" + word1.charAt(i);

                word2 = word2.replaceFirst(eachCharInWord1, "");

            }

            if (word2.isEmpty()){
                System.out.println("It is Anagram");
            } else {
                System.out.println("It is not Anagram");
            }


        }
    }
}
