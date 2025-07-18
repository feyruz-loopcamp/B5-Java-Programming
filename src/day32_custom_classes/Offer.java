package day32_custom_classes;
/*
    create a class called Offer

    - data:

        location, company, salary, is full time, number of PTO

    - constructor

        - create a constructor that creates an Offer object with the company and location

        - create a constructor that creates an Offer object with the company, location, and salary

        - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

    - method:

        toString()
            print all the employees information

 */
// Custom Class - Template / Blueprint
public class Offer {
    // INSTANCE Variables
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;


    // CONSTRUCTOR with 2 info - company, location
    public Offer (String company, String location) {
        this.company = company;
        this.location = location;
    }

    // CONSTRUCTOR with 3 info - company, location, salary
    public Offer (String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    // CONSTRUCTOR with 5 info - company, location, salary, isFullTime, numberOfPTO
    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this.location = location;
        this.company = company;
        this.salary = salary;
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
