package day29_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class InstacartShopping {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ArrayList <String> shoppingList = new ArrayList<>();
        // size = 0; System.out.println( shoppingList.size() );
        // capacity = 10

        //System.out.println( shoppingList.isEmpty() );
        statusOfShoppingList( shoppingList );

        System.out.println("-----------------------------------------------");
        String userAnswer = "";
        do {
            System.out.print("Please, enter item name to add to the list: ");
            String itemName = key.nextLine();
            shoppingList.add(itemName);

            System.out.print("Do you want to add more item: ");
            userAnswer = key.nextLine(); // Yes, yes, YES, Y, y
        } while (  userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y") );

        System.out.println("-----------------------------------------------");
        statusOfShoppingList(shoppingList);

        System.out.println("-----------------------------------------------");
        //System.out.println("Items in your shopping list: ");
        //for ( String eachItem : shoppingList) {
        //    System.out.println("\t" + eachItem);
        //}
        shoppingListItems(shoppingList);

        System.out.println("-----------------------------------------------");
        System.out.print("What item do you want to check if it is in your list: ");
        String itemName = key.nextLine();

        itemAvailability(shoppingList, itemName);


        System.out.println("-----------------------------------------------");
        System.out.print("What item do you want to remove: ");
        itemName = key.nextLine(); // "4"

        // "Bread"
        // "1"

        System.out.println( removeItem(shoppingList, itemName) );


    }

    // create a method that gives you a "message" about your shopping list
    // is empty -> Your shopping list does not have any item
    // is not empty -> Your shopping list has some item

    public static void statusOfShoppingList (ArrayList <String> list){
        //if (list.isEmpty()){
        //    System.out.println("Your shopping list does not have any item");
        //} else {
        //    System.out.println("Your shopping list has some item");
        //}
        System.out.println( list.isEmpty() ? "Your shopping list does not have any item" : "Your shopping list has some item"  );
    }

    public static void shoppingListItems (ArrayList <String> list) {
        System.out.println(list.size() + " items in your shopping list: ");
        for ( String eachItem : list) {
            System.out.println("\t" + eachItem);
        }
    }

    public static void itemAvailability (ArrayList <String> list, String itemName){

        // TODO: Homework - > handle the case sensitiveness
        if (list.contains(itemName)) {
            System.out.println(itemName + " is available in your list!");
        } else {
            System.out.println(itemName + " is not available in your list!");
        }

    }


    public static ArrayList <String> removeItem (ArrayList <String> list, String item) { // "14"

        // is digit or not
        // For class - always a single digit
        if (Character.isDigit( item.charAt(0) )) {
            // TODO: Homework -> handle it the number is outside of the range
            list.remove( Integer.parseInt(item) - 1 );
        } else {
            list.remove(item);
        }

        return list;

    }


}
