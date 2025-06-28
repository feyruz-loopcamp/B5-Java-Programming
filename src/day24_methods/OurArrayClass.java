package day24_methods;
/*

    all will accept array argument

    create a method that will print the first element
    create a method that will print the last element
    create a method that will print the middle element/s
        length matters -> if even - there are two middle, for odd there is one middle

 */
public class OurArrayClass {

    public static void arrayFirstLetter (String [] arr) {
        System.out.println("First element in arr: " + arr[0]);
    }


    public static void arrayLastLetter (String [] arr) {
        System.out.println("Last element in arr: " + arr[arr.length - 1 ]);
    }

    public static void arrayMiddle (String [] arr) {

        if (arr.length % 2 == 0) { // if even num element
            System.out.println(  arr[arr.length / 2 - 1]  );
            System.out.println(  arr[arr.length / 2]  );
        } else {
            System.out.println( arr [arr.length / 2] );
        }

    }


    public static void main(String[] args) {
        String [] strArr = {"java", "selenium", "api", "db", "jira", "aws"}; // 6
        //                    0         1           2   3       4       5
        arrayFirstLetter(strArr);
        arrayLastLetter(strArr);


        System.out.println("-----------------------------");
        String [] strArr2 = {"Zhala", "Sultan", "Halina", "Polina", "Taras", "Veronika", "Gulden", "Feyruz"}; // 7
        //                      0       1          2          3        4         5           6
        arrayFirstLetter(strArr2);
        arrayLastLetter(strArr2);

        System.out.println("-----------------------------");
        arrayMiddle(strArr);
        arrayMiddle(strArr2);

    }


}
