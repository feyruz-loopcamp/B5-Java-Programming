package day21_arrays;

import java.util.Scanner;

/*
    Ask the user the month number they want, print the month name

    1 --> January

    12 --> December

    Assume only valid numbers are given, but as a challenge you can handle invalid numbers
 */
public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please, enter a number and I will tell you name of the month.");
        String [] months = {"January", "February", "March", "April", " May",  "June",  "July", "August", "September", "October", "November", "December"};
        //                     0        1         2           3       4       5          6        7           8       9           10          11
        String [] months2 = {"January, February, March, April, May, June, July, August, September, October, November, December"};

        System.out.println(months.length);  // 12
        System.out.println(months2.length); // 1

        int userMonthNum;

        do {
            System.out.print("Enter: ");
            userMonthNum = input.nextInt(); //1

//            if (userMonthNum == 1){
//                System.out.println("January");
//            } else if (userMonthNum == 2) {
//                System.out.println("February");
//            } else if (userMonthNum == 3) {
//                System.out.println("March");
//            } else if (userMonthNum == 4) {
//                System.out.println("April");
//            } else if (userMonthNum == 5) {
//                System.out.println("May");
//            } else if (userMonthNum == 6) {
//                System.out.println("June");
//            } else if (userMonthNum == 7) {
//                System.out.println("July");
//            } else if (userMonthNum == 8) {
//                System.out.println("August");
//            } else if (userMonthNum == 9) {
//                System.out.println("September");
//            } else if (userMonthNum == 10) {
//                System.out.println("October");
//            } else if (userMonthNum == 11) {
//                System.out.println("November");
//            } else if (userMonthNum == 12) {
//                System.out.println("December");
//            }

            if (userMonthNum >= 01 && userMonthNum <= 12) {
                System.out.println( months[userMonthNum -1] ); // [1]
            }


        } while (userMonthNum < 1 || userMonthNum > 12); // 1 - 12


    }
}
