package day18_loops;
/*
    Given a String we want to count how many 'a' characters we have

    Ex: "aabbcaa"

        4
 */
public class CountLetters {
    public static void main(String[] args) {

        String str = "aabbcaa";
        char letter = 'c';
        int counter = 0;

        /*
            get each character from str
                compare if it is same as letter
         */

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter){
                counter++;
            }
        }

        System.out.println("You have " + counter + " letter " + letter);


    }
}
