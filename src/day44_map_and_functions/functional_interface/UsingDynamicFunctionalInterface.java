package day44_map_and_functions.functional_interface;

public class UsingDynamicFunctionalInterface {
    public static void main(String[] args) {
        // Lambda Expression: () -> {}
        DynamicFunctionalInterface <String> printChar = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        };



        DynamicFunctionalInterface <Integer> printNum5Times = (num) -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(num);
            }
        };


        printChar.test("Loopcamp");
        System.out.println("-----------");
        printNum5Times.test(5);

    }
}
