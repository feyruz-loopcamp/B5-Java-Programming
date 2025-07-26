package day36_inheritance.app;
/*
Create an App class

    - create variables:
        name (app name), version

    - create constructor to initialize the variables

    - create method:
        download()
            Example output: prints $name is downloading version $version

 */
public class Application {
    // Instance var - default access modifier
    String name;
    double version;

    // Constructor
    public Application(String name, double version) {
        this.name = name;
        this.version = version;
    }

    // Instance method
    public void download () {
        System.out.println(name + " downloading " + version + " version");
    }

}
