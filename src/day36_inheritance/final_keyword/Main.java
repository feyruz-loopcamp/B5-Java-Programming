package day36_inheritance.final_keyword;

public class Main {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.walk();


        Child c = new Child();
        c.walk();
    }
}

class Parent {
    // instance method with final - canNOT be overridden
    public final void walk () {
        System.out.println("Walking from Parent class...");
    }

    // Q: Can I overload it?
    // A: Yes, overloading happens in the same class
    public final void walk (int miles) {
        System.out.println("Walking from Parent class in " + miles + " miles.");
    }


    public void walk (int miles, String name) {
        System.out.println("Walking from Parent class in " + miles + " miles with " + name);
    }

}


class Child extends Parent {
    // final methods - canNOT be overridden
    //@Override
    //public void walk () {
    //    System.out.println("Walking from Child class...");
    //}


    // final methods - canNOT be overridden
    //@Override
    //public void walk (int miles) {
    //    System.out.println("Walking from Child class...");
    //}


    @Override
    public void walk (int miles, String name) {
        System.out.println("Walking from Child class...");
    }
}


class A {  }

class B extends A { }

final class C extends B { }

// Since class C is final, canNOT have any Child class
//class D extends C { }

class E extends B { }

