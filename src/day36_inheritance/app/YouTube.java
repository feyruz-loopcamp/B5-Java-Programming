package day36_inheritance.app;

public class YouTube extends Application {

    public YouTube (double version) {
        super("YouTube", version);
    }

    public void watch () {
        System.out.println("Watching video on " + name);
    }
}
