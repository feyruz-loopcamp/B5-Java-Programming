package day21_arrays;

//import java.util.Arrays;
//import java.util.Scanner;

import java.util.*;

/*
    all String types
    0 -> id
    1 -> first name
    2 -> last name
    3 -> batch number
 */
public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] student1 = {"ID#B#5S#1", "Tom", "Jerry", "B#5"};
        //System.out.println(student1);
        System.out.println(Arrays.toString(student1) );

        System.out.println("-------------------------------");
        String [] student2 = new String[4];
        System.out.println(Arrays.toString(student2) ); //[null, null, null, null]
        // "ID#B#5S#2"	"Winnie"	"Pooh"	"B#5"
        student2[0] = "ID#B#5S#2";
        student2[1] = "Winnie";
        student2[2] = "Pooh";
        student2[3] = "B#5";
        String str = Arrays.toString(student2);  //"[ID#B#5S#2, Winnie, Pooh, B#5]"
        System.out.println( Arrays.toString(student2) );

        System.out.println("-------------------------------");

        // Hey give me the first name of the 2nd student
        System.out.println(student2[1]);

        System.out.println("-------------------------------");
//        String [] student3 = new String[4]; //[null, null, null, null]
//        System.out.print("Please, enter ID: ");
//        //String id = input.nextLine();
//        //student3[0] = id;
//        student3[0] =  input.nextLine();
//        System.out.print("Please, enter first name: ");
//        student3[1] = input.nextLine();
//        System.out.print("Please, enter last name: ");
//        student3[2] = input.nextLine();
//        System.out.print("Please, enter batch no: ");
//        student3[3] = input.nextLine();
//
//        System.out.println( Arrays.toString(student3) );

        System.out.println("*********************************");
        String [] questions = {"Please, enter ID: ", "Please, enter first name: ", "Please, enter last name: ", "Please, enter batch no: "};

//        String [] student4 = new String[4]; //[null, null, null, null]
//        System.out.print(questions[0]);
//        //String id = input.nextLine();
//        //student3[0] = id;
//        student4[0] =  input.nextLine();
//        System.out.print(questions[1]);
//        student4[1] = input.nextLine();
//        System.out.print(questions[2]);
//        student4[2] = input.nextLine();
//        System.out.print(questions[3]);
//        student4[3] = input.nextLine();
//        System.out.println( Arrays.toString(student4) );
        System.out.println("*********************************");
        String [] student5 = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.print( questions[i] );
            student5[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(student5));


    }
}
