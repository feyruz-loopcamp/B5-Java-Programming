package day38_a_abstraction_interface.shopping;
// CONCRETE
public class Amazon extends OnlineShopping {
    @Override
    public void deliveryEstimate() {
        System.out.println("Amazon Delivery estimate.");
    }

    @Override
    public void shippingCost(boolean hasMembership) {
        if (hasMembership){
            System.out.println("You are eligible for free shipping");
        } else {
            System.out.println("Your shipping cost is $5.99");
        }
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon");
    }
}
