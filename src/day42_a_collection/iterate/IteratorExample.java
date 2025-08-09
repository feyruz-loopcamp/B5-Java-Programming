package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Java");
        list.add("SoftSkills");
        list.add("Selenium");
        list.add("AWS");
        list.add("Database");
        list.add("API");

        System.out.println(list);
        ArrayList <String> list2 = new ArrayList<>(list);
        System.out.println(list2);

        System.out.println("--------------------------------------------------");
        // 1 - iterator
        Iterator <String> it = list2.iterator(); // .iterator() method returns Iterator class (as a data type: non-primite)

        //  v
        // ["Java", "SoftSkills", "Selenium", "AWS", "Database", "API"]
        System.out.println(it.hasNext());
        System.out.println(it.next());

        //          v
        // ["Java", "SoftSkills", "Selenium", "AWS", "Database", "API"]
        System.out.println(it.hasNext());
        System.out.println(it.next());

        //                        v
        // ["Java", "SoftSkills", "Selenium", "AWS", "Database", "API"]
        System.out.println(it.hasNext());
        System.out.println(it.next());

        //                                    v
        // ["Java", "SoftSkills", "Selenium", "AWS", "Database", "API"]
        System.out.println(it.hasNext());
        System.out.println(it.next());

        //                                           v
        // ["Java", "SoftSkills", "Selenium", "AWS", "Database", "API"]
        System.out.println(it.hasNext());
        System.out.println(it.next());

        //                                                       v
        // ["Java", "SoftSkills", "Selenium", "AWS", "Database", "API"]
        System.out.println(it.hasNext());
        System.out.println(it.next());

        try {
            //                                                            v
            // ["Java", "SoftSkills", "Selenium", "AWS", "Database", "API"]
            System.out.println(it.hasNext());
            System.out.println(it.next()); // NoSuchElementException
        } catch (NoSuchElementException e) {
            //System.out.println(e.getMessage());
            System.out.println("NoSuchElementException occurred");
        }


        System.out.println("-------------------------------------------");
        // Q: How can I reset it back to beginning
        it = list2.iterator();
        //  v
        // ["Java", "SoftSkills", "Selenium", "AWS", "Database", "API"]
        System.out.println(it.hasNext());
        System.out.println(it.next());

        //          v
        // ["Java", "SoftSkills", "Selenium", "AWS", "Database", "API"]

        System.out.println("-------------------------------------------");

        while (it.hasNext()) {
            String each = it.next();
            if (each.contains("A") ||each.contains("a")) {
                it.remove();
            }
        }
        System.out.println(list2);

    }
}
