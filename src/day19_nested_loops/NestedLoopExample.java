package day19_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {

        // print: Hello World
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println();
        // do with loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("**********************");
        System.out.println("Hello Galaxy");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");
        System.out.println("Hello Galaxy");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");
        System.out.println("Hello Galaxy");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");

        System.out.println();
        // OUTER LOOP
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("Hello Galaxy");

            // INNER LOOP / nested loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Hello Moon");
            }
        }

        System.out.println("**********************");

        // OUTER LOOP - 3x
        for (int i = 0; i < 3; i++) {

            // INNER LOOP - 6x
            for (int j = 0; j < 6; j++) {
                System.out.println(10);
            }
            System.out.println();

        }

    }
}
