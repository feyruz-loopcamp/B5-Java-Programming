package day36_inheritance.app;

public class Instagram extends Application{

    public Instagram( double version) {
        super("Instagram", version);
    }

    public void postPicture () {
        System.out.println("Posting picture on " + name);
    }


}
