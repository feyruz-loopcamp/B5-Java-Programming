package day41_collection.set;

import java.util.*;

public class SetObjects {
    public static void main(String[] args) {
        /*
            HashSet<String> set1 = new HashSet<>();         // Reference: ITSELF
            List<String> set1 = new HashSet<>();            // Reference: "Parent" Interface Set
            Collection<String> set1 = new HashSet<>();      // Reference: "Parent" Interface Collection
            Iterable<String> set1 =new HashSet<>();         // Reference: "Parent" Interface Iterable
         */
         /*
            HashSet
                -- Internally using tail and head structure
                -- Insertion order is NOT kept / Random order
                -- Does not have indexes
                -- it accepts "null" value as well
                -- it does NOT accept duplicate values
         */
        Set <String> set1 = new HashSet<>();
        set1.add(null);
        set1.add("hello");
        set1.add("$9.99");
        set1.add("400");
        set1.add("hello");
        set1.add("Hello");
        set1.add("%");
        System.out.println(set1);


        System.out.println("----------------------------------");
         /*
            LinkedHashSet
                -- Internally using tail and head structure
                -- Insertion order is kept
                -- Does not have indexes
                -- it accepts "null" value as well
                -- it does NOT accept duplicate values
         */
        Set <String> set2 = new LinkedHashSet<>(Arrays.asList("a", "b", "c"));
        set2.add(null);
        set2.add("hello");
        set2.add("$9.99");
        set2.add("400");
        set2.add("hello");
        set2.add("Hello");
        set2.add("%");
        System.out.println(set2);


        System.out.println("----------------------------------");
         /*
            TreeSet
                -- In addition,  "SortedSet" interface can also be reference for new TreeSet();
                -- Internally using tail and head structure
                -- Insertion order is SORTED
                -- Does not have indexes
                -- it does NOT accepts "null" value
                -- it does NOT accept duplicate values
         */
        Set <String> set3 = new TreeSet<>();
        //set3.add(null);
        set3.add("hello");
        set3.add("$9.99");
        set3.add("400");
        set3.add("hello");
        set3.add("Hello");
        set3.add("%");
        System.out.println(set3);





        System.out.println("*******************************");
        Set <String> set4 = new LinkedHashSet<>(Arrays.asList("a", "b", "3", "%", "$66", "a"));
        System.out.println(set4);

        Set <String> set5 = new TreeSet<>(Arrays.asList("a", "b", "3", "%", "$66", "a"));
        System.out.println(set5);
    }
}
