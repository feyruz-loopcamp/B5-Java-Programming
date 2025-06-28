package day24_methods;
/*
    Unlock car
    open the door
    sit in the car + close the door
    put the seatbelt on
    start the engine
    put the gear into drive
 */

public class Car {

    public static void unlock (){
        System.out.println("Unlocking the car.");
    }

    public static void openDoor () {
        System.out.println("Opening the door");
    }

    public static void getInCar () {
        System.out.println("Sitting in the car.");
        System.out.println("Closing the door");
    }

    public static void getReady () {
        System.out.println("Putting seat belt on.");
        System.out.println("CHeck the mirrors.");
        System.out.println("Put lipstick on");
        System.out.println("Turn the music on");
        System.out.println("Lower the window down");
        System.out.println("Put the destination in navigation");
    }

    public static void startEngine () {
        System.out.println("Starting engine");
    }

    public static void drive () {
        System.out.println("Put the gear on D - drive");
        System.out.println("And Drive");
    }


    public static void allStepsToDriveCar () {
        unlock();
        openDoor();
        getInCar();
        startEngine();
        getReady();
        drive();
    }


    public static void allStepsToDriveCarInRush () {
        unlock();
        openDoor();
        getInCar();
        drive();
    }




    public static void main(String[] args) {
        //Car.unlock(); // you can call the static method with the class name. Since it is in the same class/file, we can call it directly.
        unlock();
        openDoor();

        getInCar();

        startEngine();

        getReady();

        drive();

        System.out.println("--------------------");

        allStepsToDriveCar();

        System.out.println("--------------------");

        allStepsToDriveCarInRush();
    }

}
