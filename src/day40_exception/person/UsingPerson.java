package day40_exception.person;

import java.util.Scanner;

// Runner Class
public class UsingPerson {
    public static void main(String[] args) {
        Person person = new Person();
        //System.out.println( person.getName() );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        // Option 1:  Handling possible runtime exception
        try {
            person.setName(name);
        } catch (RuntimeException e) {
            //System.out.println( e.getMessage() );
            e.printStackTrace();
        }

        System.out.println("This line is next ");


        System.out.print("Enter ege: ");
        int age = sc.nextInt();
        // COMPILE two options
        // Option 1: handle with try catch block
        // Option 2: Ignor it by passing it in the method signature
        try {
            person.setAge(age);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("Last line");


    }
}
