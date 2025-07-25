package day35_inheritance.person;
// Custom Class
// Student IS-A Person --> IS-A relation / Inheritance / Parent-Child / Super-Sub
public class Student extends Person {

    boolean hasSchoolUniform;

    public void wears () {
        System.out.println(name + " is having uniform: " + hasSchoolUniform);
    }

}
