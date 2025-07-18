package day32_custom_classes;
/*
  create a class called Employee

   - data:

       name, id, job title, salary

- constructor

    - create a constructor that creates an Employee object with the name and job title

    - create a constructor that creates an Employee object with the name, id, job title, and salary

- method:

        goToMeeting()
            when this method is called print:
                $name is going to a meeting

        toString()
            print all the employees information

 */
// Template Class
public class Employee {
    // INSTANCE variables
    String name;
    int id;
    String jobTitle;
    double salary;


    // CONSTRUCTOR with 2 info - name, jobTitle
    public Employee (String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }


    // CONSTRUCTOR OVERLOADING - constructor with different version (different parameters-same rule as method overloading)
    // CONSTRUCTOR with 2 info - name, jobTitle
    public Employee (String name, String jobTitle, int id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
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
