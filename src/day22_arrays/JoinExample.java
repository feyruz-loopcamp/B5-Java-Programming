package day22_arrays;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        String [] str = {"a", "b", "c"};
        System.out.println("Before join: " + Arrays.toString(str));


        System.out.println( String.join("-", str) ); // "a-b-c"
        System.out.println( String.join("<>", str) ); // "a<>b<>c"
        System.out.println( String.join("****", str) ); // "a<>b<>c"
        System.out.println( String.join("", str) ); // "a<>b<>c"

        System.out.println();
        String join1 = String.join("@", str);
        System.out.println(join1);
        join1 = join1.replaceAll("@", "");
        System.out.println(join1);


        System.out.println("Before join: " + Arrays.toString(str));


    }
}
