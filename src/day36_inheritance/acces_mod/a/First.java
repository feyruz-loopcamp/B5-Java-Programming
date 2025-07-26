package day36_inheritance.acces_mod.a;

public class First {
    // Instance Var             // access modifiers
    public int one = 1;         //  - public
    protected int two = 2;      //  - protected
    int three = 3;              //  - "default"
    private int four = 4;       //  - private

    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.one);      // public - accessible in same package + same class
        System.out.println(first.two);      // protected - accessible in same package + same class
        System.out.println(first.three);    // "default" - accessible in same package + same class
        System.out.println(first.four);     // private - accessible in same package + same class


    }
}


/*
    Accessibility
                SAME CLASS    -     SAME PACKAGE/DIFFERENT CLASS    -     DIFFERENT PACKAGE
    public      yes                 yes                                     yes
    private     yes                 no                                      no
    default     yes                 yes                                     no
    protected   yes                 yes                                     yes (only for child class)
 */
