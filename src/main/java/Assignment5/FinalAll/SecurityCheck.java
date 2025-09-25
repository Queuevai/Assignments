package Assignment5.FinalAll;


interface SecurityCheck {

    static void logAttempt(String user) {
        System.out.println("[SECURITY LOG] User '" + user + "' attempted login.");
    }

    default void showSecurityStatus() {
        System.out.println("Secure connection established.");
    }

    boolean verifyUser(String username, String password);
}
