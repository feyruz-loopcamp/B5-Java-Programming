package day35_inheritance.book;
// Child Class
public class EBook extends Book {
    double size;
    int pages;

    public void read () {
        System.out.println("Reading " + title + " with " + pages + " pages.");
    }
}
