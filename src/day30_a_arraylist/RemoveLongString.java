package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*

        Input: "Java", "Saturday", "SoftSkills", "Weekend"
        Out: ArrayList --- >  which removed all the String which has length more than 7 characters
 */
public class RemoveLongString {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("Java", "Saturday", "SoftSkills", "Weekend"));

        System.out.println("Orig: " + list);
        System.out.println("Updated remove long: " + removeLongString(list) );
        System.out.println("Update remove a/A: " + removeContainingA(list));


    }


    public static ArrayList <String> removeLongString (ArrayList <String> list) {

        ArrayList <String> listCopy = new ArrayList<>(list);  // ["Java", "Saturday", "SoftSkills", "Weekend"]

        listCopy.removeIf( each -> (each.length() > 7) );

        return listCopy;

    }


    public static ArrayList <String> removeContainingA (ArrayList <String> list) {

        ArrayList <String> listCopy = new ArrayList<>(list);  // ["Java", "Saturday", "SoftSkills", "Weekend"]

        listCopy.removeIf( each -> (each.contains("a") || each.contains("A")) );

        return listCopy;

    }
}
