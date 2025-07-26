package day36_inheritance.taxi;

public class UberX extends Uber {
    // Constructor
    public UberX(String driverName) {
        super(driverName);
    }

    // Instance Method - luxury ubeX -- > %20 more than regular.
    @Override
    public double calculatePrice(int miles){
        double totalPrice = 0;
        //totalPrice = (miles * 2.5) * 1.20;
        totalPrice = super.calculatePrice(miles) * 1.30;
        return totalPrice;
    }

//    public void test (){
//        calculatePrice(10);
//        super.calculatePrice(10);
//    }
}



/*
    this ----- >  to reach same class memers (instance var + instance meth)
    this() --- >  to call another constructor in the same class

    super ----- >  to reach parent class memers (instance var + instance meth)
    super() --- >  to call parent constructor
 */