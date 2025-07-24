package day34_c_inheritance.animal;
// Custom class
// This is child Parent relation
// There is IS-A relation
// Dog IS-A Animal
public class Dog extends  Animal{
//    // Instance Var
//    String type;
//    int numOfLegs;
//    int age;
//
//    public void walk (){
//        System.out.println(type + " is walking");
//    }


    // instance method
    public void bark () {
        System.out.println(type + " is barking.");
    }


}
