package day19_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        //int num = 4; // 1 - 10

        // OUTER LOOP - 10x
        for (int num = 1; num <= 6 ; num++) {

            // INNER LOOP - 10X
            for(int i = 1; i <= 10; i++){

                System.out.println(num + " x " + i + " = " + num * i);

            }
            System.out.println();

        }

    }
}
