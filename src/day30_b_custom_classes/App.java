package day30_b_custom_classes;

// Building a class (blueprint/template) - which give instructions for each object of this class
// Instance variables - Class Fields
// Instance methods - method: function
public class App {
    // Instance variables - belong to each Object / Each object has their OWN copy of these
    String name;
    double version;
    boolean isFree;
    int reviews;


    // Instance method - belongs to each Object (should not have "static" keyword) - NON-Static method
    public void run () {
        System.out.println(name + " is running...");
    }

    public void update (){
        System.out.println(name + " is updating...");
        version += 1;
    }

}

