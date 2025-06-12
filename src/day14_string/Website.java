package day14_string;

import java.util.Locale;
import java.util.Scanner;

/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
        .io

      in cases it is not valid, tell the reason why

 */
public class Website {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter a website: ");
        String websiteUrl = key.next(); // WWW.loopcamp.io
        websiteUrl = websiteUrl.toLowerCase(); // here we are trying to avoding the case sensitiveness

        boolean hasValidBeginning = websiteUrl.startsWith("www");
        boolean hasValidEnding = websiteUrl.endsWith(".com") || websiteUrl.endsWith(".edu") || websiteUrl.endsWith(".gov") || websiteUrl.endsWith(".net") || websiteUrl.endsWith(".io");


        if ( hasValidBeginning && hasValidEnding) {
            System.out.println("It is valid website!");
        } else {
            System.out.println("Not valid website URL!");

            if (!hasValidBeginning) {
                System.out.println("Beginning is not correct!");
            }

            if (!hasValidEnding) {
                System.out.println("Ending is not correct!");
            }
        }

    }
}
