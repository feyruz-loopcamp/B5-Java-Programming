package day25_methods;
/*
    NAME    C.SCORE
    Tom     600
    Jerry   750
    James   800

    fair        - >     <600
    good        - >     >= 600  <=720
    exceptional - >     >720
 */

/*
    Write a code that return credit score based on your name
    Write a code to checks if it is good or not good score
 */
public class CreditScore {

    public static void main(String[] args) {

        int creditScoreForTom = getCreditScore("Tom");
        System.out.println(creditScoreForTom);

        System.out.println("-------------------------------");
        getCreditScore2("Tom");


        System.out.println("-------------------------------");
        String scoreLeverForTom = scoreLevel( creditScoreForTom );
        System.out.println(scoreLeverForTom);


        // scoreLevel( getCreditScore2("Tom") );

        String scoreLevelForAnyOneWith600 = scoreLevel(600);
        System.out.println(scoreLevelForAnyOneWith600);




    }


    // Write a code that return credit score based on your name
    public static int getCreditScore (String name){

        int creditScore = 0;
        if (name.equalsIgnoreCase("Tom")) {
            creditScore = 600;
        } else if (name.equalsIgnoreCase("Jerry")) {
            creditScore = 750;
        } else if (name.equalsIgnoreCase("James")) {
            creditScore = 800;
        } else {
            System.out.println("We do not have information about that input!");
            creditScore = -1;
        }

        return creditScore;
    }

    // Write a code that return credit score based on your name
    public static void getCreditScore2 (String name){

        if (name.equalsIgnoreCase("Tom")) {
            System.out.println(600);;
        } else if (name.equalsIgnoreCase("Jerry")) {
            System.out.println(750);;
        } else if (name.equalsIgnoreCase("James")) {
            System.out.println(800);;
        } else {
            System.out.println("We do not have information about that input!");
            System.out.println(-1);
        }

    }

    /*
    fair        - >     <600
    good        - >     >= 600  <=720
    exceptional - >     >720
     */
    // Write a code to checks if it is good or not good score
    public static String scoreLevel (int scoreToCheck) {
        String scoreLevel = "";
        if (scoreToCheck < 600) {
            scoreLevel = "fair";
        } else if (scoreToCheck >= 600 && scoreToCheck <= 720) {
            scoreLevel = "good";
        } else if (scoreToCheck > 720 && scoreToCheck <= 850) {
            scoreLevel = "exceptional";
        } else {
            scoreLevel = "Invalid input";
        }

        return scoreLevel;
    }

}
