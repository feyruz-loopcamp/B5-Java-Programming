package day36_inheritance.acces_mod.a;
// Second Class is in the SAME PACKAGE as First Class
public class Second extends First{
    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.one);      // public - accessible in same package + different class
        System.out.println(first.two);      // protected - accessible in same package + different class
        System.out.println(first.three);    // "default" - accessible in same package + different class
        //System.out.println(first.four);     // private - NOT accessible in same package + different class

        System.out.println();
        Second second = new Second();
        System.out.println(second.one);
        System.out.println(second.two);
        System.out.println(second.three);
        //System.out.println(second.four);
    }
}
