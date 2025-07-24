package my_util;

public class StringUtil {

    /**
     * This method fixes the format
     * @param str is the given String
     * @return fixed format - 1st letter upper and rest lower case
     */
    public static String fixFormat (String str) {
        String fixed = "";

        fixed = (""+str.charAt(0)).toUpperCase() + str.substring(1).toLowerCase();

        return fixed;
    }


    /**
     * This method fixes the format
     * @param str is the given String
     * @return fixed format - 1st letter upper and rest lower case for each word
     */
    public static String fixFormatForFullName (String str) {
        String [] words = str.split(" ");
        String fullName = "";

        for ( String each : words) {
            fullName += (""+each.charAt(0)).toUpperCase() + each.substring(1).toLowerCase() + " ";
        }
        return fullName.trim();
    }

    /**
     * This method counts the letter appearance in word
     * @param word is teh given String
     * @param letter is the given char
     * @return count of char in String
     */
    public static int frequencyOfChar (String word, char letter)  {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter ) {
                count++;
            }
        }
        return count;
    }


    /**
     * This method returns the single characters of each in the String
     * @param str is the given word
     * @return the single characters of each
     */
    public static String uniqueChars (String str) {
        String unique = "";
        char []  strArr = str.toCharArray();

        // foreach ---  >we can only use with data structures
        for ( char each: strArr){ // [l, o, o, p, c, a, m, p ]

            if (!unique.contains( each+"" )) {
                unique += each;  // lopcam
            }
        }
        return unique;
    }

    /**
     * This method reverses the given string
     * @param str is the given string
     * @return the reversed version
     */
    public static String reverse (String str){

        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }


    // TODO: add a reusable method for duplicateLetters (String Str)
}
