package day44_map_and_functions.functional_interface;

/*
    Functional Interface also known as SAM (Single Abstract Method)
    can only have one abstract method.
 */
@FunctionalInterface
public interface NumberInterface {
    void apply(int a);
}


// Regular Interface: can have more than one abstract method
interface NumberInterfaceReg {
    void apply(int a);
}


// CONCRETE Class
class A implements NumberInterfaceReg {
    @Override
    public void apply(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}


class B implements NumberInterfaceReg {
    @Override
    public void apply(int a) {
        System.out.println("Cube of " + a + " is: " + a * a * a);
    }
}



