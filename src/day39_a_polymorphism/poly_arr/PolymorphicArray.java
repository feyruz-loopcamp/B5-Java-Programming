package day39_a_polymorphism.poly_arr;

import java.util.Arrays;

class A {
    @Override
    public String toString() { return "A"; }
}

class B1 extends A {
    @Override
    public String toString() { return "B1"; }
}

class B2 extends A {
    @Override
    public String toString() { return "B2"; }
}


class C1 extends B1 {
    @Override
    public String toString() { return "C1"; }
}


class D {
    @Override
    public String toString() { return "D"; }
}



// Runner CLass
public class PolymorphicArray {
    public static void main(String[] args) {
        // Array - fixed size, stores SAME data type, works with PRIMITIVE and NON-PRIMITIVE (Object) data type
        String s1 = "d";
        String s2 = new String("d");

        String [] str1 = {"a", "b", "c", s1};
        String [] str2 = {new String("a"), new String("b"), new String("c"), s2};
        int [] num1 = {1, 2, 3, 4};
        Integer [] num2 = {1, 2, 3, 4};

        D d1 = new D();
        D d2 = new D();
        D d3 = new D();
        D [] arr1 = {d1, d2, d3, new D()};      // created array of D class which holds 4 objects of D class
        D [] arr2 = new D[4];                   // created array of D class which will hold 4 objects of D class - > [null, null, null, null]



        // POLYMORPHIC Array: it can hold/store any object of itself and child classes
        A [] objArr = new A[4];                 // created array of A class which will hold 4 objects of D class - > [null, null, null, null]
        objArr[0] = new A();                    // [new A(), null, null, null]
        System.out.println(Arrays.toString(objArr));

        objArr[1] = new B1();
        objArr[2] = new B2();
        objArr[3] = new C1();
        System.out.println(Arrays.toString(objArr));
        //objArr[3] = new D();    // D class does not have any relationship with A class

        System.out.println("--------------------------------------------------------");
        B1 [] objAr2 = new B1 [4];
        //objAr2 [0] = new A(); // A is parent (bigger) than B1 child
        objAr2 [0] = (B1)new A(); // Now we DOWN-CASTED A to B1
        objAr2 [1] = new B1();
        // objAr2 [2] = new B2();
        objAr2 [3] = new C1();
        // objAr2 [3] = new D(); // D class does not have any relationship with B1 class


    }
}














