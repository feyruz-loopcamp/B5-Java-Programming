package day40_exception.recap;

public class Fourth {
    public static void main(String[] args) {
        // COMPILE-TIME EXCEPTION: must be caught or declared to be thrown
        // You have two options to do:
        // Option 1: You handle with try catch -- caught it.
        try {
            Thread.sleep(-1000); // InterruptedException
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }


        System.out.println("END....");
    }
}
