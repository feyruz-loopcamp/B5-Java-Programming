package day31_custom_classes;

// Template
public class Address {
    String street;
    String city;
    String state;
    int zipCode;

    //public Address (String inputStreet, String inputCity, String inputState, int inputZipcode) {
    //    street = inputStreet;
    //    city = inputCity;
    //    state = inputState;
    //    zipCode = inputZipcode;
    //}


    public Address (String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }



    public String toString() {
        return "Address Info: " +
                "\n\tStreet: " + street +
                "\n\tCity: " + city +
                "\n\tState: " + state +
                "\n\tZipCode: " + zipCode;
    }
}



class Runner {
    public static void main(String[] args) {
        Address address1 = new Address("123 Main St", "Fairfax", "VA", 22222);
        System.out.println(address1);

        Address address2 = new Address("123 Test Dr", "Fairfax", "VA", 21111);
        System.out.println(address2);
    }
}
