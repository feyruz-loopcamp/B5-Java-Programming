package day32_custom_classes;

public class EmployeeV2 {
    // INSTANCE variables
    String name;
    int id;
    String jobTitle;
    double salary;


    // CONSTRUCTOR with 2 info - name, jobTitle
    public EmployeeV2 (String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }


    // CONSTRUCTOR OVERLOADING - constructor with different version (different parameters-same rule as method overloading)
    // CONSTRUCTOR with 2 info - name, jobTitle
    public EmployeeV2 (String name, String jobTitle, int id, double salary) {
        //this.name = name;
        //this.jobTitle = jobTitle;
        this(name, jobTitle);
        this.id = id;
        this.salary = salary;
    }


    public String toString() {
        return "Employee Info: " + name +  " - " + id + " - " + jobTitle +
                " - " + salary;
    }

    public void goToMeeting (){
        System.out.println(name + " is going to a meeting.");
    }
}
