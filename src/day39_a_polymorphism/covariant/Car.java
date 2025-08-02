package day39_a_polymorphism.covariant;

import day37_a_abstraction.gym.Running;
import day38_b_polymorphism.Animal;

public class Car {
}

class BMW extends Car {}

class Tesla extends Car {}

class Toyota extends Car {
}

class Camry extends Toyota {}


class Dealership {

    public static void lease (Car car){
        System.out.println("Leasing a car: " + car.getClass().getName());
    }


    public static Car getCar (int i){
        if (i == 1) {
            return new Toyota();
        } else if ( i == 2) {
            return new BMW();
        } else if (i == 3 ) {
            return new Toyota();
        } else if (i == 4){
            return new Camry();
        } else {
            return new Car();
        }
    }

    public Car checkCar (int i){
        if (i == 1) {
            return new Toyota();
        } else if ( i == 2) {
            return new BMW();
        } else if (i == 3 ) {
            return new Toyota();
        } else if (i == 4){
            return new Camry();
        } else {
            return new Car();
        }
    }


}


class LocationA extends Dealership {
    @Override
    public BMW checkCar (int i){
        if (i == 1) {
            return null;
        } else if ( i == 2) {
            return new BMW();
        } else if (i == 3 ) {
            return null;
        } else if (i == 4){
            return null;
        } else {
            return null;
        }
    }

}


class Runner {
    public static void main(String[] args) {

        Car car = new Car();
        //Car car2 = new BMW();  // BMW bmw = new BMW();  --- > Car car2 = bmw; // UP-CASTING - IMPLICIT CAST (AUTOMATICALLY)

        System.out.println("--------------------------------------");
        Dealership.lease(car);

        Tesla tesla = new Tesla();
        Dealership.lease(tesla);

        Dealership.lease(new BMW());
        Dealership.lease(new Camry());
        Dealership.lease(new Toyota());

        System.out.println("--------------------------------------");
        System.out.println(Dealership.getCar(1));
        System.out.println(Dealership.getCar(2));
        Car car01 = Dealership.getCar(3);  // (Car)new Toyota();
        //Camry car02 = Dealership.getCar(3);  // (Car)new Toyota();
        Camry car02 = (Camry)Dealership.getCar(3);  // (Car)new Toyota();


    }
}
