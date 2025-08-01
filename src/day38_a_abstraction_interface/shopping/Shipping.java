package day38_a_abstraction_interface.shopping;

public interface Shipping {
    // CONSTANT - public static final by default
    String COUNTRY = "US";

    // public abstract - by default
    void shippingCost (boolean hasMembership);
}
