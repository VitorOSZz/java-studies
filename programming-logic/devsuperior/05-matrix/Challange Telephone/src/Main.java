import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many clients will be inserted: ");
        int number_clients = scanner.nextInt();

        String[] names = new String[number_clients];
        String[] telephones = new String[number_clients];
        int[] types = new int[number_clients];
        int[] minutes = new int[number_clients];

        for (int i = 0; i < number_clients; i++) {
            System.out.println("-Data of " + (i+1) + "th client");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Telephone: ");
            String telephone = scanner.nextLine();

            System.out.print("Type: ");
            int type = scanner.nextInt();

            System.out.print("Minutes: ");
            int minute = scanner.nextInt();

            names[i] = name;
            telephones[i] = telephone;
            types[i] = type;
            minutes[i] = minute;
        }

        float[][] prices = new float[3][2];

        System.out.println("Enter the basic price and price of extra minutes: ");

        for (int i = 0; i < 3; i++) {
            System.out.println("Type " + i);
            System.out.print("Basic Price: ");
            prices[i][0] = scanner.nextFloat();

            System.out.print("Extra minutes: ");
            prices[i][1] = scanner.nextFloat();
        }

        System.out.println("Result.");

        for (int i = 0; i < number_clients; i++) {

            float bill = prices[types[i]][0];
            if (minutes[i] > 90) {
                float extra = (minutes[i]-90) * prices[types[i]][1];
                bill = bill + extra;
            }
            String bill_Formated = String.format("%.2f", bill);


            String client = names[i] + ", " + telephones[i] + ", " + types[i] + ", Minutes: " + minutes[i] + ", Bill $ " + bill_Formated;
            System.out.println(client);
        }
    }
}