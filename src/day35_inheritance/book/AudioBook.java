package day35_inheritance.book;
// Child Class
public class AudioBook extends Book {
    double duration;
    String narrator;

    public void listen (){
        System.out.println("Listening to " + title + " narrator by " + narrator);
    }
}
