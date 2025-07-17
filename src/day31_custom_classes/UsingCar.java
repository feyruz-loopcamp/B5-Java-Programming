package day31_custom_classes;

public class UsingCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
        //System.out.println(car1.toString()); // No need for toString()

        // Intance variables belongs to objects. Cannot call by Class name
        // Car.model = "Mazda";
        // System.out.println(Car.model);
        // System.out.println(Integer.MAX_VALUE); // MAX_VALUE is static not instance variable

        car1.model = "Tesla";
        car1.year = 2025;
        car1.color = "Pink";
        car1.fuelLevel = 50.0;

        System.out.println("-------------------");
        System.out.println(car1);


        System.out.println("-------------------");
        // System.out.println(car1.drive());
        car1.drive();

        System.out.println("-------------------");
        System.out.println(car1.fuelLevel); // 50.0
        car1.fillTank(); //
        System.out.println(car1.fuelLevel); // 100.0


        System.out.println("-------------------");
        System.out.println( car1.isLow() );

        System.out.println("-------------------");
        Car car2 = new Car();
        car2.fuelLevel = 10;
        System.out.println(car2);

        System.out.println("-------------------");
        System.out.println( car2.isLow() );

    }
}
