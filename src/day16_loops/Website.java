package day16_loops;

import java.util.Scanner;

/*
    Task
        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
 */
public class Website {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter URL: ");
        String url = scanner.next();

        // if url does not start with www. and does not end with .com --- >  invalid url
        if ( !url.startsWith("www.")  || !url.endsWith(".com")  ){
            System.out.println("Invalid URL");
        } else {
            System.out.println("Middle portion of URL: " + url.substring(url.indexOf(".") + 1, url.lastIndexOf(".")) );
        }
    }
}
