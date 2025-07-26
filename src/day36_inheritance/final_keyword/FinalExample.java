package day36_inheritance.final_keyword;

public class FinalExample {
    // instance var - with NO final
    int a = 5;
    int b;

    // instance var - with final
    final int c = 5; // since instance var is final, the value cannot be changed
    // final int d;  // final var MUST be
    final int d; //since we have only 1 const and "d" gets initialized there, this should be good

    public FinalExample(int d) {
        this.d = d;
    }

    //-----------------------------------------
    // public static final ---> CONSTANT variables
    // Naming rule for CONSTANT var -- >  EVERYTHING in UPPERCASE
    public static final String EARTH = "Earth";
    public static final int NUM_OF_PLANET;

    static {
        NUM_OF_PLANET = 9;
    }




}

