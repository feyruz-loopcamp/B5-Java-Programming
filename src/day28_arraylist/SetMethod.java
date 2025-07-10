package day28_arraylist;

import my_util.ArrayListUtil;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList <String> cities = new ArrayList<>();
        cities.add("Fiarfax");
        cities.add("Raleigh");
        cities.add("Frederick");
        cities.add("Centreville");
        System.out.println(cities);

        System.out.println("-------------------------------");
        // Change the first city to be "Arlington"
        cities.set(0, "Arlington");
        System.out.println(cities);

        // cities.set(10, "DC"); // IndexOutOfBoundsException
        // System.out.println(cities);


        // Change the last city to be "Chantilly"
        cities.set(cities.size()-1, "DC");
        System.out.println(cities);

        System.out.println("-------------------------------");
        System.out.println( containsIgnoreCase(cities, "dc") );
        System.out.println( containsIgnoreCase(cities, "DC") );

        System.out.println(ArrayListUtil.containsIgnoreCase(cities, "Fairfax"));

    }


    public static boolean containsIgnoreCase (ArrayList <String> arrList, String element) {
        boolean hasElement = false;


        for ( String eachElem: arrList) {

            if (eachElem.equalsIgnoreCase(element)){
                hasElement = true;
                break;
            }

        }

        return hasElement;
    }

/*
    ArrayList Methods
        .size();
        .add(Element);
        .add(index, Element);
        .get(index);
        .isEmpty();
        .contains(Element);
        .clear();
        .set(index, Element);


    ArrayList
        - size is NOT fixed
        - keeps insertion order
        - allows duplicate elements
        - works with NON-PRIMITIVE (Object type) data type
        - Internally uses Array
 */

}
