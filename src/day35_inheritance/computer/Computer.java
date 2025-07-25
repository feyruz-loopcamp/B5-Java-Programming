package day35_inheritance.computer;

public class Computer {
    String os;
    int memory;
    String headquarter;

    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }

    public Computer(String os, int memory, String headquarter) {
        //this.os = os;
        //this.memory = memory;
        this(os, memory);
        this.headquarter = headquarter;
    }

}
