package day38_a_abstraction_interface.language;

public class Translator {
    public static void main(String[] args) {
        // Cannot create object for Interface
        // Language l = new Language();

        French french = new French();
        french.sayHi();
        french.sayBye();

        System.out.println();
        Spanish spanish = new Spanish();
        spanish.sayHi();
        spanish.sayBye();
    }
}
