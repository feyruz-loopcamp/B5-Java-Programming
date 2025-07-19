package day33_b_encapsulation.login;
// Custom Class
public class Login {
    // Instance variables
    private String username;
    private String password;

    // Constructor

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // GETTER method for password - giving you indirect access
    public String getPassword (String username) {
        if (username.equalsIgnoreCase(this.username)){
            return password;
        } else {
            return "Invalid Username";
        }
    }

    // SETTER method for password - giving you indirect access
    public void setPassword (String username, String newPassword){
        if (username.equalsIgnoreCase(this.username)){
            password = newPassword;
        }
    }


    public String toString() {
        return "Login { " +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                " }";
    }
}
