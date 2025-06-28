package day24_methods;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your full name: ");
        String fullName = key.nextLine();  // Tom Jerry  --- > tjerry@gmail.com

        buildEmail(fullName);


    }

    public static void buildEmail (String fullName){

        String result = ("" + fullName.charAt(0)) + fullName.substring(  fullName.indexOf(" ") + 1 ) + "@gmail.com";
        result = result.toLowerCase();
        System.out.println(result);

    }

    public static void buildEmail2 (String fullName){
        String [] fullNameArr = fullName.split(" ");

        String result  = ( "" + fullNameArr[0].charAt(0) ) + fullNameArr[1];

        result = result.toLowerCase();
        System.out.println(result);

    }


    // TODO: Implement the code which handles more that 2 words if given.
    // EX: Tom Jack Jerry  ----- > tjackjerry@gmail


}
