package day37_a_abstraction.book;

import day35_inheritance.super_inheritance.B;

public class Runner {
    public static void main(String[] args) {

        // CanNOT make the object of INTERFACES
        // Prints p = new Prints();


        Book obj = new Book();
        obj.read();
        obj.write();


        System.out.println();
        System.out.println(Prints.NAME);
        System.out.println(Book.NAME);

        System.out.println();
        Prints.sayBye();
        //Book.sayBye(); // // static method in interface is not inherited to Child

        System.out.println();
        //Prints.sayHi();
        //Book.sayHi();
        obj.sayHi();
    }
}
