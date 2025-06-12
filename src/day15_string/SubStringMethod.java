package day15_string;

public class SubStringMethod {
    public static void main(String[] args) {

        String day = "Saturday";
        //            01234567

        // #15 - "".substring(); --- > take the portion of the string and returns string

        System.out.println( day.substring(0)); // give me the portion starting from index 0 until end
        System.out.println( day.substring(1)); // give me the portion starting from index 1 until end
        System.out.println( day.substring(2)); // give me the portion starting from index 2 until end
        System.out.println( day.substring(3)); // give me the portion starting from index 3 until end


        System.out.println("Sat" + day.substring(3)); // "Sat" + "urday"

        System.out.println("----------------------------------");
        System.out.println( day.substring(0, 0)); // give me the portion starting from index 0 until 0 -- > ""
        System.out.println( day.substring(0, 1)); // give me the portion starting from index 0 until 1 -- > "S"
        System.out.println( day.substring(0, 2));
        System.out.println( day.substring(0, 3));


        System.out.println();
        System.out.println(day.substring(5, 7));
        //System.out.println(day.substring(5, 19)); // StringIndexOutOfBoundsException
        System.out.println(day.substring(5, day.length())); // No need to do this if I take it until end. Do following
        System.out.println(day.substring(5));

    }
}
