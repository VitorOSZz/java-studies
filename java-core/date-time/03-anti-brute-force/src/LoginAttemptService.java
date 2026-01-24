import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LoginAttemptService {
    private String password;
    private List<LoginAttempt> loginAttemptList = new ArrayList<>();

    public LoginAttemptService(String password) {
        this.password = password;
    }

    private boolean canTryLogin() {
        if (loginAttemptList.size() > 5) {
            return this.loginAttemptList.get(loginAttemptList.size() - 5).getAttemptTime().isBefore(LocalDateTime.now().minusMinutes(10));
        }
        return true;
    }

    public boolean tryLogin(LoginAttempt attempt, String password) {
        loginAttemptList.add(attempt);
        if (canTryLogin()) {
            if (password.equals(this.password)) {
                return true;
            }
        }

        return false;
    }

    public List<LoginAttempt> getLoginAttemptList() {
        return List.copyOf(loginAttemptList);
    }
}
