package day37_a_abstraction.gym;

public class Running extends Exercise {
    // String name;

    public Running(String name) {
        //this.name = name;
        super(name);
    }

    // Since it is the CONCRETE CLASS, it has to implement/override all Parent abstract methods
    @Override
    public void doExercise() {
        System.out.println("Running " + name);
    }

    @Override
    public void burnCalories(int minutes) {
        System.out.println("In " + minutes + " mins, you can burn " + minutes*15 + " cals running " + name);
    }

    @Override
    public int recoverTime(int mins) {
        return mins * 20;
    }
}
