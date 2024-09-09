public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        LoginManager loginManager = LoginManager.getInstance();

        // Attempt to view balance without logging in
        loginManager.viewBalance();

        // Log in the user
        loginManager.login("admin", "admin123");

        // Perform banking operations
        loginManager.viewBalance();
        loginManager.deposit(500);
        loginManager.withdraw(200);

        // Log out the user
        loginManager.logout();
    }
}
