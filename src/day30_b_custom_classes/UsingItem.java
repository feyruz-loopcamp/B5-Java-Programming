package day30_b_custom_classes;

// Runner Class
public class UsingItem {
    public static void main(String[] args) {

        Item item1 = new Item();
        //name = "Banan";
        item1.name= "Banana";
        item1.price = 2.99;

        System.out.println(item1);

        System.out.println("-------------");
        Item item2 = new Item();
        System.out.println(item2);
        //System.out.println(item2.toString()); // SAME THING but not preferred


    }
}
