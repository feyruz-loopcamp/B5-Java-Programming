package day18_loops;

public class CountJava2 {
    public static void main(String[] args) {

        String str = "java is a nice programming language and java required more practice. java is great coding language.";
        int countJava = 0;


        while (str.contains("java")) {

            str = str.replaceFirst("java", "*");
            //System.out.println(str);
            countJava++;

        }

        System.out.println("You have " + countJava + " \'java\' in the String.");


    }
}
