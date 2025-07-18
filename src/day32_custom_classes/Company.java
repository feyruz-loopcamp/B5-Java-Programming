package day32_custom_classes;
// Runner class
public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("James", "QA");
        System.out.println(emp1);

        Employee emp2 = new Employee("Tom", "SDET", 101, 140_000.00);
        System.out.println(emp2);

        System.out.println();
        emp1.goToMeeting();
        emp2.goToMeeting();
    }
}
