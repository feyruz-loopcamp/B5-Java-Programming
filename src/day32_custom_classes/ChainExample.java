package day32_custom_classes;
// Custom Class - Template
public class ChainExample {

    // 1st Constructor - NON-PARAMETERIZED
    public ChainExample () {
        //this(false); // The constructor that is called should NOT call back to current constructor
        System.out.println("First");
    }


    // 2nd Constructor - PARAMETERIZED (1 argument)
    public ChainExample (int a) {
        this();
        // this(true); // Only can call 1 CONSTRUCTOR in CONSTRUCTOR
        System.out.println("Second");
    }


    // 3rd Constructor - PARAMETERIZED (1 argument)
    public ChainExample (String str) {
        this(2);
        System.out.println("Third");
    }


    // 4th Constructor - PARAMETERIZED (1 argument)
    public ChainExample (boolean b) {
        this();
        //this (true); // CANNOT call itself - infinitely calling itself is the issue
        System.out.println("Fourth");
    }




}


/*
    CONSTRUCTOR CHAINING RULES
        - this() -- calling another constructor MUST be in the first line in CONSTRUCTOR
        - Only can call 1 CONSTRUCTOR in CONSTRUCTOR
        - CANNOT call itself
        - The constructor that is called should NOT call back to current constructor
 */