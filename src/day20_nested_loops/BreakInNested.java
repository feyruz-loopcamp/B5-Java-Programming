package day20_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

        //OUTER LOOP
        for (int i = 0; i < 5; i++) {

            System.out.println("i: " + i );
            if (i == 3){
                break; // since this break is in the OUTER LOOP it ends the OUTER LOOP
            }

            //INNER LOOP
            for (int j = 0; j < 3; j++) {

                System.out.println("j: " + j);
                break; // since this break is in the INNER LOOP it ends the INNER LOOP

            }

        }

        int k = 5;
        for (int i = 0; i < k; i++) {
            break;
        }

        System.out.println("END");

    }
}
