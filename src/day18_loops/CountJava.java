package day18_loops;

public class CountJava {
    public static void main(String[] args) {
        String str = "java is a nice programming language and java required more practice";
        //            0123456789
        int countJava = 0;

        for (int i = 0; i <= str.length()-4; i++) {

            //String eachCycle4letter = "" + str.charAt(i) + str.charAt(i+1) + str.charAt(i+2) + str.charAt(3);
            String eachCycle4letter = str.substring(i, i+4);

            //System.out.println(eachCycle4letter);

            if (eachCycle4letter.equals("java")){
                countJava++;
            }
        }

        System.out.println("You have " + countJava + " \'java\' in the String.");

    }
}
