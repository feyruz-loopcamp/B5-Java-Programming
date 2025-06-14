package day18_loops;
/*
    Characters in String
        Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
 */
public class CharactersInString {
    public static void main(String[] args) {

        String word = "java";
        //             0123
        // .length()   4

        for (int i = 0; i < word.length(); i++) {
            int asciiNum = word.charAt(i);

            System.out.println( asciiNum );
            //System.out.println( (int)word.charAt(i) ); // another way of getting int value
            //System.out.println( 0 + word.charAt(i) ); // another way of getting int value
        }

    }
}

// char + int  -- >  int -- > char < int
// byte + int --- >  int -- > byte < int