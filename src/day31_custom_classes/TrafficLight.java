package day31_custom_classes;

public class TrafficLight {
    // RULE 1
    //  - If no explicit constructor declared, compiler adds default constructor (hidden)
    //  - default constructors - are NON-PARAMETERIZED
    //  - default constructor  --- > public className () { ... }
    //  - public TrafficLight () { }


    // RULE 2
    //  - If constructor declared explicitly, the compiler does NOT add default constructor
    //public TrafficLight () {
    //
    //}


    // INSTANCE VARIABLE
    String color;

    // Creating Constructor - declared custom constructor explicitly
    public TrafficLight (String trafficLight){
        color = trafficLight;
    }




}
