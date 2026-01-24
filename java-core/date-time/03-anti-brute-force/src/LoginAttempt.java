import java.time.LocalDateTime;

public class LoginAttempt {

    private final LocalDateTime attemptTime;

    public LoginAttempt() {
        this.attemptTime = LocalDateTime.now();
    }

    public LoginAttempt(LocalDateTime time) {
        this.attemptTime = time;
    }

    public LocalDateTime getAttemptTime() {
        return attemptTime;
    }
}
