package day35_inheritance.person;

public class Building {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Tom";
        person.age = 12;
        person.talk();
        //person.hasSchoolUniform = false;
        //person.wears();
        //person.schoolBus();

        System.out.println("------------------");
        Student student = new Student();
        student.name = "Jerry";
        student.age = 15;
        student.hasSchoolUniform = true;
        student.talk();
        student.wears();
        //student.schoolBuss ();
        //student.joinZoom();

        System.out.println("------------------");
        InPersonStudent ips1 = new InPersonStudent();
        ips1.name = "James";
        ips1.age = 11;
        ips1.hasSchoolUniform = true;
        ips1.talk();
        ips1.wears();
        ips1.schoolBus();
        //ips1.joinZoom();

        System.out.println("------------------");
        OnlineStudent os1 = new OnlineStudent();
        os1.name = "Winnie";
        os1.age = 13;
        os1.hasSchoolUniform = false;
        os1.talk();
        os1.wears();
        os1.joinZoom();
        //os1.schoolBus();
    }
}
