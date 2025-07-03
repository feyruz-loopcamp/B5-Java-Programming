package day25_methods;
/*
create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

    Use the following information to convert from given dollars to the desired currency type

    1 dollar = 0.85 euro
    1 dollar = 143.52 yene
    1 dollar = 39.89 lira
    1 dollar = 1,356.47 won
    1 dollar = 85.70 rupee

    Note: Don't worry about decimal formats, focus on method

    Ex:
        Input:
            euro, 100

        Output:
            91

    Ex:
        Input:
            yen, 50

        Output:
            6051.5
 */
public class CurrencyConverter {

    //method will accept a currency type(String) and a currency amount (double)[as dollars]
    public static double convertCurrency (String currencyType, double currencyAmountInDollar) {

        double euroRate = 0.85;
        double yenRate = 143.52;
        double liraRate = 39.89;
        double wonRate = 1_356.479;
        double rupeeRate = 85.70;

        double result = 0;


        switch (currencyType.toLowerCase()){
            case "euro":
                result = euroRate * currencyAmountInDollar;
                break;
            case "yen":
                result = yenRate * currencyAmountInDollar;
                break;
            case "lira":
                result = liraRate * currencyAmountInDollar;
                break;
            case "won":
                result = wonRate * currencyAmountInDollar;
                break;
            case "rupee":
                result = rupeeRate * currencyAmountInDollar;
                break;
            default:
                result = -1.0;
        }

        return result;
    }


    public static void main(String[] args) {

        double dollarToEuro = convertCurrency("euro", 100); // calculate and return the conversion
        System.out.println(dollarToEuro);

        System.out.println( convertCurrency("yen", 100) );

        double dollarToLira = convertCurrency("lira", 200);
        System.out.println("Dollar to Lira: " + dollarToLira);


        System.out.println( convertCurrency("Rupee", 100) );

    }
}
