package day37_a_abstraction.car;
// Non-Abstract -- > CONCRETE CLASS
public class Tesla extends ElectricCar {
    @Override
    public void start() {
        System.out.println("Starting with keychain");
    }

    @Override
    public void charge() {
        System.out.println("Charging with Tesla Electric");
    }
}
