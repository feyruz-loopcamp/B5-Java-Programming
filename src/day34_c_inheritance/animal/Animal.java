package day34_c_inheritance.animal;

public class Animal {
    // Instance Var
    String type;
    int numOfLegs;
    private int age; // private variables do not inherit.

    public void walk (){
        System.out.println(type + " is walking");
    }
}
