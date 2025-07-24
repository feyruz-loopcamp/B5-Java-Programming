package day34_b_encapsulation;

import my_util.StringUtil;

/*
    Debit card - custom classes + static

    Create a class for Debit Card that has the following instance variables:
        card number (long), holder name (String), card type (String), pin (int), and balance (double)

        static variables: account type (String) - debit
            -> Use static block to initialize account type

    */
    /*

        Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”

        Overload the constructor to take all of the instance variables. The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print “invalid card type”. Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

    */
public class DebitCard {
    //Instance Var
    private long cardNumber;
    String holderName;
    private String cardType;
    private int pin;
    double balance;


    // static variables:
    static String accountType;

    static  {
        accountType = "Debit";
    }


    // the card number, the card holder name, and the balance.
    // Constructor
    public DebitCard (long cardNumber, String holderName, double balance) {
        //this.cardNumber = cardNumber;  // The card number has to be 16 characters long to be a valid card number.
        //this.holderName = StringUtil.fixFormatForFullName(holderName); // Here we used the utility class to fix the format incase it is not in the right format
        this.holderName = holderName;
        this.balance = balance;
        setCardNumber(cardNumber);
    }

    // Constructor - overloaded
    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber, holderName, balance);
        //this.cardNumber = cardNumber;
        //this.holderName = holderName;
        //this.balance = balance;

        //this.cardType = cardType;  // the card type must be either MasterCard or Visa to be valid card type.
        setCardType(cardType);
        //this.pin = pin; // Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”
        setPin(pin);

    }

    // public SETTER with condition
    public void setCardNumber(long cardNumber) {
        if ( (cardNumber+"").length() == 16 )  {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid card number for " + holderName );
        }
    }

    // public SETTER with condition
    public void setCardType(String cardType) {
        if (cardType.equalsIgnoreCase("Master") || cardType.equalsIgnoreCase("Visa")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type");
        }
    }

    // public SETTER with condition
    public void setPin(int pin) {
        if ( (pin + "").length() == 4 ) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin length");
        }
    }


    public String toString() {
        return "DebitCard{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }
}
