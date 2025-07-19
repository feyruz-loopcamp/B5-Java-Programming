package day33_a_static;

import java.util.Arrays;

// Runner Class
public class School {
    public static void main(String[] args) {
        LoopcampStudent s1 = new LoopcampStudent("Jane","Group 03",  "Iryna");

        LoopcampStudent s2 = new LoopcampStudent( "Veronika", "Group 02", "Dian");


        System.out.println(s1);
        System.out.println(s2);

        // Get me the teach name of Loopcamp
        System.out.println(Arrays.toString(LoopcampStudent.teachers));


        System.out.println("-------------------------");
        // get me the school info
        LoopcampStudent.schoolInfo();

    }
}
