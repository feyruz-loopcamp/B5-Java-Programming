package day30_b_custom_classes;

// This is just a runner - will have main method to start execution
public class UsingApp {
    public static void main(String[] args) {

        // System.out.println(name); // NOT ACCESSIBLE - NOT VALID

        // TO be able to reach instance variables, we need to create object
        // Object  Reference    =   Object itself
        App app1                =   new App();
        // app1 has it is own copy of Instance variables
        // app1 has it is own copy of Instance methods


        // Created another app object
        App app2                = new App();


        // These will show the default values as we have not given initial values for app1
        System.out.println(app1.name);
        System.out.println(app1.version);
        System.out.println(app1.isFree);
        System.out.println(app1.reviews);


        System.out.println("-------------");
        // These will show the default values as we have not given initial values for app2
        System.out.println(app2.name);
        System.out.println(app2.version);
        System.out.println(app2.isFree);
        System.out.println(app2.reviews);


        System.out.println("-------------");
        app1.run();
        app2.run();

        System.out.println("-------------");
        app1.name = "Instagram";
        app2.name = "YouTube";

        app1.run(); // calling run method with reference - app1
        app2.run(); // calling run method with reference - app2


        System.out.println("-------------");
        System.out.println( app1.version ); // default values - 0.0
        System.out.println( app2.version ); // default values - 0.0

        System.out.println("-------------");
        app1.update();
        app2.update();


        System.out.println("-------------");
        System.out.println( app1.version );
        System.out.println( app2.version );


        System.out.println("-------------");
        app2.update();

        System.out.println("-------------");
        System.out.println(app1.version); // 1.0
        System.out.println(app2.version); // 2.0

        System.out.println("-------------");
        App app3 = new App();
        app3.name = "Twitter";
        System.out.println(app3.name);
        app3.name = "X";
        System.out.println(app3.name);



    }
}
