package day40_exception.throws_keyword;

public class UsingThrows {
    public static void main(String[] args) {


        wait1(1000);

        //wait2(2000);

        try {
            wait2(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public static void wait1 (int millSec){

        // Option 1: handle compile time exception
        try {
            Thread.sleep( millSec );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static void wait2(int millSec) throws InterruptedException {
        // Option 2: ByPassing/Ignoring - declare it on method signature
        Thread.sleep( millSec );
    }
}
