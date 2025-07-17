package day31_custom_classes;
// Blueprint / Template how each object of this class will behave
public class Carpet {
    // INSTANCE VARIABLES
    double width;
    double length;
    double unitPrice;
    double totalPrice;


    // make a rule that when object is created, it is required to provide initial values for instance variables;
    public Carpet (double inputWidth, double inputLength, double inputUnitPrice) {
        //calculateTotalPrice();
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        calculateTotalPrice();
    }


    public void calculateTotalPrice () {
        totalPrice = length * width * unitPrice;
    }


    public String toString() {
        return "Carpet Info:" +
                "\n\tWidth: " + width +
                "\n\tLength: " + length +
                "\n\tUnit Price: " + unitPrice +
                "\n\tTotal Price: " + totalPrice;
    }
}
