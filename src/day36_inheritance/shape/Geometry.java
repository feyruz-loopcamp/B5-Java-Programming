package day36_inheritance.shape;

public class Geometry {
    public static void main(String[] args) {
        Square s = new Square(3);
        System.out.println(s);
        System.out.println(s.area());
        System.out.println(s.perimeter());


        System.out.println();
        Circle c = new Circle(3);
        System.out.println(c);
        System.out.println(c.area());
        System.out.println(c.perimeter());


    }
}
