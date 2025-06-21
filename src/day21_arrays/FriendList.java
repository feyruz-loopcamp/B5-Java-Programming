package day21_arrays;

import java.util.Scanner;

/*
    Task: Make an array of your friends names

    asking how many friends do you have

    then ask for each friend's name one at a time, store all the names into an array

    at the end print your friend list
 */
public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pleas, tell me how many friends you have: ");
        //int friendsCount = input.nextInt();  // 6
        //String [] nameOfFriends = new String[friendsCount];

        //String [] arr = new String[ 4 ];
        String [] nameOfFriends = new String[  input.nextInt()  ]; // [null, null, null, null]

        input.nextLine(); // Handling ENTER
        for (int i = 0; i < nameOfFriends.length; i++) {
            System.out.print("Please, enter name of your friend: ");
            nameOfFriends[i] = input.nextLine();
        }

        System.out.println("-------------------------------------");

        System.out.println("You have " + nameOfFriends.length + " friends. \nName of your friends: ");

        for (int i = 0; i < nameOfFriends.length; i++) {
            System.out.println("\t" + nameOfFriends[i] );
        }

    }
}
