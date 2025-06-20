package day20_nested_loops;
/*

    String: apple

    count how many times each letter is in the String

    a - 1
    p - 2
    l - 1
    e - 1

 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String word = "apple";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {                // apple
            int count = 0;
            char outerEachLetter = word.charAt(i);
            //String outerEachLetter = "" + word.charAt(i);

            if (unique.contains("" + outerEachLetter)){
                continue;
            }


            for (int j = 0; j < word.length(); j++) {            // apple
                char innerEachLetter = word.charAt(j);
                //String innerEachLetter = "" + word.charAt(i);

                if (outerEachLetter == innerEachLetter) {
                    count++;
                }
            }

            System.out.println(outerEachLetter + " - " + count );
            if (!unique.contains("" + outerEachLetter)){
                unique += outerEachLetter; // ap
            }

        }


    }
}
