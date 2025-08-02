package day39_b_exception;

public class SecondTry {
    public static void main(String[] args) {


        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException


            int [] nums = {1, 2, 3, 4};
            System.out.println(nums [8]); // ArrayIndexOutOfBoundsException

        } catch (RuntimeException e){
            System.out.println("Either NullPointerException or ArrayIndexOutOfBoundsException");
        }

        System.out.println("Finish LIne");

    }
}
