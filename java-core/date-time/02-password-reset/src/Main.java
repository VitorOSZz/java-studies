import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User vitor = new User("Vitor", "Password");
        System.out.println(vitor.getName() + " enter your password");
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (vitor.isPasswordEqual(password)) {
            System.out.println("Success");
        } else {
            System.out.println("Do you want to reset your password?");
            System.out.println("Y: Yes");
            System.out.println("N: No");
            String letter = String.valueOf(scanner.next().charAt(0)).toUpperCase();
            if (letter.equals("Y")) {
                PasswordResetToken passwordResetToken = new PasswordResetToken();
                System.out.println("You have te reset password token: " + passwordResetToken.getToken());
                System.out.println("You have 15 minutes.");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                System.out.println();
                System.out.println("This token was generated on: " + formatter.format(LocalDateTime.ofInstant(passwordResetToken.getCreatedAt(), ZoneId.systemDefault())));
                System.out.println("This token ends on: " + formatter.format(LocalDateTime.ofInstant(passwordResetToken.getExpiresAt(), ZoneId.systemDefault())));
            }
        }

    }
}