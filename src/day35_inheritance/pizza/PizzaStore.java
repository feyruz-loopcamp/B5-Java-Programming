package day35_inheritance.pizza;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Hello", -10);
        System.out.println(pizza1);

        System.out.println("-----------------------");
        Pizza pizza2 = new Pizza("Large", 5);
        System.out.println(pizza2);

    }
}
