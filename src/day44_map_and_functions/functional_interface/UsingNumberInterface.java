package day44_map_and_functions.functional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {
        A a = new A();
        a.apply(10);

        B b = new B();
        b.apply(10);

        System.out.println("---------------------");

        // Lambda Expression ---->  () -> {};
        // - after -> (arrow), if there are more than 1 statement you must to use { }
        //- if abstract method has only 1 argument, you can use it without parenthesis
        NumberInterface evenOrOdd = (num)  -> {
            if (num % 2 == 0) {
                System.out.println(num + " is even!");
            } else {
                System.out.println(num + " is odd!");
            }
        };


        evenOrOdd.apply(10);
        evenOrOdd.apply(5);


        System.out.println("---------------------");
        //- after -> (arrow), if there is ONLY 1 statement you do not need to use { }
        //- if abstract method has only 1 argument, you can use it without parenthesis
        NumberInterface culculateCube = num  ->
            System.out.println("Cube of " + num + " is " + num * num * num);


        culculateCube.apply(10);
        culculateCube.apply(20);

        /*
            Lambda Expression
                - after -> (arrow), if there is ONLY 1 statement you do not need to use { }
                - after -> (arrow), if there are more than 1 statement you must to use { }

                - if abstract method has only 1 argument, you can use it without parenthesis
         */

    }
}
