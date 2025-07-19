package day33_b_encapsulation.login;

public class UseLogin {
    public static void main(String[] args) {
        Login user1 = new Login("loopcamp", "hello!@12345");
        System.out.println(user1);

        // Sometimes, in code, we want to limit the direct access to specific members
        // That is when we use ENCAPSULATION - data hiding
        //user1.password = "varlsr";
        //user1.username = "Loop";
        //System.out.println(user1);

        // Even-though I hid members, I want to give indirect access.
        // GETTERS and SETTERS

        // Give me the password for user1
        // System.out.println(user1.password); // DO NOT HAVE direct access.

        System.out.println(  user1.getPassword("loop") );
        System.out.println(  user1.getPassword("loopcamp") );

        // Set a new password for user1
        // user1.password = "234gfsdfgs@#";  // DO NOT HAVE direct access

        System.out.println("---------------------------------------");
        user1.setPassword("loop", "234gfsdfgs@#");
        System.out.println(user1.getPassword("loopcamp"));

        System.out.println("---------------------------------------");
        user1.setPassword("loopcamp", "234gfsdfgs@#");
        System.out.println(user1.getPassword("loopcamp"));
    }
}
