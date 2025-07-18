package day32_custom_classes;

public class OfferV2 {
    // INSTANCE Variables
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;


    // CONSTRUCTOR with 2 info - company, location
    public OfferV2 (String company, String location) {
        this.company = company;
        this.location = location;
    }

    // CONSTRUCTOR with 3 info - company, location, salary
    public OfferV2 (String company, String location, double salary) {
        //this.company = company;
        //this.location = location;
        this(company, location);
        this.salary = salary;
    }

    // CONSTRUCTOR with 5 info - company, location, salary, isFullTime, numberOfPTO
    public OfferV2(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        //this.location = location;
        //this.company = company;
        //this.salary = salary;
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }


    // INSTANCE method - special one to print object directly.
    public String toString() {

//        return "Offer{" +
//                "location='" + location + '\'' +
//                ", company='" + company + '\'' +
//                ", salary=" + salary +
//                ", isFullTime=" + isFullTime +
//                ", numberOfPTO=" + numberOfPTO +
//                '}';
        String msg = "Offer Info: ";

        msg += company + ", " + location;

        if (salary != 0.0) {
            msg += ", " + salary;
        }

        if (isFullTime != false) {
            msg += ", " + isFullTime;
        }

        msg += numberOfPTO !=0 ? (", " + numberOfPTO) : "";

        return msg;
    }
}
