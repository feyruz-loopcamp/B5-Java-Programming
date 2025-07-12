package day30_a_arraylist;

import my_util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

/*
        Reverse All

        Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
        @param words - Given ArrayList of Strings
        @return - ArrayList of Strings

        Ex:
            Input: {"ted", "talk", "learn"}
            Output: {"det", "klat", "nrael"}
 */
public class ReverseAll {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println("Orig: " + list);
        System.out.println( "Reversed: " + reverseAllInList(list) );


    }


    public static ArrayList <String> reverseAllInList (ArrayList <String> list){
        ArrayList <String> listCopy = new ArrayList<>(list);
        ArrayList <String> reversedList = new ArrayList<>();

        /*
            loop through ArrayList
                get each element
                    loop through each element
                        get each Character
         */

        for ( String eachListElem : listCopy) {

            // Here we coded again but we ahve reusable method for this in StringUtil class
            //String reversed = "";
            //for (int i = eachListElem.length()-1; i >= 0; i--) {
            //    reversed += eachListElem.charAt(i);
            //}
            //reversedList.add(reversed);

            // We called our reverse() utility method from our StringUtil class
            reversedList.add( StringUtil.reverse(eachListElem) );

        }

        return reversedList;
    }
}
