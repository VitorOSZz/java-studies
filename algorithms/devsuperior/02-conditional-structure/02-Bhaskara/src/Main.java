import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coefficient A: ");
        float coefficient_A = scanner.nextFloat();
        System.out.print("Coefficient B: ");
        float coefficient_B = scanner.nextFloat();
        System.out.print("Coefficient C: ");
        float coefficient_C = scanner.nextFloat();

        float  X1 = bhaskara(coefficient_A, coefficient_B, coefficient_C, true);
        float X2 = bhaskara(coefficient_A, coefficient_B, coefficient_C, false);

        if (Float.isNaN(X1)) {
            System.out.println("This equation dont have roots.");
        } else {
            System.out.println("X1 =  " + X1);
            System.out.println("X2 =  " + X2);
        }

    }

    public static float bhaskara(float coeA,float coeB,float coeC ,boolean signal) {

        float delta = (float) ((coeB*coeB)-(4*coeA*coeC));
        float value = 0;
        if (signal) {
            value = (float) ((-coeB+Math.sqrt(delta))/(2*coeA));
        } else {
            value = (float) ((-coeB-Math.sqrt(delta))/(2*coeA));
        }
        return value;
    }
}