package day38_b_polymorphism;

public class Forest {
    public static void main(String[] args) {
        // 1 - Animal
        // 1.1 - Reference is ITSELF
        Animal animal = new Animal();
        animal.eat();
        animal.name = "General Animal";
        System.out.println(animal.name);


        System.out.println("------------------------");
        // 2 - Reptile
        // 2.1 - Reference is ITSELF
        Reptile reptile1 = new Reptile();
        // What reptile1 Has access
        reptile1.eat();
        reptile1.numOfLegs = 10;
        System.out.println(reptile1.numOfLegs);
        reptile1.name = "Reptile";
        System.out.println(reptile1.name);

        System.out.println("********************");
        // 2.2 - Reference is PARENT
        Animal reptile2 = new Reptile();
        // What reptile2 Has access
        reptile2.eat();
        //reptile2.numOfLegs = 10;
        //System.out.println(reptile2.numOfLegs);
        reptile2.name = "Reptile";
        System.out.println(reptile2.name);


        // Lizard reptile2 = new Reptile(); // NOT VALID


        System.out.println("==========================");
        // 3 - Lizard
        // 3.1 - ITSELF
        Lizard l1 = new Lizard();
        l1.eat();
        l1.skinColor = "MultiColor";
        System.out.println(l1.skinColor);
        l1.numOfLegs = 12;
        System.out.println(l1.numOfLegs);
        l1.name = "Gugu";
        System.out.println(l1.name);

        System.out.println("++++++++++++++++++++++++++");
        // 3.2 - PARENT
        Reptile l2 = new Lizard();
        l2.eat();
        //l2.skinColor = "MultiColor";
        //System.out.println(l2.skinColor);
        l2.numOfLegs = 12;
        System.out.println(l2.numOfLegs);
        l2.name = "Gugu";
        System.out.println(l1.name);

        System.out.println("++++++++++++++++++++++++++");
        // 3.2 - PARENT
        Animal l3 = new Lizard();
        l3.eat();
        //l3.skinColor = "MultiColor";
        //System.out.println(l3.skinColor);
        //l3.numOfLegs = 12;
        //System.out.println(l3.numOfLegs);
        l3.name = "Dudu";
        System.out.println(l3.name);


    }
}

/*
    Object can take different forms - by reference Side
        - What can be reference
            - ITSELF:            Reptile reptile1 = new Reptile();
            - PARENT CLASS:      Animal reptile2 = new Reptile();
            - INTERFACE:

     Reference side makes the decision what object has access to.
     Changing the reference changes the access to the members
     Reference side decides what it has access but object side runs the version in its class
 */