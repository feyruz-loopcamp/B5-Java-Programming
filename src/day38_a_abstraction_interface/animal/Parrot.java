package day38_a_abstraction_interface.animal;

import day38_a_abstraction_interface.language.Language;

// CONCRETE CLASS
public class Parrot extends Birds implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Birds use their beaks!");
    }

    @Override
    public void useWings() {
        System.out.println("Parrots have wings");
    }

    @Override
    public void fly() {
        System.out.println("Parrots use their wings to fly");
    }

    @Override
    public void sayHi() {
        System.out.println("Hi Hi");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye Bye");
    }
}
