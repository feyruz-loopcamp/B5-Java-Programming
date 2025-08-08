package day41_collection.except_account;
// Custom Class
public class Account {
    double balance;

    public Account(double balance) {
        //this.balance = balance;
        //setBalance(balance);
        if (balance > 0) {
            this.balance = balance;
        }
    }


    public void withdraw (double amount) {
        if (amount <= balance){
            balance -= amount; // balance = balance - amount;
        } else {
            //System.out.println("Not enough money. Balance only has $" + balance);
            //throw new RuntimeException("Not enough money. Balance only has $" + balance);
            throw new NotEnoughBalanceException("Not enough money. Balance only has $" + balance);
        }
    }


    public void login (String username, String password) throws InvalidCredentialsException {

        if (!username.equalsIgnoreCase("Loopcamp")){
            //System.out.println("Invalid Username!");
            //throw new Exception("Invalid Username!");
            throw new InvalidCredentialsException("Invalid Username!");
        } else {
            System.out.println("Username is correct!");
        }


        if (!password.equals("Test1234")){
            //System.out.println("Invalid Password!");
            //throw new Exception("Invalid Password!");
            throw new InvalidCredentialsException("Invalid Password!");
        } else  {
            System.out.println("Password is correct!");
        }

    }





}


