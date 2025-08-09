package day42_a_collection.collection;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {
        /*
            Q:L What is the difference between List and Set
                LIST interface
                    - Insertion order is kept
                    - allows null
                    - allows duplicate

                SET interface
                    - Insertion order depends on which class it is
                        - HashSet: Random order
                        - LinkedHashSet: Insertion order
                        - TreeSet: sorted Order
                    - Fot allowing null depends on which class it is
                        - HashSet: allows null
                        - LinkedHashSet: allows null
                        - TreeSet: does NOT allow null
                    - does NOT allow duplicate
         */
        List <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(-5);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(4);
        list.add(null);
        System.out.println(list);

        System.out.println("--------------------------------");
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(-5);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(4);
        set.add(null);
        System.out.println(set);



        System.out.println("**********************************");

        // Q: How we can get each the element from set
        // A: We can loop through and get each element

        for ( Integer each : set) {
            System.out.println(each);
        }

        // Same thing can be applied to lsit as well
        System.out.println();
        for ( Integer each : list) {
            System.out.println(each);
        }


        System.out.println();
        // Q: Can you sort HashSet ?
        set.remove(null);
        System.out.println(set);
        Set <Integer> sorted = new TreeSet<>(set);
        System.out.println(sorted);


        System.out.println();
        // Q: Can you remove duplicates
        System.out.println(list);
        Set <Integer> noDupList = new HashSet<>(list);
        System.out.println(noDupList);


        System.out.println();
        // Q: Can you remove duplicates and also sort
        list.remove(null);
        System.out.println(list);
        Set <Integer> noDupAndSortList = new TreeSet<>(list);
        System.out.println(noDupAndSortList);


        System.out.println("################################");
        String str = "vnkjsfjlsv;rnvser39045830495nvskljrfd4";


        // get me the letters from each (remove duplicates)
        str.split(""); // ["v", "n", .......... "4"]
        Arrays.asList( str.split("")); // converting arrays into Collection type so it can be used with Collections
        Set <String> set1 = new HashSet<>( Arrays.asList( str.split(""))  );
        System.out.println(str);
        System.out.println(set1);

        // remove dup + also keeping insertin order
        Set <String> set2 = new LinkedHashSet<>( Arrays.asList( str.split(""))  );
        System.out.println(set2);

        // remove dup + also sort
        Set <String> set3 = new TreeSet<>( Arrays.asList( str.split(""))  );
        System.out.println(set3);



        System.out.println("################################");
        System.out.println(str);
        List <String> list1 = new ArrayList<>( Arrays.asList( str.split(""))  );
        System.out.println(list1);


    }
}

