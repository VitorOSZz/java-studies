import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many cases of tests will be digitized: ");
        int times = scanner.nextInt();

        int total_quantity = 0;

        int rats = 0;
        int frog = 0;
        int bunny = 0;

        for (int i = 0; i < times; i++) {
            System.out.print("Quantity of this animal: ");
            int quantity = scanner.nextInt();
            System.out.print("Type of animal: ");
            String animal = scanner.next();

            total_quantity += quantity;

            switch (animal.toUpperCase()) {
                case "R":
                    rats += quantity;
                    break;
                case "F":
                    frog += quantity;
                    break;
                case "B":
                    bunny += quantity;
                    break;
            }
        }
        System.out.println();
        System.out.println("Result");
        System.out.println();

        System.out.println("Total: " + total_quantity);
        System.out.println("Bunny: " + bunny);
        System.out.println("Rats: " + rats);
        System.out.println("Frog: " + frog);

        System.out.println("Percent of Bunny: " + String.format("%.2f",((float)bunny/total_quantity)*100));
        System.out.println("Percent of Rats: " + String.format("%.2f",((float)rats/total_quantity)*100));
        System.out.println("Percent of Frog: " + String.format("%.2f",((float)frog/total_quantity)*100));
    }
}