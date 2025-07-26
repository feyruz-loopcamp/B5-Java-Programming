package day36_inheritance.taxi;

public class CarRide {
    public static void main(String[] args) {
        Uber u = new Uber("Tom Jerry");
        System.out.println( u.calculatePrice(10 ));


        UberX uX = new UberX("Winnie Puah");
        System.out.println( uX.calculatePrice(10) );
    }
}
