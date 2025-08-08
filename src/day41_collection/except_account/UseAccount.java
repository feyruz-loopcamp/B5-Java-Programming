package day41_collection.except_account;
// Runner Class
public class UseAccount {
    public static void main(String[] args) {

        Account acc = new Account(100);
        System.out.println(acc.balance);

        try {
            acc.withdraw(150);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        System.out.println("----------------------------------");


        // We have two options:
        // 1 - Either Handle with try/catch
        // 2 - or declare it in again method signature
        try{
            acc.login("loopcamp", "Test1234");
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("NO matter what this will always run");
            System.out.println("But this is optional");
        }


        System.out.println("END...");
    }
}
