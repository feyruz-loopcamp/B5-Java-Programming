package day20_nested_loops;

public class ContinueInNested {
    public static void main(String[] args) {

        // OUTER LOOP
        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                continue; // skips everything in OUTER LOOP after continue and goes to NEXT cycle/iterations of OUTER LOOP
            }

            System.out.println("i: " + i);


            // INNER LOOP
            for (int j = 0; j < 3; j++) {

                if (j == 1) {
                    continue; // skips everything in INNER LOOP after continue and goes to NEXT cycle/iterations of INNER LOOP
                }

                System.out.println("j: " + j);

            }

        }

    }
}
