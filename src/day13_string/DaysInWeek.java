package day13_string;

import java.util.Scanner;

/*
    Given a day number, find and print the day related to the number

    1- Monday
    2- Tuesday

    6- Saturday
    7- Sunday

    any other number: Not a day
 */
public class DaysInWeek {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter a number that represents day of week (between 1 - 7): ");
        int userInput = scan.nextInt(); // 1
        //String dayFromNum = ""; // assigned empty value to String
        String dayFromNum;  // String does not have any value at all.


        switch (userInput){
            case 7:
                //System.out.println("Sunday");
                dayFromNum = "Sunday";
                break;
            case 1:
                //System.out.println("Monday");
                dayFromNum = "Monday";
                break;
            case 2:
                //System.out.println("Tuesday");
                dayFromNum = "Tuesday";
                break;
            case 3:
                //System.out.println("Wednesday");
                dayFromNum = "Wednesday";
                break;
            case 4:
                //System.out.println("Thursday");
                dayFromNum = "Thursday";
                break;
            case 5:
                //System.out.println("Friday");
                dayFromNum = "Friday";
                break;
            default:
                //System.out.println("Not a day");
                dayFromNum = "Not a day";
                break;
            case 6:
                //System.out.println("Saturday");
                dayFromNum = "Saturday";
                break;
        }

        System.out.println(dayFromNum);


    }
}
