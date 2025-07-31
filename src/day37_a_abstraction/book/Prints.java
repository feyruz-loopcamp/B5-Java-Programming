package day37_a_abstraction.book;
// Intercase similar to class but not same
// It is another way of achieving ABSTRACTION
// "public" is the only available access modifiers in interface
public interface Prints {
    // variables by default are - > public static final
    // CONSTANT variables - >  public static final
    // public static final String NAME = "Java";
    String NAME = "Java";

    // By default the method are "public abstract"
    //public abstract void read();
    void read();
    void write();

    // Since we can have static variables, there is static method available in Interface
    // static method in interface is not inherited to Child
    static void sayBye () {
        System.out.println("Name is " + NAME);
    }

    // Only will be accessible with Child CLass Object
    default void sayHi () {
        System.out.println("Hi!");
    }




}

