package day42_b_maps.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        // MAP - it works with KEY and VALUE pair - aka (as known as) ENTRY

        // List sample
        List <String> list = new ArrayList<>();

        // Map sample
        //     KEY     VALUE
        Map <Integer, String> map = new HashMap<>();
        // .add(Elem) --- > put(Elem1, Elem2) - > put (KEY, VALUE);
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(0, "Zero");
        map.put(-1, "MinusOne");
        map.put(2, "SecondTwo");
        map.put(20, "SecondTwo");
        map.put(null, "SecondTwo");
        map.put(30, null);
        map.put(null, null);
        // map.put("50", null); // This is not acceptable since KEY data type is Integer but "50" is String
        map.put(Integer.parseInt("50"), null); // Converted String into Integer
        //map.put(Integer.parseInt("Fifty"), null); // Here "Fifty" is not convertible to Digit
        map.put(1, "ONE");
        map.put(1, "ONE");
        System.out.println(map);

        /* {
            KEY=VALUE
            0=Zero,
            -1=MinusOne,
            null=null,
            1=One,
            2=SecondTwo,
            3=Three,
            4=Four,
            20=SecondTwo,
            30=null}
         */

        /*
            MAP
                HashMap
                    - Random Order (order is based on the KEYs)
                    - For KEY - null is accepted
                    - For KEY - does not allow duplicates
                        - If there existing matching KEY, it updates the value
                    - For VALUES - allows duplicates
         */
        System.out.println("---------------------------------------------------------");
        // Q: How do we get/retrieve the elements from Map
        //map.get(KEY)
        //map.get("1"); // NOT VALID - because all the KEys are Integer
        System.out.println(map.get(1));
        System.out.println(map.get(null));


        System.out.println("---------------------------------------------------------");
        // Q: How many ENTRYs (KEY-VALUE pair)
        System.out.println(map.size());


        System.out.println("---------------------------------------------------------");
        // Q: How can I remove
        //map.remove(KEY)
        map.remove(1);
        System.out.println(map);
        map.remove(9999);  // If no Matching KEY to remove, no changes will happen
        System.out.println(map);

        System.out.println("---------------------------------------------------------");
        // Q: how to check if specific KEY exist among all the KEYS
        System.out.println(map.containsKey("1")); // Since datatype does not match, it returns false
        System.out.println(map.containsKey(1)); // Since it was removed, it returns false
        System.out.println(map.containsKey("2")); // Since datatype does not match, it returns false
        System.out.println(map.containsKey(2)); // true


        System.out.println("---------------------------------------------------------");
        // Q: how to check if specific VALUE exist among all the VALUES
        System.out.println(map.containsValue(null));
        System.out.println(map.containsValue("ONE")); // Since it was removed, it returns false
        System.out.println(map.containsValue("THree")); // Since it is not EXACT match, it returns false
        System.out.println(map.containsValue("Three")); // Since it is not EXACT match, it returns false

        System.out.println("---------------------------------------------------------");
        Map <String, String> cartoonCharacters = new HashMap <> ();
        // KEY ---- > FirstNames
        // VALUE -- > LastNames
        cartoonCharacters.put("Tom", "Jerry");
        cartoonCharacters.put("Winnie", "Pooh");
        System.out.println(cartoonCharacters);

        System.out.println("---------------------------------------------------------");
        Map <String, String> movieStars = new HashMap <> ();
        // KEY ---- > FirstNames
        // VALUE -- > LastNames
        movieStars.put("James", "Bond");
        movieStars.put("Harry", "Potter");
        System.out.println(movieStars);


        System.out.println("---------------------------------------------------------");
        Map <String, Map <String, String> > allGroups = new HashMap <> ();
        allGroups.put("Cartoon Characters", cartoonCharacters);
        allGroups.put("Movie Stars", movieStars);
        System.out.println(allGroups);
        System.out.println(cartoonCharacters);
        System.out.println(movieStars);
        /*
        {
             KEY            VALUE
            Movie Stars={James=Bond, Harry=Potter},
            Cartoon Characters={Tom=Jerry, Winnie=Pooh}
        }
         */

        System.out.println("---------------------------------------------------------");
        // Q: get me cartoon characters from allGroups
        System.out.println(allGroups.get("Cartoon Characters")); // returns Map <String, String>
        System.out.println(allGroups.get("Movie Stars")); // returns Map <String, String>

        System.out.println("---------------------------------------------------------");
        //Q: get me the last name for "James" from Movie Stars inside of the allGroups
        //allGroups.get("Movie Stars"); // {James=Bond, Harry=Potter}
        System.out.println(allGroups.get("Movie Stars").get("James"));


    }
}

/*
    methods so far
        - put(KEY, VALUE)
        - get (KEY)
        - remove (KEY)
        - size()
        - containsKey(KEY)
        - containsValue(VALUE)
 */