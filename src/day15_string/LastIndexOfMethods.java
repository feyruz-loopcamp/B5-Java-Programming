package day15_string;

public class LastIndexOfMethods {
    public static void main(String[] args) {

        String str = "javacava";
        //            01234567


        System.out.println( str.indexOf( 'a')); //1

        System.out.println( str.lastIndexOf( 'a')); //3
        System.out.println( str.lastIndexOf( "va")); // 2
        System.out.println( str.lastIndexOf( "av")); // 1 - 3

        System.out.println("---------------------------");
        System.out.println(str.lastIndexOf( 'a', 20 )); // this will work becuase it starts from end and goes to beginning checking everything
        System.out.println(str.lastIndexOf( 'a', str.length()-1 ));

        System.out.println(str.lastIndexOf("ava", 100));
        System.out.println(str.lastIndexOf("ava", str.length() - 1));

        // find the 2nd ava from the end
        //System.out.println( str.indexOf("ava")); // if you have more than 2 "ava" this will not work
        System.out.println(str.lastIndexOf("ava", str.lastIndexOf("ava") - 1));




    }
}
