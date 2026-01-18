import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Measure of Glucose: ");
        float glucose = scanner.nextFloat();
        System.out.println("Classification: " + glucose(glucose));
        System.out.println("Measure of Triglycerides: ");
        float triglycerides = scanner.nextFloat();
        System.out.println("Classification: " + triglycerides(triglycerides));
        System.out.println("Measure of Cholesterol: ");
        float cholesterol = scanner.nextFloat();
        System.out.println("Classification: " + cholesterol(cholesterol));
    }

    public static String triglycerides(float triglycerides) {
        String value = "";
        if (triglycerides > 200) {
            value = "Increased";
        } else {
            value = "Desirable";
        }
        return value;
    }

    public static String glucose(float glucose) {
        String value = "";
        if (glucose > 140) {
            value = "Diabetes";
        } else if (glucose > 100) {
            value = "High";
        } else if (glucose <= 100) {
            value = "Normal";
        }
        return value;
    }

    public static String cholesterol(float cholesterol) {
        String value = "";
        if (cholesterol > 240) {
            value = "High";
        } else if (cholesterol > 200) {
            value = "Threshold";
        } else if (cholesterol <= 200) {
            value = "Desirable";
        }
        return value;
    }
}