package day32_custom_classes;
// Runner Class
public class Store {
    public static void main(String[] args) {
        Food food1 = new Food("Apple");
        System.out.println(food1);

        System.out.println("------------------------");
        Food food2 = new Food("Banana", 4);
        System.out.println(food2);


        System.out.println("------------------------");
        Food food3 = new Food("Orange", 4, 1.99);
        System.out.println(food3);
    }
}
