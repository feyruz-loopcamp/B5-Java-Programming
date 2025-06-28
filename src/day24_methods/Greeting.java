package day24_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name = "Tom";
        System.out.println("Hello " + name + "!");

        // do the same thing for "James"
        name = "James";
        System.out.println("Hello " + name + "!");

        // do the same thing for "Winnie"
        name = "Winnie";
        System.out.println("Hello " + name + "!");

        System.out.println("----------------------------------------");

        sayHelloTo();
        sayHelloTo();
        // sayHelloTo("Tom"); // INVALID - this method does not accept anything

        System.out.println("----------------------------------------");
        //sayHelloTo2(); // INVALID - this method required a String data
        sayHelloTo2("Tom");
        sayHelloTo2("James");
        sayHelloTo2("Loopcamp");
        sayHelloTo2("sdkfja");


        System.out.println("----------------------------------------");
        Scanner key = new Scanner(System.in);
        System.out.print("What is your name: ");
        String userName = key.next(); // TOM
        sayHelloTo2(userName);

    }

    // public method, static method, void method, NON-PARAMETERIZED
    public static void sayHelloTo () {
        System.out.println("Hello " + "Tom" + "!");
    }

    // public method, static method, void method, PARAMETERIZED (1 parameter/1 argument) - String name
    // This method accepts 1 parameter of String data type
    public static void sayHelloTo2 (String name) {
        name = ("" +name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase(); // format: first letter upper + rest lower
        System.out.println("Hello " + name + "!");
    }



}
