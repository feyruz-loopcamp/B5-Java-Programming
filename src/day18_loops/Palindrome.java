package day18_loops;
/*
     Palindrome: its the same reading from the beginning and end

     Ex:
         mom
         racecar
         Anna
         madam

     Task: Check if a word is palindrome
 */
public class Palindrome {
    public static void main(String[] args) {
        
        String word = "Ana";
        String reversed = "";


        for (int i = word.length()-1; i >= 0 ; i--) {
            //reversed = reversed + word.charAt(i);
            reversed += word.charAt(i);
        }

        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversed);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is NOT Palindrome");
        }

    }
}
