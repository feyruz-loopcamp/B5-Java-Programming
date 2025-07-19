package day33_a_static;

import java.util.Arrays;

// Runner Class - execution
public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy store1 = new BestBuy("123 Main St, Fairfax, VA");
        BestBuy store2 = new BestBuy("456 Test Dr, Rockville, MD");
        BestBuy store3 = new BestBuy("789 Sample CtSan Joe, CA");


        // Since all object will share the Same info, it is NOT a GOOD PRACTICE to use object reference to call static member of the class. You can still call it with object reference
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        System.out.println();
        // All the static members of the calls is better to be called by className
        System.out.println(BestBuy.headquarter);

        System.out.println("-----------------------------");
        store1.location = "9821 New St, Chantilly, VA";

        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);



        System.out.println("-----------------------------");
        store1.headquarter = "111 Java Ave S, California";
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);


        System.out.println("-----------------------------");
        store2.headquarter = "555 Java Ave S, California";
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);


        System.out.println("-----------------------------");
        BestBuy.headquarter = "222 API Ave S, California";
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);


        System.out.println("-----------------------------");
        // INSTANCE members canNOT be reach by class name - we need object
        //BestBuy.openStore();
        //BestBuy.location = "12 test";

        store1.openStore();
        store2.openStore();
        store3.openStore();


        System.out.println("-----------------------------");
        // STATIC member CAN be reach by the object reference but dont, use class
        store1.specialDaySale();
        //store2.specialDaySale();
        //store3.specialDaySale();
        BestBuy.specialDaySale();



    }
}
