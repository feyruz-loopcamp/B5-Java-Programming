package day24_methods;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String group2Name1 = "Ayaz";
        String group2Name2 = "Gulden";
        String group2Name3 = "Savlat";
        String group2Name4 = "Yuriy";

        String [] group2Students = {group2Name1, group2Name2, group2Name3, group2Name4}; // Single D array
        String [] group3Students = {"Java", "Polina", "Sultan"};                         // Single D array


        String[][] groups = {group2Students, group3Students};  // Multi D array

        System.out.println("Sing D array - group 2: " + Arrays.toString(group2Students));
        System.out.println("Sing D array - group 3: " + Arrays.toString(group3Students));

        System.out.println("Multi(2) D array - groups: " + Arrays.deepToString(groups));


        System.out.println("---------------------------------------------------------------------------");
        // How many elements this 2 D array has
        System.out.println("Multi(2) D array - size: " + groups.length);
        // How to get each element in 2 D arrays
        System.out.println("Single D array from 2 D array: " + Arrays.toString(groups[0]));
        System.out.println("Single D array from 2 D array: " + Arrays.toString(groups[1]));

        // How to get how many elements easc single D array inside 2D array has
        System.out.println("Single D array - size: " + groups[0].length);
        System.out.println("Single D array - size: " + groups[1].length);

        System.out.println("---------------------------------------------------------------------------");
        String [][] mentorGroups = new String [3][]; // This 2D array, will hold 3 Single D array + each Single D array not set
        String [][] loopcampGroups = new String [4][2]; // This 2D array, will hold 4 Single D array + each Single D array has 3 elements

        System.out.println(Arrays.deepToString( mentorGroups));
        System.out.println(Arrays.deepToString( loopcampGroups));


        String [][] studyGroups = {
                {"Ayaz", "Gulden", "Savlat", "Yuriy"},
                {"Java", "Polina", "Sultan"}
        };


        System.out.println("---------------------------------------------------------------------------");
        // print each group from 2 D array
        System.out.println( Arrays.toString(studyGroups[0])  );
        System.out.println( Arrays.toString(studyGroups[1])  );

        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < studyGroups.length; i++) {
            System.out.println(  Arrays.toString(  studyGroups[i] ) );
        }

        System.out.println("---------------------------------------------------------------------------");
        for (String [] eachSingleDArr : studyGroups) {
            System.out.println( Arrays.toString( eachSingleDArr ));
        }


        System.out.println("---------------------------------------------------------------------------");
        // OUTER LOOP: In Every cycle, we get Single D array - starting from beginning to all the way end
        for (String [] eachSingleDArr : studyGroups) {

            //System.out.println( Arrays.toString( eachSingleDArr )); // [Ayaz, Gulden, Savlat, Yuriy] | [Java, Polina, Sultan]
            // INNER LOOP
            for ( String eachName : eachSingleDArr) {
                System.out.println(eachName);
            }
            System.out.println();

        }

    }
}
