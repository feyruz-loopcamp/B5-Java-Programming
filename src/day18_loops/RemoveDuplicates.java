package day18_loops;
/*
    Remove Duplicates
        Write a program that can remove duplicates from a String / keep one character from each.
         Ex:
                Input: abcabbcd
                Output: abcd
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abcabbcdrrrfffskkkllff";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);


            if (!unique.contains( "" + eachLetter )) {
                //unique = unique + eachLetter;
                unique += eachLetter;
            }

        }

        System.out.println("Original: " + str );
        System.out.println("Uniques: " + unique );


    }
}
