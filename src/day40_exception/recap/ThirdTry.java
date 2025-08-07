package day40_exception.recap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Please enter the first number: ");
            int firstNumber = sc.nextInt(); // InputMismatchException

            System.out.print("Please enter the second number: ");
            int secondNumber = sc.nextInt(); // InputMismatchException

            System.out.println(firstNumber / secondNumber); // ArithmeticException

            String str = null;
            System.out.println(str.length()); // NullPointerException

            // Any Parent exception class canNOT be before the Child exception class but other-way around is OK
            //} catch (RuntimeException e) {
            //    e.getMessage();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } finally {
            // "finally" block will be executed NO MATTER if there was an exception or not. (if the exception caught or not)
            System.out.println("FINALLY BLOCK");
            sc.close();
        }


        System.out.println("END...");


    }


}
