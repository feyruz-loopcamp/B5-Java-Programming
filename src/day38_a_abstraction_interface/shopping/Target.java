package day38_a_abstraction_interface.shopping;

public class Target extends Shopping {
    @Override
    public void buyItem() {
        System.out.println("Buying items from Taget.");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning items to Target.");
    }
}
