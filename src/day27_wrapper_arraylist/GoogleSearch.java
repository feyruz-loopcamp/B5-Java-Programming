package day27_wrapper_arraylist;
/*
    Toyota  - About 1,060,000,000 results (0.40 seconds)
    Honda   - About 1,170,000,000 results (0.38 seconds)
    Tesla   - About 766,000,000 results (0.29 seconds)

    Task: go to google search and check that the seconds result comes back is lower than 0.5
 */
public class GoogleSearch {

    public static void main(String[] args) {

        String searchResultInfo = "About 1,170,000,000 results (0.38 seconds)";
        // 0.40

        // Another option to get the time portion.
        String [] arr = searchResultInfo.split(" ");  // ["About", "1,170,000,000", "results", "(0.38", "seconds)"]
        arr[arr.length-2].substring(1);


        String secondsOnUi = searchResultInfo.substring( searchResultInfo.indexOf("(") + 1,  searchResultInfo.lastIndexOf(" "));
        // convert String into double (Primitive) - parse() method
        double time1 = Double.parseDouble(secondsOnUi); // // 1- converting String into "double"
        // double time11 = Double.valueOf(secondsOnUi); // 1-converting String to Double -- > 2-Double into double. (Unboxing))

        // convert String into Double (wrapper class - Non-Primitive / Object type) - valueOf()
        Double time2 = Double.valueOf(secondsOnUi);

        Double time3 = time1; // "double" -- > "Double" ----- > AUTOBOXING
        double time4 = time2; // "Double" -- > "double" ----- > UNBOXING

        if(time1 < 0.5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


    }

}
