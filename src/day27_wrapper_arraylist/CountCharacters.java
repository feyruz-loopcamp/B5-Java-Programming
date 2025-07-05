package day27_wrapper_arraylist;
/*
    count how many:
        - Uppercase
        - Lowercase
        - digits
        - special characters
 */
public class CountCharacters {
    public static void main(String[] args) {

        String str = "lsvher3485VRS345tSVS4gss@#$%63SVW#$XC";

        int countUpper = 0;
        int countLower = 0;
        int countDigits = 0;
        int countSpecial = 0;

        char [] allLetters = str.toCharArray(); // ['l', 's', .......... 'C']

        for ( char eachElem: allLetters){
            /*
            if (65 <= eachElem && eachElem <= 90){
                countUpper++;
            } else if (97 <= eachElem && eachElem <= 122) {
                countLower++;
            } else if (48 <= eachElem && eachElem <= 57) {
                countDigits++;
            } else {
                countSpecial++;
            }
             */

            if (Character.isUpperCase(eachElem)){
                countUpper++;
            } else if (Character.isLowerCase(eachElem)) {
                countLower++;
            } else if (Character.isDigit(eachElem)) {
                countDigits++;
            } else {
                countSpecial++;
            }


        }


        System.out.println("Uppercase letter count: " + countUpper);
        System.out.println("Lowercase letter count: " + countLower);
        System.out.println("Digit letter count: " + countDigits);
        System.out.println("Special letter count: " + countSpecial);




    }
}
