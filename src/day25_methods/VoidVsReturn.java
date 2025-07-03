package day25_methods;

public class VoidVsReturn {

    // main(); -- > where the execution stars in Java
    public static void main(String[] args) {
        sayHi(); // Calling sayHi() method
        // System.out.println(a);

        System.out.println("-----------");
        String str = "loopcamp";
        str.substring(0, 4);        // String --- > "loop"
        str.length();               // int
        str.charAt(0);              // char
        str.equals("hi");           // boolean
        System.out.println(str);    // void


        System.out.println("-----------");

        sayHi2();  // "Hi"

        String str2 = sayHi2();
        System.out.println(str2);

        System.out.println(  sayHi2()  );

        // System.out.println(  sayHi()    );


    }


    // NOTE: there 2 type of methods in terms of RETURN TYPE --- > 1) void return type  2) dataType return type

    // Custom method - sayHi() - it is void type of method in terms of return - > it does ONLY the action and does not return anything
    public static void sayHi () {
        //System.out.println("Hi");
        int a = 9; // local variable  --- > it is local to this method
        int b = a + 5;
    }



    // Custom method -sayHi2() - it is return type of method in terms of return - it does the action and returns the String
    public static String sayHi2 (){
        String str = "Hi2";
        return str;
    }


}
