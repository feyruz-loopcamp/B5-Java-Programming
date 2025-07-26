package day36_inheritance.acces_mod.b;

import day36_inheritance.acces_mod.a.First;

// Fourth Class is in the DIFFERENT PACKAGE as First Class
public class Fourth extends First {
    // protected int two = 2;
    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.one);      // public - accessible in different package + different class
        //System.out.println(first.two);      // protected - NOT accessible in different package + different class
        //System.out.println(first.three);    // "default" - NOT accessible in different package + different class
        //System.out.println(first.four);     // private - NOT accessible in different package + different class

        Fourth fourth = new Fourth();
        System.out.println(fourth.one);
        System.out.println(fourth.two);
        //System.out.println(fourth.three);
        //System.out.println(fourth.four);

    }
}
