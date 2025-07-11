package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        // Collections -- 's' ---  it is a class (Utility class -- > Helper class which has some useful method to use with Collection)

        ArrayList <Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(435, 64, 14, 234, 3, 5234, 64, 7) );
        System.out.println("Original: " + nums);

        // .sort()
        // Arrays.sort(); //-- > works with array
        Collections.sort(nums);
        System.out.println("After sorting: " + nums);


        // .reverse()
        Collections.reverse(nums);
        System.out.println("After reverse: " + nums);

        System.out.println("------------------------------------------------");

        ArrayList <Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('K', 'A', 'Z', 'R'));
        System.out.println("Original: " + letters);
        Collections.sort(letters);
        System.out.println("After sort: " + letters);
        Collections.reverse(letters);
        System.out.println("After reverse: " + letters);


        System.out.println("------------------------------------------------");
        // .max() | .min()
        System.out.println( Collections.max(nums) );
        System.out.println( Collections.min(nums) );
        //System.out.println( Collections.max(letters) );
        //System.out.println( Collections.min(letters) );


        System.out.println("------------------------------------------------");
        // .swap();
        ArrayList <String> words = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thu"));
        //                                                         0      1      2      3
        System.out.println("Original: " + words);
        words.set(0, "mon");
        System.out.println(".set(): " + words);

        // Collections.swap(words, 1, 5); // IndexOutOfBoundsException - because we do not have index 5 yet. The last index is 3
        Collections.swap(words, 1, 3);
        System.out.println(".swap(): " + words);


        System.out.println("------------------------------------------------");
        // .frequency()
        ArrayList <Character> chars = new ArrayList<>(Arrays.asList('a', 'f', 'l', 'a', 'h'));
        System.out.println( Collections.frequency(chars, 'a') );

        String str = "loopcamp"; // o
        // String  --- > String [] ----- > ArrayList <String>
        //"loopcamp"
        // array -- > ["l", "o", "o", "p", "c", "a", "m", "p"]
        // ArrayList -- > ["l", "o", "o", "p", "c", "a", "m", "p"]
        ArrayList <String> list = new ArrayList<> ( Arrays.asList( str.split("")) );
        System.out.println( Collections.frequency(list, "o") );
        System.out.println( Collections.frequency(list, "l") );
        System.out.println( Collections.frequency(list, "p") );

    }
}
