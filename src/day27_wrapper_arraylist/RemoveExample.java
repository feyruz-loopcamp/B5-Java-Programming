package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList <String> arrList = new ArrayList<>();
        System.out.println(arrList.size()); // 0
        System.out.println(arrList); // []

        System.out.println("------------------------------------");
        //arrList.add(10);  // Invalid: The ArrayLis is type of String. We cannot add Integer
        //arrList.add(10+""); // We can concatenate - convert it to be String so we can add.

        arrList.add("java");
        arrList.add("bread");
        arrList.add("water");
        arrList.add("banana");
        System.out.println(arrList); // INSERTION ORDER is KEPT. ArrayList is ORDERED
        arrList.add(0, "butter");
        System.out.println(arrList);


        System.out.println("------------------------------------");
        // How can I remove element
        // .remove(byIndex); -> remove the element from the ArrayList at the given index
        arrList.remove(0);
        System.out.println(arrList);

        System.out.println("------------------------------------");
        // Remove the last element
        arrList.remove(arrList.size() - 1);
        System.out.println(arrList);

        System.out.println("------------------------------------");
        arrList.add("java");
        System.out.println(arrList);
        arrList.add("api");
        arrList.add("softskills");
        arrList.add("db");
        arrList.add("aws");
        System.out.println(arrList);


        System.out.println("------------------------------------");
        // How can I remove element
        // .remove(byElement/byObject); -> removes the element from the ArrayList by the object at the first match
        arrList.remove("java");
        System.out.println(arrList);

        arrList.remove("soft-skills");
        System.out.println(  arrList.remove("soft-skills") );
        System.out.println(arrList);




    }
}


/*
    ArrayList Methods
        .size()
        .add(Element)
        .add(index, Element)
        .get(index)
        .isEmpty()
        .contains(Element);
        .remove(byIndex);
        .remove(byElement/byObject);
 */