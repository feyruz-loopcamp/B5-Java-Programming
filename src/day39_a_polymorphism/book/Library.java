package day39_a_polymorphism.book;

import day38_a_abstraction_interface.animal.Flyable;
import day38_b_polymorphism.Animal;
import day39_a_polymorphism.cloth.Clothes;

public class Library {
    public static void main(String[] args) {
        // All possible references for JavaBook: JavaBook, EBook, Book, Downloadable
        JavaBook b1 = new JavaBook();
        // access to instance var
        b1.name = "Java Programming";
        b1.storageSize = 124;
        b1.isGreatBook = true;

        // access to instance methods
        b1.read();
        b1.open();
        b1.download();

        System.out.println("--------------------------");
        EBook b2 = new JavaBook();
        // access to instance var
        b2.name = "Java Programming";
        b2.storageSize = 124;
        //b2.isGreatBook = true; // Reference side has no access
        // Q: Lets say in this line you actually need to reach the "isGreatBook" member for 1 time only
        // A: We can quickly cast it to be able to reach that member
        JavaBook b22 = ((JavaBook)b2);
        b22.isGreatBook = true;
        ((JavaBook)b2).isGreatBook = true; // DOWN-CASTING


        // access to instance methods
        b2.read();
        b2.open();
        //b2.download(); // Reference side has no access
        ((JavaBook)b2).download();
        b22.download();


        System.out.println("--------------------------");
        Book b3 = new JavaBook();
        // access to instance var
        b3.name = "Java Programming";
        //b3.storageSize = 124; // Reference side has no access
        //b3.isGreatBook = true; // Reference side has no access

        // access to instance methods
        b3.read();
        //b3.open(); // Reference side has no access
        ((EBook)b3).open(); // DOWN-CAST
        ((JavaBook)b3).open(); // DOWN-CAST

        //b3.download(); // Reference side has no access
        //((EBook)b3).download();
        ((JavaBook)b3).download(); // DOWN-CAST
        //((Flyable)b3).fly(); // ClassCastException

        System.out.println("--------------------------");
        Downloadable b4 = new JavaBook();
        // access to instance var
        //b4.name = "Java Programming"; // Reference side has no access
        //b4.storageSize = 124; // Reference side has no access
        //b4.isGreatBook = true; // Reference side has no access

        // access to instance methods
        //b4.read(); // Reference side has no access
        //b4.open(); // Reference side has no access
        b4.download();


        System.out.println("******************************");
        System.out.println( b1 instanceof JavaBook );
        System.out.println( b1 instanceof EBook );
        System.out.println( b1 instanceof Book );
        System.out.println( b1 instanceof Downloadable );
        System.out.println();
        System.out.println(b2 instanceof JavaBook);
        System.out.println(b2 instanceof EBook);
        System.out.println(b2 instanceof Book);
        System.out.println(b2 instanceof Downloadable);
        //System.out.println(b2 instanceof Animal);

    }
}
