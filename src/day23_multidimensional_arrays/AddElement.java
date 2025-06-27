package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

    Ex:
        {45, 123, 62}
        adding 100
        {45, 123, 62, 100}
 */
public class AddElement {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int [] arr = {45, 123, 62};
        System.out.println("This our original array: " + Arrays.toString(arr));

        System.out.print("How many elements do you want to add: "); // 4
        int newSize = arr.length + key.nextInt();

        int [] biggerArr = Arrays.copyOf(arr, newSize); // [45, 123, 62, 0, 0]
        System.out.println("The new array is: " + Arrays.toString(biggerArr));

        System.out.println("Please, give me elements, so I can add them into array. ");

        for (int i = 0; i < newSize - arr.length; i++) {
            System.out.print("Your num: ");
            biggerArr [ arr.length + i ] = key.nextInt();
            // biggerArr [4] = key.nextInt();
            // biggerArr [5] = key.nextInt();
            // biggerArr [6] = key.nextInt();
        }

        System.out.println("After adding elements, this is the array: " + Arrays.toString(biggerArr));


        /*
            //Option 2
            for (int i = arr.length + i; i < biggerArr.length; i++) {
                System.out.print("Your num: ");
                biggerArr [ i ] = key.nextInt();
                // biggerArr [4] = key.nextInt();
                // biggerArr [5] = key.nextInt();
                // biggerArr [6] = key.nextInt();
            }
         */


    }
}
