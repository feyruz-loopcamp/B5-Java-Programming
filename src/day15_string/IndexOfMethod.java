package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String str = "oppen door pen";// djfha;ljkshvakjdhslakjsdhflasjkdfhads
        //            01234567890123

        char firstChar = str.charAt(0); // get the character at index of 0
        //System.out.println(str.charAt(100));
        // can you find the index number of 'p'
        System.out.println( str.indexOf('p')  );
        System.out.println( str.indexOf("p")  );
        System.out.println();
        //System.out.println(str.indexOf('pen'));
        System.out.println(str.indexOf("pen"));
        System.out.println(str.indexOf(" do"));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf(" door"));
        System.out.println(str.indexOf(" doorr"));
        System.out.println(str.indexOf(" doolskdsfdlkrr"));
        System.out.println(str.indexOf("pen"));
        System.out.println(str.indexOf("      ")); // -1

        System.out.println("---------------------------------------");
        String str2 = "eenen";
        //             01234

        System.out.println( str2.indexOf('e') ); // one argument which char
        System.out.println( str2.indexOf("en") ); // one argument which String

        System.out.println();
        System.out.println( str2.indexOf('e', 1)); // two arguments which are char and int
        System.out.println( str2.indexOf("en", 2));


        System.out.println("---------------------------------------");
        String sentence = "Saturday is firs weekend day and we have Java classes on Saturday. Saturday better than Sunday";
        // Find me the index of 2nd Saturday

        System.out.println( sentence.indexOf("Saturday")  );
        System.out.println( sentence.indexOf("Saturday", 1)  );

        System.out.println("---------------------------------------");
        String sentence2 = "Today is Saturday and we have Java classes on Saturday. Saturday better than Sunday";
        System.out.println( sentence2.indexOf("Saturday")  );
        System.out.println( sentence2.indexOf("Saturday", 1)  );
        System.out.println( sentence2.indexOf("Saturday", sentence2.indexOf("Saturday")+1)  );

    }
}
