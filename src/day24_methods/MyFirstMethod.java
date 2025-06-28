package day24_methods;

import java.util.Arrays;
import java.util.Scanner;

public class MyFirstMethod {


    // *method* - > it is a function which is executing set of codes inside that code block (method body)
    // public               --- >  meant that this method is accessible everywhere
    // static               --- >  we can access to this method by using the CLASS NAME
    // void                 --- > this method will do some action - do not return anything back
    // main                 --- > name of the method
    // (String[] args)      --- > parameters -> single parameter which Single D String array

    public static void main(String[] args) {
        /*
            System.out.println("Hello");

            String part = "Hello".substring(0, 3); // Hel
            int [] n = {1, 2, 4 };
            Arrays.sort(n);

            Scanner key = new Scanner(System.in);
            // key.nextInt();
        */

        MyFirstMethod.printHello(); // You can also use the class name to call your static method
        printHello(); // The reason we can call the method here directly is because this method is in the same Class (file) as the main method

        printHello50(); // CALLING method. -- > calling printHello50()

        System.out.println("Break Time");

        printHello(); // We make the function/ code in a block that we can RE_USE anytime we need

        System.out.println("----");

        printHello50();
    }


    // My own custom method
    // public               --> accessible everywhere -- > PUBLIC METHOD
    // static               --> can call it with class name -- > STATIC METHOD
    // void                 --> does nto return anything / does action -- > VOID METHOD
    // printHello           --> method name (follow the naming rules as the variable names)
    // ()                   -->  parameters -- > NO Parameters -- > NON-PARAMETERIZED method
    public static void printHello() {
        System.out.println("Hello World!");
    }


    public static void printHello50 (){
        for (int i = 1; i <= 50; i++) {
            System.out.println("Hello!");
        }
    }


}
