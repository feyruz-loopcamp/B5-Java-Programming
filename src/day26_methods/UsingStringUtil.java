package day26_methods;

//import my_util.StringUtil;
import my_util.*;

public class UsingStringUtil {
    public static void main(String[] args) {

        // Calling a method and passing argument "jaMES"
        // this method will return me a String
        System.out.println(StringUtil.fixFormat("jaMES"));
        String courseName = StringUtil.fixFormat("loopcamp");
        System.out.println(courseName);

        System.out.println("---------------------------");

        System.out.println(StringUtil.uniqueChars("loopcamp"));

        System.out.println("---------------------------");
        //StringUtil.frequencyOfChar('o', "loopcamp");
        int num = StringUtil.frequencyOfChar("loopcamp", 'o');
        System.out.println(num);

        System.out.println("---------------------------");
        System.out.println(StringUtil.reverse("loopcamp"));
        System.out.println(StringUtil.reverse("Today is Thursday"));

    }
}
