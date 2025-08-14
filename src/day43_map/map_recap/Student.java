package day43_map.map_recap;
// Custom Class
public class Student {
    String name;
    int age;
    String iD;


    // Once there is custom Constructor, there no default constructor
    public Student(String name, int age, String iD) {
        this.name = name;
        this.age = age;
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Student{\t" +
                "name='" + name + '\'' +
                ",\t\tage=" + age +
                ",\t\tiD='" + iD + '\'' +
                '}';
    }
}
