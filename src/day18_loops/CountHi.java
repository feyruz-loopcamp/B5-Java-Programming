package day18_loops;

public class CountHi {
    public static void main(String[] args) {


        // hi
        String str = "hiasdfshisdfsdshisdfsvhisdvshisvhihi";
        int countHi = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            String every2Char = "" + str.charAt(i) + str.charAt(i+1); // "as" | "sd" | "df" | "fs" .......
            //String every2Char = str.substring(i, i+2); // another way of getting 2 chars on every cycle

            //System.out.println(every2Char);

            if(every2Char.equals("hi")){
                countHi++;
            }

        }

        System.out.println("There are " + countHi + " \'hi\' in String");


    }
}
