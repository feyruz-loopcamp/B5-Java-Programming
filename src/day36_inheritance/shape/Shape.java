package day36_inheritance.shape;

import java.net.InetAddress;

public class Shape {
    // Instance var
    String name;

    public Shape (String name) {
        super();
        this.name = name;
    }
    // private < default < protected < public
    public double area(){
        return 0.0;
    }

    public double perimeter (){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}

// private < default < protected < public