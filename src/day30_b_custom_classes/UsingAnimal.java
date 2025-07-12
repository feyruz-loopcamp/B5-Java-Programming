package day30_b_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

// Runner Class
public class UsingAnimal {
    public static void main(String[] args) {
        // Object Reference;
        // Animal animal1;
        // Object Itself;
        // new Animal();

        // Declared Object Reference and assigned actual object
        Animal animal1 = new Animal();

        System.out.println(animal1.species);
        System.out.println(animal1.population);

        System.out.println("------------------");
        System.out.println( new Animal().species); // Completely new object which I do not reference to use later
        System.out.println( new Animal().population);

        System.out.println("------------------");
        animal1.species = "Bird";
        animal1.population = 100_000_000;


        System.out.println(animal1.species);
        System.out.println(animal1.population);


        System.out.println("------------------");
        //Object Reference      = Object
        ArrayList <String> list = new ArrayList<>(Arrays.asList("Java", "Jira"));
        System.out.println(list); // printing the object directly.


        System.out.println("------------------");
        System.out.println(animal1);
        // if you have not declared toString() method in your template class and you try to pring the object directly, you will get some memory location - > day30_b_custom_classes.Animal@8efb846


        System.out.println("------------------");
        // ONLY .toString() is in the way you do not need to use the reference to call method. You can use reference directly itlself
        System.out.println(animal1.toString());


        System.out.println("------------------");
        Animal animal2 = new Animal();
        System.out.println(animal2);



    }
}
