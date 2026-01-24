import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LoginAttemptService loginAttemptService = new LoginAttemptService("20");
        LoginAttempt loginAttempt = new LoginAttempt();
        LoginAttempt loginAttemptMock = new LoginAttempt(LocalDateTime.now().minusMinutes(11));


        System.out.println(loginAttemptService.tryLogin(loginAttempt, "10"));
        System.out.println(loginAttemptService.tryLogin(loginAttempt, "20"));
        for (int i = 0; i < 3; i++) {
            loginAttemptService.tryLogin(loginAttempt, "10");
        }
        for (int i = 0; i < 4; i++) {
            loginAttemptService.tryLogin(loginAttemptMock, "10");
        }
        System.out.println("Correct after 5 times: ");
        System.out.print(loginAttemptService.tryLogin(loginAttempt, "20"));
    }
}