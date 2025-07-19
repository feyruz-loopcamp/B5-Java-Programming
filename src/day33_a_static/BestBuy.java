package day33_a_static;
// Custom Class
public class BestBuy {

    // INSTANCE var
    // - Instance var belong to object
    // - Every object will have its OWN copy
    String location;


    // STATIC var
    // - Belong to Class
    // - Every object will have SAME copy of information
    static String headquarter = "601 Penn Ave S, Richfield";
    static String specialDay = "Jul 19";



    // CONSTRUCTOR
    public BestBuy (String location){
        this.location = location;
    }


    // INSTANCE METHOD
    public void openStore(){
        System.out.println("Opening the store in " + location);
        // instance can accept static
        System.out.println("Our headquarter is " + headquarter);
    }


    // STATIC METHOD
    public static void specialDaySale () { // Jul 19th
        System.out.println("There discount for %40-%60 on " + specialDay);

        // Static ALWAYS accepts ONLY static
        //System.out.println("Please, vising " + location);
    }

}

/*
    static
        - all objects share/have same copy/version
        - if it changes/updated all objects are affected
        - we use Class Name to reach the static members
            - You can reach static members by object reference as well but NOT good practice.
        - Static ONLY works/accepts static members


     instance
        - every object has its own copy/version
        - if instance for one object is changed/updated, it ONLY affects that object
        - We use object reference to reach instance members
            - Ca not reach instance member by Class name.
        - Instance can work/accept BOTH static and instance members
 */