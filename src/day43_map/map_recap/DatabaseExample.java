package day43_map.map_recap;
import java.util.*;
/*
    Database Table: Student
        Column Names ----- >        FIRST_NAME  | LAST_NAME | BATCH_NO
        Row 1   ---------- >        Tom         | Jerry     | 5
        Row 2   ---------- >        James       | Bond      | 5
        Row 3   ---------- >        Winnie      | Pooh      | 5
 */
public class DatabaseExample {
    public static void main(String[] args) {

        Map <String, Object> person1 = new LinkedHashMap<>();
        /*
            KEY             VALUE
            FIRST_NAME      Tom
            LAST_NAME       Jerry
            BATCH_NO        5
         */
        person1.put("FIRST_NAME", "Tom");
        person1.put("LAST_NAME", "Jerry");
        person1.put("BATCH_NO", 5);
        System.out.println(person1);

        Map <String, Object> person2 = new LinkedHashMap<>();
        /*
            KEY             VALUE
            FIRST_NAME      James
            LAST_NAME       Bond
            BATCH_NO        5
         */
        person2.put("FIRST_NAME", "James");
        person2.put("LAST_NAME", "Bond");
        person2.put("BATCH_NO", 5);
        System.out.println(person2);

        Map <String, Object> person3 = new LinkedHashMap<>();
        /*
            KEY             VALUE
            FIRST_NAME      Winne
            LAST_NAME       Pooh
            BATCH_NO        5
         */
        person3.put("FIRST_NAME", "Winnie");
        person3.put("LAST_NAME", "Pooh");
        person3.put("BATCH_NO", 5);
        System.out.println(person3);
    }
}


/*
    Database Table: Student
        Column Names ----- >        University  | Occupation        |
        Row 1   ---------- >        Harward     | new Student       |
        Row 2   ---------- >        Penstate    | new Student       |
        Row 2   ---------- >        Penstate    | new Teacher       |

        Student s1 = new Student ()

        Map <String, Object> map = new HashMap<>();
        map.put ("Harward",  new Student("Tom", 20) );
        map.put ("Harward",  new Student("Tom", 20) );
        map.put ("Penstate",  new Teacher("Winnie", 70, "Female") );



        class Student {
            String name;
            int age;

            public Student (String name, int age) {
                this.name = name;
                this.age = age;
            }
        }


       class Teacher {
            String name;
            int age;
            String gender;

            public Teacher (String name, int age, String gender) {
                this.name = name;
                this.age = age;
                this.gender = gender;
            }
        }
 */
