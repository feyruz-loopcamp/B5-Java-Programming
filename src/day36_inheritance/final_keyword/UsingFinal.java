package day36_inheritance.final_keyword;

import day36_inheritance.app.Instagram;

public class UsingFinal {
    public static void main(String[] args) {
        FinalExample obj1 = new FinalExample(10);
        System.out.println("Obj 1");
        System.out.println("a: " + obj1.a);
        System.out.println("b: " + obj1.b);
        obj1.a = 10;
        obj1.b = 11;
        System.out.println("a: " + obj1.a);
        System.out.println("b: " + obj1.b);


        System.out.println();
        System.out.println("Obj 2");
        FinalExample obj2 = new FinalExample(20);
        System.out.println("c: " + obj2.c);
        System.out.println("d: " + obj2.d);
        // obj2.c = 20; // since instance var is final, the value cannot be changed
        // obj2.d = 30; // since instance var is final, the value cannot be changed

        System.out.println("--------------------------------------");
        System.out.println(FinalExample.EARTH);
        // FinalExample.earth = "Mars"; / since static var is final, the value cannot be changed


        //Integer.MAX_VALUE;
        //Math.PI


    }
}
