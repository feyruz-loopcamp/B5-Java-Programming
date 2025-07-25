package day35_inheritance.computer;

import my_util.StringUtil;

public class Windows extends  Computer{
    String flyingCarModel;

    public Windows(String os, int memory) {
        //this.os = os;
        //this.memory = memory;
        super(os, memory);
    }

    public Windows (String os, int memory, String flyingCarModel){
        //super(os, memory);
        this(os, memory);
        this.flyingCarModel = flyingCarModel;
    }


}
