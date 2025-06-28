package day24_methods;

public class MaMath {
    public static void main(String[] args) {

        addition(10, 34);
        addition(52, 45);

        System.out.println("-------------");

        subtract(34, 53);
        subtract(34, 21);

        System.out.println("-------------");

        multiply(23, 54);
        multiply(3, 2);


        System.out.println("-------------");

        divide(12, 3);
        divide(12, 0);
        divide(4, 5);

        System.out.println("-------------");

        allArithmeticResults(43, 54);

    }


    public static void addition (int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtract (int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiply (int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void divide (int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Not divisble by 0");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }


    public static void allArithmeticResults (int num1, int num2) {
        addition(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);
    }

}
