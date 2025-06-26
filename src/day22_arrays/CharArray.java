package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        String word = "loopcamp";

        System.out.println("Size of word: " + word.length());
        System.out.println("Word: " + word);


        System.out.println("---------------------");
        char []  letter = {'l', 'o', 'o', 'p', 'c',  'a', 'm', 'p'};
        System.out.println("Size of char arr: " + letter.length);
        System.out.println(letter); // THIS IS ONLY OK with char ARRAY
        System.out.println("" + letter); // Memory location
        System.out.println(Arrays.toString(letter));


        System.out.println("---------------------");
        char [] wordInArr = new char[word.length()]; // [_, _, _, _, _, _, _, _]

        for (int i = 0; i < wordInArr.length; i++) {
            wordInArr[i] =  word.charAt(i);
        }
        System.out.println(Arrays.toString(wordInArr));


        // CONVERTING String into char Array
        System.out.println("---------------------");
        char [] wordInArr2 = word.toCharArray(); // ['l', 'o', 'o', 'p', 'c', 'a', 'm', 'p']
        System.out.println(Arrays.toString(wordInArr2));


        System.out.println("---------------------");
        char [] charArr = "Wednesday".toCharArray(); //['W', 'e'............ 'y']
        System.out.println(Arrays.toString(charArr));

        System.out.println("---------------------");
        // Converting char Array into String
        char [] charArr2 = {'J', 'a', 'v', 'a'};
        String str1 = Arrays.toString(charArr2); // "[J, a, v, a]"
        System.out.println(str1);

        String str2 = new String(charArr2); // "Java"
        System.out.println(str2);


    }
}
