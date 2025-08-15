package day44_map_and_functions.recap;

import java.util.*;

public class MapSalary {
    public static void main(String[] args) {
        Map<String, Double> salaryMap = new LinkedHashMap<>();
        salaryMap.put("John", 1000.00);
        salaryMap.put("Tom", 2000.00);
        salaryMap.put("Jerry", 3000.00);
        salaryMap.put("Winnie", 4000.00);
        salaryMap.put("Pooh", 5000.00);


        System.out.println(salaryMap);
        System.out.println(salaryMap.size());

        System.out.println("-------------------------------------------");
        // Q: Can you find the MAX and MIN Salary?
        // X - Convert LinkedHashMap to TreeMap --- > it will sort based on the KEYs which just names.
        // 1 - Loop through VALUES
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for ( Double eachValue : salaryMap.values()) {
            if (eachValue < min) {
                min = eachValue;
            }

            if (eachValue > max) {
                max = eachValue;
            }
        }
        System.out.println("Min Salary: $" + min);
        System.out.println("Max Salary: $" + max);

        System.out.println("-------------------------------------------");
        // 2 - Convert VALUEs to TreeSet
        //salaryMap.values()
        //Set <Double> allSalaries = new TreeSet<>(salaryMap.values());
        //allSalaries.getFirst(); // Since reference side Set does nto have access to those methods, "allSalaries" will not be able to reach them
        TreeSet <Double> allSalaries = new TreeSet<>(salaryMap.values());
        System.out.println(allSalaries);
        System.out.println("Min Salary: $" + allSalaries.getFirst());
        System.out.println("Max Salary: $" + allSalaries.getLast());


        System.out.println("-------------------------------------------");
        // Q: Can you find the names for who is making MAX and MIN salary?
        // 1 - looping through ENTRY
        for ( Map.Entry<String, Double> eachKeyValue: salaryMap.entrySet()) {

            if ( eachKeyValue.getValue() == min) {
                System.out.println("Name who makes the least: " + eachKeyValue.getKey());
            }


            if ( eachKeyValue.getValue() == max) {
                System.out.println("Name who makes the highest: " + eachKeyValue.getKey());
            }

        }


        System.out.println("-------------------------------------------");
        // Q: Find all the names who make than 2000
        ArrayList <String> nameWhoMakeThan2000 = new ArrayList<>();
        for ( Map.Entry<String, Double> eachKeyValue: salaryMap.entrySet()) {

            if ( eachKeyValue.getValue() > 2000) {
                nameWhoMakeThan2000.add(eachKeyValue.getKey());
            }

        }
        System.out.println("All the names who make more than 2K: " + nameWhoMakeThan2000);


        System.out.println("-------------------------------------------");
        // Q: Lets say our manager, want to increase everyones salar by 2000;
        // 1 - with ENTRY SET
        for ( Map.Entry <String, Double> eachEntry : salaryMap.entrySet()) {
            salaryMap.put(eachEntry.getKey(), eachEntry.getValue() + 2000);
        }
        System.out.println(salaryMap);


        // 2 - with KEYSET
        for ( String eachKey : salaryMap.keySet()) {
            salaryMap.put(eachKey, salaryMap.get(eachKey) + 2000);
        }
        System.out.println(salaryMap);


        System.out.println("-------------------------------------------");
        Map<String, String> salaryMap2 = new LinkedHashMap<>();
        salaryMap2.put("John", "John");
        salaryMap2.put("Tom", "Mike");
        salaryMap2.put("Jerry", "Merry");
        salaryMap2.put("Winnie", "Test");
        salaryMap2.put("Pooh", "Example");
        System.out.println(salaryMap2);

        // change the last name to be and email -- > last+"@gmail.com"
        for ( String eachKey : salaryMap2.keySet()){
            salaryMap2.put(eachKey, salaryMap2.get(eachKey) + "@gmail.com");
        }
        System.out.println(salaryMap2);

    }
}