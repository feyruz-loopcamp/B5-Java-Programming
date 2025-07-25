package day35_inheritance.super_inheritance;
// Child Class of C
public class D extends C{
    // If parent class has custom constructor, Child class Constructor HAVE TO call Parent class constructor
    public D (double d){
        super(d);
    }
}
