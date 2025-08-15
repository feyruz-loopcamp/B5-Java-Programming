package day44_map_and_functions.enum_exampe;

public class UsingBrowser {
    public static void main(String[] args) {

        //Using enum CONSTANT
        Browsers browser = Browsers.CHROME;

        switch (browser) {
            case CHROME:
                System.out.println("Opening Chrome Browser...");
                break;
            case FIREFOX:
                System.out.println("Opening Firefox Browser...");
                break;
            case OPERA:
                System.out.println("Opening Opera Browser...");
                break;
            default:
                System.out.println("Opening other Browsers...");

        }

        // using regular class CONSTANT
        System.out.println(Test.BROWSER);
    }
}


