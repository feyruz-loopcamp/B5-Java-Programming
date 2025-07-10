package my_util;

import java.util.ArrayList;

public class ArrayListUtil {
    /**
     * This method check is given String is in ArrayList of String with ignoring case sensitiveness
     * @param arrList is the given Arraylist of String
     * @param element is the given String
     * @return if there is a match with ignoring case sensitiveness
     */
    public static boolean containsIgnoreCase (ArrayList<String> arrList, String element) {
        boolean hasElement = false;


        for ( String eachElem: arrList) {

            if (eachElem.equalsIgnoreCase(element)){
                hasElement = true;
                break;
            }

        }

        return hasElement;
    }

}
