package Assignment5.FinalAll;


public class BankUser implements SecurityCheck {
    private String username;
    private String password;

    public BankUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean verifyUser(String inputUsername, String inputPassword) {
        SecurityCheck.logAttempt(inputUsername);
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            System.out.println("User '" + inputUsername + "' verified successfully.");
            return true;
        } else {
            System.out.println("Verification failed for user '" + inputUsername + "'.");
            return false;
        }
    }
}
