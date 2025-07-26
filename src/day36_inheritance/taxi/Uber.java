package day36_inheritance.taxi;

public class Uber {
    // Instance Var - default -- > up to same package
    String driverName;

    // Constructor - NOT inherit
    public Uber(String driverName) {
        this.driverName = driverName;
    }

    // Instance Method - > regular uber -- > $2.5 per 1 mile
    public double calculatePrice (int miles) {
        double totalPrice = 0;
        totalPrice = miles * 3.5;
        return totalPrice;
    }

}
