package day37_a_abstraction.sport;

public class Football extends Sports {
    /*
        public static void play () {
            System.out.println("Playing from Parent class");
        }
     */


    //@Override // Static method do not get overridden.
    //Exact same method signatured Static method in Child class HIDES the one from PARENT
    public static void play () {
        System.out.println("Playing from Child class");
    }

}
