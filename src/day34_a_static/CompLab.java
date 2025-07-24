package day34_a_static;
// Runner Class
public class CompLab {
    public static void main(String[] args) {
        Computer comp1 = new Computer(999.99, "Dell", "Silver");
        System.out.println(comp1);

        Computer comp2 = new Computer(1299.99, "HP", "Black");
        System.out.println(comp2);

        System.out.println("------------------------------------------------------");

        // use object to reach instance members of class
        System.out.println(comp1.price);
        System.out.println(comp2.color);


        // use Class Name to reach static members of class
        // System.out.println(comp1.hasScreen); //NOT RECOMMENDED
        System.out.println( Computer.hasBatter );


        System.out.println("------------------------------------------------------");
        comp1.price = 699.99;
        System.out.println( comp1.price ); // 699.99
        System.out.println( comp2.price ); // 1299.99

        System.out.println("------------------------------------------------------");
        comp1.hasScreen = false;
        System.out.println(comp1.hasScreen); // false - not good option to call with object
        System.out.println(comp2.hasScreen); // false - not good option to call with object
        System.out.println(Computer.hasScreen);

    }
}
