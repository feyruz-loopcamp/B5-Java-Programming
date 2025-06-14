package day18_loops;
/*
    Count upper, lower, and numbers
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4

        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
 */
public class CountChars {
    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4dfsf235#%#@P";

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numbersCount = 0;
        int specialCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i); // 2 | j

            if (65 <=  eachChar && eachChar <= 90){
                upperCaseCount++; // upperCaseCount = upperCaseCount + 1;
            } else if (97 <=  eachChar && eachChar <= 122) {
                lowerCaseCount++;
            } else if (48 <=  eachChar && eachChar <= 57) {
                numbersCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Uppercase letter count: " + upperCaseCount);
        System.out.println("Lowercase letter count: " + lowerCaseCount);
        System.out.println("Number letter count: " + numbersCount);
        System.out.println("Special letter count: " + specialCount);


    }
}
