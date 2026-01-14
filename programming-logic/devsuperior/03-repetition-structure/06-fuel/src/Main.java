import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 = Alcohol");
        System.out.println("2 = Gasoline");
        System.out.println("3 = Diesel");

        System.out.println();

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        int code = 0;
        while (code !=4) {
            System.out.print("Enter the code (1,2,3) or 4 to stop: ");
            code = scanner.nextInt();

            switch (code) {
                case 1:
                    alcohol +=1;
                    break;
                case 2:
                    gasoline +=1;
                    break;
                case 3:
                    diesel +=1;
                    break;
            }
        }

        System.out.println("Thanks");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}