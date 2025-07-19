package day33_a_static;
// Runner Class - main method
public class AppleStore {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Iphone 16 Pro", 1099.00);
        System.out.println(iphone1);


        Iphone iphone2 = new Iphone("Iphone 16 ProMAX", 1299.00);
        System.out.println(iphone2);


        System.out.println();
        System.out.println(iphone1.brand);
        System.out.println(iphone1.os);
        System.out.println(iphone1.appleDay);

        System.out.println();
        System.out.println(iphone2.brand);
        System.out.println(iphone2.os);
        System.out.println(iphone2.appleDay);


        System.out.println("----------------");
        iphone1.brand = "Apple INC";
        iphone2.os = "IOS";

        System.out.println();
        System.out.println(iphone1.brand);
        System.out.println(iphone1.os);
        System.out.println(iphone1.appleDay);

        System.out.println();
        System.out.println(iphone2.brand);
        System.out.println(iphone2.os);
        System.out.println(iphone2.appleDay);


        System.out.println();
        System.out.println("----------------");
        System.out.println(Iphone.brand);
        System.out.println(Iphone.os);
        System.out.println(Iphone.appleDay);


    }
}
