public class User_Enc_Q4 {

    // private attributes
    private String username;
    private String password;
    private String email;

    public User_Enc_Q4(String username, String password, String email) {

        this.username = username;
        this.password = password;
        this.email = email;
    }

    // getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("length must be 8 letters..");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // display

    public void displayMethods() {

        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);
    }

    public static void main(String[] args) {
        User_Enc_Q4 user = new User_Enc_Q4("Akash Athawale", "12345678", "AkashAthawale1212gmail.com");
        user.displayMethods();

        System.out.println("-----------------------------------------------------------------------------------");

        user.setPassword("1234");
        user.displayMethods();
    }

}
