import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the measure of glucose: ");
        float glucose = scanner.nextFloat();

        String glucose_classification = "normal";
        if (glucose> 140 ) {
            glucose_classification = "diabetes";
        } else if (glucose>100) {
            glucose_classification = "high";
        }
        System.out.println("Classification: " + glucose_classification);
    }
}