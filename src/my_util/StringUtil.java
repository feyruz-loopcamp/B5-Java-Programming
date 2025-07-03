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
}
