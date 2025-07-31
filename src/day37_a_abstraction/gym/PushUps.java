package day37_a_abstraction.gym;

public class PushUps extends Exercise {

    //String name;

    public PushUps(String name) {
        super(name);
    }

    // Since it is the CONCRETE CLASS, it has to implement/override all Parent abstract methods
    @Override
    public void doExercise() {
        System.out.println("Doing " + name +  " push ups");
    }

    @Override
    public void burnCalories(int minutes) {
        System.out.println("In " + minutes + " mins, you can burn " + minutes*10 + " cals doing " + name + " push ups");
    }

    @Override
    public int recoverTime(int mins) {
        return mins * 10;
    }
}
