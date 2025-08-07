package day40_exception.recap;

public class FourthTry2 {
    public static void main(String[] args) throws InterruptedException {
        // COMPILE-TIME EXCEPTION: must be caught or declared to be thrown
        // You have two options to do:
        // Option 1: You handle with try catch -- caught it.
        // Option 2: ByPassing/Ignoring - declare it on method signature
        Thread.sleep(1000);
    }
}
