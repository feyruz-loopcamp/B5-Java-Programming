package day19_nested_loops;

public class Branching {
    public static void main(String[] args) {

        //break;    -- > in the loop, once the execution reaches the break; statement, it immediately ENDS the LOOP

        //continue; -- > in the loop, once the execution reaches the continue; statement, it ignores anything in the loop after continue; statement and the loop continues with the next iteration


        System.out.println("This is Traditional For Loop / fori loop without break and continue:");

        for (int i = 1; i <= 10 ; i++) {

            System.out.print(i + " ");

        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("This is Traditional For Loop / fori loop with break");

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
            break;
        }

        System.out.println();
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }


        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("This is Traditional For Loop / fori loop with continue");

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
            continue;
            //System.out.println("Hi!");
        }

        System.out.println();
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
            if (i == 5){
                continue;
            }
            System.out.println("Hi");
        }
        System.out.println("----------------------------------------------------");

        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }



    }
}
