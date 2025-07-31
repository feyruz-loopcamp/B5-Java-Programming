package day37_a_abstraction.book;

public class Book implements Prints {
    @Override
    public void read() {
        System.out.println("Reading " + NAME);
    }

    @Override
    public void write() {
        System.out.println("Writing " + NAME);
    }
}
