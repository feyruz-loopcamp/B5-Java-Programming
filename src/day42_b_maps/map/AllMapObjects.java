package day42_b_maps.map;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map <String, String> map1 = new HashMap<>();
        map1.put("feyruz", "java");
        map1.put("nadir", "selenium");
        map1.put("diana", "mentor");
        map1.put("iryna", "mentor");
        map1.put(null, "general");
        map1.put("test", null);
        map1.put("check", null);
        map1.put("check", "loop");
        System.out.println(map1);


        System.out.println("-----------------------------------------");
        Map <String, String> map2 = new LinkedHashMap<>();
        map2.put("feyruz", "java");
        map2.put("nadir", "selenium");
        map2.put("diana", "mentor");
        map2.put("iryna", "mentor");
        map2.put(null, "general");
        map2.put("test", null);
        map2.put("check", "loop");
        map2.put("check", null);
        System.out.println(map2);

        System.out.println("-----------------------------------------");
        Map <String, String> map3 = new TreeMap<>();
        map3.put("feyruz", "java");
        map3.put("nadir", "selenium");
        map3.put("diana", "mentor");
        map3.put("iryna", "mentor");
        //map3.put(null, "general"); // KEYs: null is NOT OK
        map3.put("test", null);
        map3.put("check", "loop");
        map3.put("check", null);
        System.out.println(map3);

        System.out.println("-----------------------------------------");
        Map <String, String> map4 = new Hashtable<>();
        map4.put("feyruz", "java");
        map4.put("nadir", "selenium");
        map4.put("diana", "mentor");
        map4.put("iryna", "mentor");
        //map4.put(null, "general"); //  null is NOT OK
        //map4.put("test", null); //  null is NOT OK
        map4.put("check", "loop");
        //map4.put("check", null); //  null is NOT OK
        map4.put("test", "mentor");
        System.out.println(map4);
        /*
            Map
                HashMap
                    - random order based on KEY
                    - KEYs: no duplicate
                    - VALUEs: duplicates are OK
                    - KEys: null is OK
                    - VALUEs: null is OK

                LinkedHashMap
                    - insertion order is kept based on KEY
                    - KEYs: no duplicate
                    - VALUEs: duplicates are OK
                    - KEys: null is OK
                    - VALUEs: null is OK

                TreeMap
                    - order is SORTED based on KEY
                    - KEYs: no duplicate
                    - VALUEs: duplicates are OK
                    - KEYs: null is NOT OK
                    - VALUEs: null is OK

                HashTable
                    - random order based on KEY
                    - KEYs: no duplicate
                    - VALUEs: duplicates are OK
                    - KEYs: null is NOT OK
                    - VALUEs: null is NOT OK
                    - Synchronized (Thread-Safe)

         */

    }
}
