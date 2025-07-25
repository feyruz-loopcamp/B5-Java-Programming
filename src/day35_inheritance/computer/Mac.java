package day35_inheritance.computer;

public class Mac extends Computer {
    String swimmingCarModel;

    public Mac(String os, int memory) {
        super(os, memory);
    }

    public Mac (String os, int memory, String swimmingCarModel ) {
        super(os, memory);
        //super(os, memory, "VA");
        this.swimmingCarModel = swimmingCarModel;
    }
}
