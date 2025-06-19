package day19_nested_loops;

public class NestedLoopExample2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println("A" + i);


            for (int j = 1; j < i; j++) {
                System.out.println("B" + j);
            }
        }

    }
}
