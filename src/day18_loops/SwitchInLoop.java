package day18_loops;

public class SwitchInLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {

            if (i == 0) {
                System.out.println("Zero");
            } else if (i == 1) {
                System.out.println("One");
            } else if (i == 2){
                System.out.println("Two");
            } else if (i == 3) {
                System.out.println("Three");
            } else if (i == 4){
                System.out.println("Four");
            } else {
                System.out.println("Five");
            }

        }

        System.out.println("-----------");

        for (int i = 0; i <= 5; i++) {

            switch (i){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                default:
                    System.out.println("Five");

            }

        }

    }
}
