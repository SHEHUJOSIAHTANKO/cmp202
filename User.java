public class User {
    String username = "Josiah" ;
    String password = "Pass" ;
    String login() {
        if (username.equals("Josiah") && password.equals("Pass")) {
            return "Logged in" ;
        } else {
            return "Failed" ;
        }
    }
    public static void main(String[]args) {
        User John = new User() ;
        System.out.println(John.login()) ;
    }
}
