package day32_custom_classes;
// Runner Class - main method starting execution
public class Jobs {
    public static void main(String[] args) {
        Offer offer1 = new Offer("Tesla", "Texas");
        System.out.println(offer1);
        offer1.salary = 100_000.00;
        System.out.println(offer1);

        System.out.println();
        Offer offer2 = new Offer("Apple", "California", 120_000.00);
        System.out.println(offer2);

        System.out.println();
        Offer offer3 = new Offer( "Amazon", "Washington DC", 130_000.00, true, 10);
        System.out.println(offer3);
    }
}
