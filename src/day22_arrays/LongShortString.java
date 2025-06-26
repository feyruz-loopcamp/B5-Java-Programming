package day22_arrays;

public class LongShortString {
    public static void main(String[] args) {
        String [] words = {"java", "softskills", "selenium", "mentors", "quiz"};
        System.out.println("Size of words: " + words.length);

        String longest = words[0];  // "java"
        String shortest = words[0]; // "java"


        for ( String eachElem : words){ // ["java", "softskills", "selenium", "mentors", "quiz"]

            if (eachElem.length() > longest.length()) {
                longest = eachElem;
            }

            if (eachElem.length() < shortest.length()){
                shortest = eachElem;
            }

        }

        System.out.println("Longest word: " + longest);
        System.out.println("Shortest word: " + shortest);



    }
}
