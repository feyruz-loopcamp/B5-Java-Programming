package day34_b_encapsulation;
// Custom Class
public class TrafficLight {
    // Instance var
    private String color;

    // Constructor
    public TrafficLight(String color) {
        //this.color = color;
        setColor(color);
    }

    // Since I have made "color" private, and if needed we can give indirect access
    // with public GETTER and SETTER
    // READ access only
    public String getColor (){
        return color;
    }


    // I have give indirect access to assign a value with condition
    public void setColor(String color) {
        if(color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Yellow") || color.equalsIgnoreCase("Green")){
            this.color = color;
        } else {
            System.out.println("Not one of the valid traffic light colors");
        }
    }



}
