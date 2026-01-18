import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight: ");
        float weight = scanner.nextFloat();
        System.out.print("Enter height: ");
        float height = scanner.nextFloat();

        System.out.println("Result of IMC: " + imc(weight, height));
    }

    public static String imc(float weight, float height) {
        String classification = "";

        float imc = (float) (weight/(Math.pow(height, 2)));

        if (imc > 30) {
            classification = "obese";
        } else if (imc >= 25) {
            classification = "overweight";
        } else if (imc >= 20) {
            classification = "normal";
        } else {
            classification = "underweight";
        }

        return classification;
    }
}