package day37_a_abstraction.gym;

public class Gym {
    public static void main(String[] args) {
        // VanNOT create object of abstract class
        // Exercise obj = new Exercise();
        // obj.name;


        PushUps pU = new PushUps("Single Handed");
        pU.doExercise();
        pU.burnCalories(10);
        System.out.println( "Recovery time for push Ups: " + pU.recoverTime(10) );


        System.out.println("-------------------------------------------");

        Running r = new Running("Marathon");
        r.doExercise();
        r.burnCalories(10);
        System.out.println( "Recovery time for running: " + r.recoverTime(10));


    }
}
