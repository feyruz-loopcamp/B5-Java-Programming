package day33_a_static;

import java.util.Arrays;

// Custom Class - building template for objects
public class LoopcampStudent {

    // Instance var
    String name;
    String groupNumber;
    String mentor;


    static int batchNumber;
    static int lengthOfCourse;
    static String schoolName;
    //static String javaTeacher;
    //static String softSkillTeacher;
    static String [] teachers; // = {"Feyruz", "Nadir"};


    // Static Block - initialization for static variables.
    static  {
        batchNumber = 5;
        lengthOfCourse = 6;
        schoolName = "Loopcamp";
        teachers = new String[]{"Nadir", "Feyruz"};
    }

    // Constructor - initialization for instance variables


    public LoopcampStudent(String name, String groupNumber, String mentor) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.mentor = mentor;
    }


    @Override
    public String toString() {
        return "Loopcamp Student Info: " +
                "\t-Name: " + name +
                "\t-Group Number: " + groupNumber +
                "\t-Mentor: " + mentor +
                "\t-Batch No: " + batchNumber +
                "\t-Length of Course: " + lengthOfCourse +
                "\t-School Name: " + schoolName +
                "\t-Teachers: " + Arrays.toString(teachers);
    }

    public static void schoolInfo () {
        String msg = "School Info: " +
                "\n\tSchool Name: " + schoolName +
                "\n\tLength of Course: " + lengthOfCourse +
                "\n\tTeachers: " + Arrays.toString(teachers);

        System.out.println( msg);
    }
}

