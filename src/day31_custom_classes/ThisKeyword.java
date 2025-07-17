package day31_custom_classes;

public class ThisKeyword {
    // INSTANCE variable
    int a;

    //               LOCAL variable
    public ThisKeyword (int a) {
        // In Java, LOCAL variables always have the priority.
        // Taking LOCAL variable "a" and re-assigning it back to LOCAL variable "a"
        // When we have LOCAL variables and INSTANCE variables sharing same exact name, we can make the difference between them with the help of "this" keyword
        this.a = a;
    }
}
