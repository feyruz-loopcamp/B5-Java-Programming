package day20_nested_loops;
/*
    String -- > "apple"

    Output: p

    - Find duplicate characters (the character that is in the word more than 1 time)
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String word = "appllle";
        String singleTimeCheckLetters = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;

            char outLetter = word.charAt(i);

            if (singleTimeCheckLetters.contains("" + outLetter)){
                continue;
            }


            for (int j = 0; j < word.length(); j++) {

                char inLetter = word.charAt(j);

                if (outLetter == inLetter){
                    count++;
                }

            }


            if (count > 1) {
                System.out.println(outLetter);
            }

            if (!singleTimeCheckLetters.contains("" + outLetter)){
                singleTimeCheckLetters += outLetter;
            }

        }


    }
}


// TODO: HOMEWORK -- Find the UNIQUE characters (happens in the word only 1 time )