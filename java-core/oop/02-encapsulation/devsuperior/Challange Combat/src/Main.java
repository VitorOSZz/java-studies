import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data of first Champion");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("HP: ");
        int hp = scanner.nextInt();
        System.out.print("Attack: ");
        int attack = scanner.nextInt();
        System.out.print("Armor: ");
        int armor = scanner.nextInt();
        Champion firstChampion = new Champion(name, hp, attack, armor);

        System.out.println();

        System.out.println("Enter data of second Champion");
        System.out.print("Name: ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("HP: ");
        hp = scanner.nextInt();
        System.out.print("Attack: ");
        attack = scanner.nextInt();
        System.out.print("Armor: ");
        armor = scanner.nextInt();
        Champion secondChampion = new Champion(name, hp, attack, armor);

        System.out.println("How many turns you want to play: ");
        int turns = scanner.nextInt();

        for (int i = 0; i < turns; i++) {
            System.out.println("Result of " + (i+1) + "th turn.");

            firstChampion.takeDamage(secondChampion);
            secondChampion.takeDamage(firstChampion);

            System.out.print(firstChampion.status());

            System.out.println();
            System.out.print(secondChampion.status());
            System.out.println();

            if (firstChampion.getLife() <= 0 || secondChampion.getLife() <= 0) {
                break;
            }

        }

        System.out.println("End.");
    }
}