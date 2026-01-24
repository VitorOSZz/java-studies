import java.security.SecureRandom;
import java.time.Instant;

public class PasswordResetToken {

    private final String token;
    private final Instant createdAt;
    private final Instant expiresAt;

    public PasswordResetToken() {
        this.token = generateToken();
        this.createdAt = Instant.now();
        this.expiresAt = Instant.now().plusSeconds(15*60L);
    }

    private String generateToken() {
        SecureRandom random = new SecureRandom();
        StringBuilder token = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            char x = (char) (random.nextInt(126-33) + 34);
            token.append(x);
        }
        return String.valueOf(token);
    }

    public String getToken() {
        return token;
    }

    public Instant getExpiresAt() {
        return expiresAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
    public boolean isExpired() {
        return Instant.now().isAfter(this.getExpiresAt());
    }
}
