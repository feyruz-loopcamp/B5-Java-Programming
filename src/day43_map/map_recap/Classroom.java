package day43_map.map_recap;

import day40_exception.recap.FourthTry2;

import java.util.*;

// Runner Class - main
public class Classroom {
    public static void main(String[] args) {
        Student student1 = new Student("Tom", 20, "ID#001");
        Student student2= new Student("Jerry", 30, "ID#002");
        Student student3 = new Student("Winnie", 40, "ID#003");
        Student student4 = new Student("Pooh", 50, "ID#004");
        Student student5 = new Student("Zayec", 60, "ID#005");


        List <Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        //System.out.println(studentList);

        for ( Student eachStudent: studentList) {
            System.out.println(eachStudent);
        }

        /*
            KEY     VALUE
            1       student1
            2       student2
            3       student3
            4       student4
            5       student5
         */
        System.out.println("-----------------------------------");
        Map <Integer, Student> map = new LinkedHashMap<>();
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        map.put(4, student4);
        map.put(5, student5);


        System.out.println(map);

        System.out.println("-----------------------------------");
        // Get me the student at the Key 3
        System.out.println(map.get(3));

        System.out.println("-----------------------------------");
        map.put(3, new Student("Nupogodi", 45, "ID#020"));
        // KEYs canNOT be duplicate,
        // when adding, it checks if there is existing KEY. If yes, update VALUE linked to that KEY. If not, add new KEY-VALUE pair
        System.out.println(map.get(3));


        System.out.println("-----------------------------------");
        map.remove(3);
        System.out.println(map.get(3));
        System.out.println(map);

        System.out.println("-----------------------------------");
        System.out.println(map.size()); // 4

        System.out.println("-----------------------------------");
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsKey(1));

        System.out.println();
        System.out.println(map.containsValue(new Student("Mick Mick", 55, "ID#060")));
        System.out.println(map.containsValue(new Student("Zayec", 60, "ID#005")));
        System.out.println(map.containsValue(student5));
        System.out.println();
        System.out.println(map);


        System.out.println("-----------------------------------");
        List <String> group2 = new ArrayList<>(Arrays.asList("Nina", "Savlat", "Suidum"));
        List <String> group3 = new ArrayList<>(Arrays.asList("Polna", "Jane", "Veronika", "Asia"));
        System.out.println(group2);
        System.out.println(group3);

        //  KEY      VALUE
        // "group2", list of group2
        // "group3", list of group3
        Map <String, List<String>> loopcampCampGroups = new HashMap<>();
        loopcampCampGroups.put("GP2", group2);
        loopcampCampGroups.put("GP3", group3);

        System.out.println(loopcampCampGroups);


        // can you find me the names from group2 which contains "n" (NOTE: do it through map)
        //loopcampCampGroups.get("GP2");
        for ( String eachNameInGroup2 : loopcampCampGroups.get("GP2") ) {
            if (eachNameInGroup2.contains("n")) {
                System.out.println(eachNameInGroup2);
            }
        }





    }
}

/*
    methods so far
        - put(KEY, VALUE)
        - get (KEY)
        - remove (KEY)
        - size()
        - containsKey(KEY)
        - containsValue(VALUE)
 */