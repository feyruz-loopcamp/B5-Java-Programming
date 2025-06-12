package day13_string;

public class SwitchExample {
    public static void main(String[] args) {
        int num = 5;

        switch (num) { //Allowed 5 datatypes: String, int, char, short, byte

            case 1:
                System.out.println("Before multiplication arithmetic operator applied your num: " + num);
                num *= 10; // re assigning the result of the arithmetic operator to num variable
                System.out.println("After multiplication arithmetic operator applied your num: " + num);
                break;

            case 2:
                System.out.println("Before modules operator applied to your num: " + num);

                if (num % 2 == 0){
                    System.out.println("Your num is EVEN number");
                } else {
                    System.out.println("Your num is ODD number");
                }
                break;

        }

        System.out.println("--------------------------------------------------------------------------");

        int num2 = 7;

        if (num2 < 4) {
            System.out.println("You number is less than 4");
        } else {

            switch (num2){
                case 4:
                case 5, 6:
                    System.out.println("Your number is between 4 and 6");
                    break;
                case 7:
                    System.out.println("Your number is 7");
                    break;
                default:
                    System.out.println("Your number is above 7");
            }

        }


    }
}
