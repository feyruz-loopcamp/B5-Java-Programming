package day16_loops;

public class ReplaceMethod {
    public static void main(String[] args) {
        String str = "java is a fun coding language";

        System.out.println("Before .replace(): "  + str);
        str = str.replace('a', 'e'); // find all 'a' and replace with 'e'
        System.out.println("After .replace(): " + str);
        str = str.replace('k', 'a'); // if 'k' is not in str, nothing is replaced
        System.out.println("After .replace(): " + str);
        str = str.replace('e', 'u');
        System.out.println("After .replace(): " + str);

        System.out.println("------------------------------------------");

        String sentence = "Today is Wednesday. Wednesday is a fun day because on Wednesday we have Java classes.";
        System.out.println("Before .replace(): "  + sentence);
        sentence = sentence.replace("wednesday", "thursday"); // find all "wednesday" and replace with "thursday"
        System.out.println("After .replace(): " + sentence);
        sentence = sentence.replace("Wednesday", "Thursday"); // find all "Wednesday" and replace with "Thursday"
        System.out.println("After .replace(): " + sentence);


        System.out.println("------------------------------------------");
        String sentence2 = "Today is Wednesday. Wednesday is a fun day because on Wednesday we have Java classes.";
        System.out.println("Before .replaceFirst(): "  + sentence2);
        sentence2 = sentence2.replaceFirst("Wednesday", "Thursday"); // find FIRST "Wednesday" and replace with "Thursday"
        System.out.println("After .replaceFirst(): "  + sentence2);


    }
}
