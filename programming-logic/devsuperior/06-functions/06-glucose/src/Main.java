import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of glucose: ");
        float glucose = scanner.nextFloat();

        System.out.println("Classification: " + glucose(glucose));
    }

    public static String glucose(float glucose) {
        if (glucose > 140) {
            return "Diabetes";
        } else if (glucose > 100 && glucose <= 140) {
            return "High";
        } else {
            return "Normal";
        }
    }
}