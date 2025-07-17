package day31_custom_classes;

import java.util.ArrayList;

public class UsingTrafficLight {
    public static void main(String[] args) {

        // Object Reference  = Object Itself
        // TrafficLight streetA = new TrafficLight();
        // TrafficLight streetA - > Object Reference
        // new TrafficLight();  - > Object Itself
        // TrafficLight();      - > Constructor (Non-parameterized)


        //System.out.println(streetA.color);
        // Initialized instance variable "color" for object streetA
        //streetA.color = "Yellow";
        //System.out.println(streetA.color);

        System.out.println("---------------");
        TrafficLight streetB = new TrafficLight("Red");
        System.out.println(streetB.color); // "Red"


        System.out.println("---------------");
        TrafficLight streetC = new TrafficLight("Green");
        System.out.println(streetC.color);



    }
}
