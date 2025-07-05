package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Data Structure - it is container that hold the data in a specific structured way.

        int a = 45; // this is not a data structure. It is a local container (variable) that holds a SINGLE data
        int [] arr = {12, 34, 2354}; // this is array data structure which holds MULTIPLE data of SAME data type.
        Integer []  arr2 = {23, 54, 345}; // array data structure works with BOTH - Primitive and Non-Primitive data types. SIZE is Fixed. Has indexes

    /*
        Note: All other Data Structures in Java, only works with OBJECT type (Non_Primitive). Does NOT work with Primitive
        1) ArrayList
            - works ONLY with OBJECT type (Non_Primitive). Does NOT work with Primitive
            - Size is flexible (changeable). Not fixed like Array
            - comes from java.util package
     */

        //ArrayList <int> arrList; // ArrayList collection data structure is not supporting the Primitive DataType
        ArrayList <Integer> arrList; // We just declared the Object Reference. Have not assigned the object yet


        //System.out.println(arrList); // since there is not initial value, we cannot print/use
        ArrayList <Integer> arrList2 = null; // I create ArrayList of Integer refence, with no ACTUAL object yet being null
        System.out.println(arrList2); // null

        ArrayList <Integer> arrList3 = new ArrayList<>(); // I create ArrayList of Integer, with ACTUAL object being empty
        System.out.println(arrList3); // []


        // Creating ArrayLis tof Integer with initial Capacity by 10 - NOT IN USE a lot
        // ArrayList <Integer> arrList4 = new ArrayList<>(10);


        System.out.println("----------------------------------------------------------------------------");
        // .size();
        //System.out.println(arrList2.size()); // NullPointerException - since it is not the actual, getting NullPointerException
        System.out.println(arrList3.size()); //  [] --- > 0



        System.out.println("----------------------------------------------------------------------------");
        // But how can I add element in ArrayList
        int [] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr2[2] = 30;
        //arr2[3] = 40; // ArrayIndexOutOfBoundsException - > we can not add elements in array DIRECTLY because size is FIXED in array


        // .add(Element/Data); -- > adds the given Element to the END of the list
        //arrList2.add(10); // NullPointerException ->  since there is no ACTUAL object assigned to this, it will get NullPointerException
        arrList3.add(10);
        System.out.println(arrList3); // [10]
        System.out.println(arrList3.size()); // 1

        arrList3.add(20);
        System.out.println(arrList3); // [10, 20]

        arrList3.add(30);
        System.out.println(arrList3); // [10, 20, 30]
        //    INDEX                       0    1   2

        System.out.println("----------------------------------------------------------------------------");
        // How can I get the element
        // .get(index);
        System.out.println( arrList3.get(0) );
        System.out.println( arrList3.get(1) );
        System.out.println( arrList3.get(2) );
        //System.out.println( arrList3.get(3) ); // IndexOutOfBoundsException - because I do not have element at that index. Because the current size 3 (last index is 2)


        System.out.println("----------------------------------------------------------------------------");
        // How can I add the element on the EXACT index - Ex: add -10 at index 1
        // [10, 20, 30]
        //  0   1   2
        // .add(index, Element/Data); -- > adds the given Element to the given index inside of the list and pushes all other to right side
        arrList3.add(1, -10);
        // [10, -10, 20, 30]
        //   0   1   2    3
        System.out.println(arrList3);
        System.out.println(arrList3.size());

        System.out.println("----------------------------------------------------------------------------");
        // Can you get me the last element in ArrayList of Integer
        System.out.println( arrList3.get( arrList3.size() - 1 ) );

        // Can you get me the first element in ArrayList of Integer
        System.out.println( arrList3.get( 0 ) );

        arrList3.add( (int)23.7 );  // double -- > int ---- > AUTOBOXING --- > Integer
        System.out.println(arrList3);

    }



}


/*
    ArrayList Methods
        .size()
        .add(Element)
        .add(index, Element)
        .get(index)
 */
