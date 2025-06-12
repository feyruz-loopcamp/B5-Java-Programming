package day15_string;

import java.util.Locale;
import java.util.Scanner;

/*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad -- Java is bad.
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

        $message wast sent
 */
public class Filter {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a message: ");
        String userMessage = key.nextLine();



        System.out.println("-------------------------------------------");
        System.out.println("Original message: : " + userMessage);

        String changedMessage = userMessage.trim(); // The reason I assigned this to another variable is because I still need to use the original message
        System.out.println("Trimmed message: : " + changedMessage);

        changedMessage = changedMessage.toLowerCase(); // java is bad. quit the course
        System.out.println("Lower cased message: " + changedMessage);


        System.out.println("-------------------------------------------");
        //"".contains(""); --- > since it is not ignoring the case sensitiveness, we need to bring everything either in LOWER CASE or in UPPER CASE to check if it actually contains since it check for EXACT value
        boolean hasBadWords = changedMessage.contains("java is bad") || //
                changedMessage.contains("quit") ||
                changedMessage.contains("have fun") ||
                changedMessage.contains("crying");


        //hasBadWords = hasBadWords.toLowerCase(); // INVALID

        if (hasBadWords) {
            System.out.println("Message failed to send");
        } else {
            System.out.println("\"" + userMessage + "\" was sent!");
        }


    }
}
