package day28_arraylist;
/*
    HTML Generator

    Given a String in the following format take the number part of the generator the html tags.
    Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

    Ex:
        Input:
            div^2
        Output:
            <div></div><div></div>
    Ex:
        Input:
            li^3
        Output:
            <li></li><li></li><li></li>
 */
public class HtmlGenerator {
    public static void main(String[] args) {
        String str = "div^2";
        System.out.println( htmlGenerator(str) );
        System.out.println( htmlGenerator("li^3") );

    }


    public static String htmlGenerator (String str) {
        // NOTE: below is the code to do with .split() method instead of .substring() method.
        //str = str.replace("^", "*");
        //String [] strArr = str.split("*");  // Regex  - regular experision
        //String [] strArr = str.split("*");  // ["div", "2"]

        String result = "";

        // div^2
        //<></>
        //<div></div>
        //<div></div><div></div>

        int indexOfDivider =  str.indexOf("^");
        int cycle = Integer.parseInt(str.substring(indexOfDivider + 1));  // 2 --- > str.substring(indexOfDivider + 1) -- > "2" -- > 2
        String text = str.substring(0, indexOfDivider);  // div

        for (int i = 1; i <= cycle; i++) {
             result += "<" + text + "></" + text + ">";
        }

        return result;
    }
}
