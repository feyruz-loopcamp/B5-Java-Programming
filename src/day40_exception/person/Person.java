package day40_exception.person;
//Custom Class
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // make sure it is not empty  ("") not blank ("   ")
        if (name.isEmpty() || name.isBlank()) {
            //System.out.println("Invalid name format");
            throw new RuntimeException("Invalid name input"); // Manually causing runtime exception
        } else {
            this.name = name;
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        // if age is less than 0 give message
        if (age < 0) {
            //System.out.println("Invalid age input");
            throw new Exception("Invalid age input");
        } else {
            this.age = age;
        }
    }
}
