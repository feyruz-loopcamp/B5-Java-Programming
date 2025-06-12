package day16_loops;
/*
    [SMS parts]
    Given a String in the following format:
        Ex1: "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}"
        Ex2: "Sender: <Tom Jerry>. From Number: [202-987-6543]. + Message: {I will see you in Java class}"

    Separate these parts and print them separately:
    Sender: actualSender
    Number: actualNumber
    Message: actualMessage
 */

public class SmsParts {
    public static void main(String[] args) {

        String sms = "Sender: <Tom Jerry>. From Number: [202-987-6543]. + Message: {I will see you in Java class}";

        //String sms = "Sender: James Bond. From Number: 202-123-3456]. + Message: I love programming and problem solving";
        // susbstring( sms.indexOf(" ") + 1, sms.indexOf(".") )
        // susbstring( sms.indexOf("Number:") + 7, sms.lastIndexOf(".") )
        // susbstring( sms.lastIndexOf(":") +2 )



        // substring(); -- > to get the portion of the String
        // substring(StartIndex);
        // substring(startIndex, EndIndex);

        String namePart = sms.substring(  sms.indexOf("<") + 1, sms.indexOf(">")  );
        String phonePart = sms.substring(  sms.indexOf("[") + 1, sms.indexOf("]")  );
        String messagePart = sms.substring(  sms.indexOf("{") + 1, sms.indexOf("}")  );

        System.out.println("These are the info:");
        System.out.println("\t" + namePart);
        System.out.println("\t" + phonePart);
        System.out.println("\t" + messagePart);


    }
}


/*
    String str = "Receipt: Macbook $9000";

    Extract the price:
        str.substring(  str.indexOf("$")  ); ---- > $9000
 */