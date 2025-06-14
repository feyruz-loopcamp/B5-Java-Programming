package day18_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String str = "loopcamp$$^";
        // index:     01234567

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        //System.out.println(str.charAt(8)); // StringIndexOutOfBoundsException

        System.out.println("---");
        // for loop is also called: fori loop -or- traditional for loop
        for (int i = 0; i < str.length(); i++) {  // for (int i = 0; i <= str.length()-1; i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("---");
        // Q: How to get each char starting from the end
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }

        System.out.println("---");
        // Q: can you reverse the String
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //System.out.println(str.charAt(i));
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
