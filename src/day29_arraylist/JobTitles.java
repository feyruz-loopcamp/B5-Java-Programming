package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        //.addAll(Collection) | addAll(index, Collection)
        ArrayList <String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList( "QA", "SDET", "QE", "Developer", "BA", "SM", "PO", "PM", "BA" ));
        System.out.println(jobTitles);

        System.out.println("-----------------------------------------------------");
        // .removeAll(Collection); - removes all the given elements at the ALL EXACT matches from the list.
        //jobTitles.removeAll("QA", "SDET", "QE");  // NOT VALID
        jobTitles.removeAll(   Arrays.asList( "qa", "PO", "QE", "BA", "CEO" )   );
        System.out.println(jobTitles);

        System.out.println("-----------------------------------------------------");
        // .retainsAll(Collection); - Keep the matching ones only - remove all others
        jobTitles.retainAll(Arrays.asList("QA", "SDET", "Developer", "BA"));
        System.out.println(jobTitles);


        System.out.println("-----------------------------------------------------");
        // .containsAll(Collection) ; - check if ALL Exact the GIVEN collection is in your ArrayList
        System.out.println(  jobTitles.containsAll(Arrays.asList("QA", "SDET"))  );
        System.out.println(  jobTitles.containsAll(Arrays.asList("QA", "SDET", "PM"))  );

    }
}
