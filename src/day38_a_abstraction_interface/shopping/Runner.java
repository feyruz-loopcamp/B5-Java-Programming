package day38_a_abstraction_interface.shopping;

import javax.management.ObjectName;

public class Runner {
    public static void main(String[] args) {
        //Abstract class cannot have objects
        //Shopping s = new Shopping();

        // Interface cannot have objects
        //Shipping sh = new Shipping();

        Target t = new Target();
        t.buyItem();
        t.returnItem();
        System.out.println(t.price);
        //Target.COUNTRY; // NO RELATION

        //Abstract class cannot have objects
        //OnlineShopping oS = new OnlineShopping();

        System.out.println();
        Amazon a = new Amazon();
        System.out.println(a.price);
        a.buyItem();
        a.returnItem();
        a.deliveryEstimate();
        a.shippingCost(true);

        System.out.println(Amazon.COUNTRY);
        System.out.println(OnlineShopping.COUNTRY);
        System.out.println(Shipping.COUNTRY);


    }
}
