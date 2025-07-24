package day34_b_encapsulation;

public class Road {
    public static void main(String[] args) {

        TrafficLight intersectionA_TL1 = new TrafficLight("Yellow");
        // Since it changed to be private, cannot access like this anymore
        //System.out.println(intersectionA_TL1.color);
        // We can use the getter (if available)
        System.out.println(intersectionA_TL1.getColor());
        /*
        .
        .
        .
        .
        .
        .
        .
        .
        .
        .
        .
        .
        .

        .
        .
        .
        .
        .
        .
        .
        .
        .
        .
        .
        .
        .
        .

         */
        // Since there are only 3 valid colors, it would be good idea to not give direct access to anyone cannot assign anything
        //intersectionA_TL1.color = "Pink";
        //System.out.println(intersectionA_TL1.getColor());

        intersectionA_TL1.setColor("pink");
        System.out.println( intersectionA_TL1.getColor() );


        TrafficLight intersectionB_TL2 = new TrafficLight("Pink");
        System.out.println( intersectionB_TL2.getColor());



    }
}
