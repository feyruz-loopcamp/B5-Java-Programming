package day39_a_polymorphism.cloth;

import javax.print.attribute.standard.OutputBin;

public class Store {
    public static void main(String[] args) {

        // All possible reference for new TShirt();: - > ITSELF, PARENT
        // 1.1 - ITSELF reference
        TShirt t1 = new TShirt();
        t1.wearClothes();

        // 1.2 - PARENT reference
        Clothes t2 = new TShirt();
        t2.wearClothes();

        // HasHood t3 = new TShirt(); // Since there is not relation, this is NOT VALID

        Object t4 = new TShirt();
        //t4.wearClothes();

        System.out.println("-------------------------------------------------");
        // All possible reference for new Jacket();: - > ITSELF, PARENT, INTERFACE
        // 2.1 - ITSELF reference
        Jacket j1 = new Jacket();
        j1.wearClothes();

        // 2.2 - PARENT reference
        Clothes j2 = new Jacket();
        j2.wearClothes();

        // 2.3 - INTERFACE reference
        HasHood j3 = new Jacket();
        //j3.wearClothes();
        j3.putOnHoody();

        //TShirt j4 = new Jacket(); // NOT VALID - No PARENT CHILD Relationship


        Object j5 = new Jacket();
        //j5.wearClothes();
        //j5.putOnHoody();



    }
}
