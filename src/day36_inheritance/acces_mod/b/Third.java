package day36_inheritance.acces_mod.b;

import day31_custom_classes.ThisKeyword;
import day36_inheritance.acces_mod.a.First;

// Third Class is in the DIFFERENT PACKAGE as First Class
public class Third extends First{
    public static void main(String[] args) {
        // protected int two = 2;
        First first = new First();
        System.out.println(first.one);      // public - accessible in different package + different class
        //System.out.println(first.two);      // protected - NOT accessible in different package + different class
        //System.out.println(first.three);    // "default" - NOT accessible in different package + different class
        //System.out.println(first.four);     // private - NOT accessible in different package + different class

        System.out.println();
        Third third = new Third();
        System.out.println(third.one);
        System.out.println(third.two);
        //System.out.println(third.three);
        //System.out.println(third.four);
    }
}
