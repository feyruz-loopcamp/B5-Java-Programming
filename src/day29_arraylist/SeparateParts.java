package day29_arraylist;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
        String str = "ABC123$%@456sdf&(*^";
        // String ---> String [] ---> Arraylist <String>
        ArrayList <String> list = new ArrayList<>( Arrays.asList( str.split("") ) );
        System.out.println("Oginal: " + list);

        System.out.println("----------------------------------------------------------");
        ArrayList <String> numList = new ArrayList<>(list);
        numList.retainAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
        System.out.println("Numbers: " + numList);


        System.out.println("----------------------------------------------------------");
        ArrayList <String> specials = new ArrayList<>(list);
        specials.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+", "="));
        System.out.println("Specials: " + specials);



        System.out.println("----------------------------------------------------------");
        ArrayList <String> letter = new ArrayList<>(list);
        letter.removeAll(numList); //  [1, 2, 3, 4, 5, 6]
        letter.removeAll(specials);
        System.out.println("Letters: " + letter);

    }
}
