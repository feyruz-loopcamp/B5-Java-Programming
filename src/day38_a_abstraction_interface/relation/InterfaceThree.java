package day38_a_abstraction_interface.relation;

public interface InterfaceThree extends InterfaceOne, InterfaceTwo{
}


/*
How do you use Interface?
    -Going from interface   - > to a class:         we use ‘implements’ keyword     - > class implements interface
    -Going from class       - > to a class:         we use ‘extends’ keyword        - > class extends class
    -Going from interface   - > to an interface:    we use ‘extends’ keyword        - > interface extends interface
    -Going from class.      - > to an interface ??? NO                              - > interface _____ class (class cannot be parent of interface + abstract)
 */