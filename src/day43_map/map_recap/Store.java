package day43_map.map_recap;

import java.nio.DoubleBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Store {
    public static void main(String[] args){
        //    KEY     VALUE
        Map <String, Double> store = new HashMap <>();


        // 1 - .put(KEY, VALUE)
        store.put("Water", 1.9);
        store.put("Bread", 2.9);
        store.put("Cheese", 3.9);
        store.put("Coffee", 1.9);
        store.put("Banana", 4.9);

        store.put("Bread", 0.9); // KEY exists, so it updated the VALUE linked to that KEY

        System.out.println(store);

        // 2 - .get (KEY)
        System.out.println(store.get("Water"));

        // 3 - .remove(KEY)
        store.remove("Banana");
        System.out.println(store);

        // 4 - .containsKey(KEY);
        System.out.println( store.containsKey("Water") );
        System.out.println( store.containsKey("Banana") );

        // 5 - .containsValue(VALUE)
        System.out.println(store.containsValue(2.9));
        System.out.println(store.containsValue(4.9));
        System.out.println(store.containsValue(3.9));

        // 6 - .size()
        System.out.println( store.size() );

        System.out.println("--------------------------------");

        // 7 - .keySet();
        System.out.println( store.keySet() );
        Set<String> storeKeys = store.keySet();
        System.out.println(storeKeys);

        System.out.println();
        // Loop through the KEY from store Map
        for ( String eachKey : store.keySet()) {
            System.out.println(eachKey);
        }


        System.out.println("--------------------------------");
        // 8 - .values()
        System.out.println( store.values() );
        Collection <Double> storeValues = store.values();
        System.out.println(storeValues);

        System.out.println();
        // Loop through the VALUES from store Map
        for ( Double eachValue : store.values()) {
            System.out.println(eachValue);
        }


        System.out.println("--------------------------------");
        // 9 - .entrySet();
        //              - Map.Entry <String, Double> eachKeyValuePair
        //                      - .getKey()
        //                      - .getValue()

        /*
              KEY       VALUE
            "Water",     1.9  ---> ENTRYSET ---- >  1 KEY-VALUE pair
            "Bread",     0.9  ---> ENTRYSET ---- >  1 KEY-VALUE pair
            "Cheese",    3.9  ---> ENTRYSET ---- >  1 KEY-VALUE pair
            "Coffee",    1.9  ---> ENTRYSET ---- >  1 KEY-VALUE pair

            [ [ "Water",     1.9],  [ "Bread",     0.9 ], [ "Cheese",    3.9], ["Coffee",    1.9 ] ]
         */


        for ( Map.Entry <String, Double> eachKeyValuePair : store.entrySet()) {
            System.out.println(eachKeyValuePair);                   // Water=1.9

            System.out.println(eachKeyValuePair.getKey());          // Water
            System.out.println(eachKeyValuePair.getValue());        // 1.9

            System.out.println();
        }




        System.out.println("--------------------------------");
        // Option 1
        for ( String eachKEy : store.keySet()){
            System.out.println(eachKEy);
        }

        System.out.println();
        // Option 2
        for ( Map.Entry<String, Double> keyValuePair: store.entrySet()) {
            System.out.println(keyValuePair.getKey());
        }


    }
}
