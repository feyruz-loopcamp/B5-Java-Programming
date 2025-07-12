package day30_b_custom_classes;

import java.util.ArrayList;
import java.util.Scanner;

// Runner Class - where my execution will start from
public class AllPeople {
    public static void main(String[] args) {

        String name1; // LOCAL Variable - at Method level
        //System.out.println(name); // LOCAL variables do NOT have default values


        // CanNOT reach those instance variables directly
        //System.out.println(name);
        //System.out.println(age);
        //System.out.println(height);
        //System.out.println(isMarried);
        //System.out.println(hasKids);


        // Some sample of Object Creation
        // Reference                =   object
        Scanner key                 =   new Scanner(System.in);
        String str                  =   new String("Loopcamp");
        ArrayList <String>  list    =   new ArrayList<>();
        String [] arr               =   new String[4];


        // Creating objects of my Custom class - Person
        Person person1             =   new Person();
        Person person2             =   new Person();
        Person person3             =   new Person();
        Person person4             =   new Person();
        Person person5             =   new Person();
        Person person6             =   new Person();
        Person person7             =   new Person();


        // Now, since we have made object of Person class, we can use that object reference, to reach "things" inside of the class
        System.out.println("Person1 Info:");
        System.out.println(person1.name); // default value of String - null
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);
        System.out.println(person1.hasKids);


        System.out.println("-----------------");
        System.out.println("Person2 Info: ");
        System.out.println(person2.name); // default value of String - null
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);
        System.out.println(person2.hasKids);

        System.out.println("-----------------");
        // Assigning the data/info/values to instance variables that belongs to person1
        // name = "Tom";
        person1.name = "Tom";
        person1.age = 30;
        person1.height = 5.9;
        person1.isMarried = true;
        person1.hasKids = false;

        // Assigning the data/info/values to instance variables that belongs to person2
        person2.name = "James";
        person2.age = 40;
        person2.height = 6.1;
        person2.isMarried = false;
        person2.hasKids = true;



        // Now, since we have made object of Person class, we can use that object reference, to reach "things" inside of the class
        System.out.println("Person1 Info:");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);
        System.out.println(person1.hasKids);


        System.out.println("-----------------");
        System.out.println("Person2 Info: ");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);
        System.out.println(person2.hasKids);


        System.out.println("-----------------");
        System.out.println("Person3 Info: ");
        System.out.println(person3.name); // default value of String - null
        System.out.println(person3.age);
        System.out.println(person3.height);
        System.out.println(person3.isMarried);
        System.out.println(person3.hasKids);

        System.out.println("-----------------");
        System.out.println("Person4 Info: ");
        System.out.println(person4.name); // default value of String - null
        System.out.println(person4.age);
        System.out.println(person4.height);
        System.out.println(person4.isMarried);
        System.out.println(person4.hasKids);
    }

}
