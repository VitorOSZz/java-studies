import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many person you will digit: ");
        int times = scanner.nextInt();

        String[] names = new String[times];
        int[] ages = new int[times];
        for (int i = 0; i < times; i++) {
            System.out.println("-Data of " + (i+1) + "th person:");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Years old: ");
            int age = scanner.nextInt();

            names[i] = name;
            ages[i] = age;
        }

        int index = 0;
        int index_older = 0;
        int older = 0;
        for (int i : ages) {
            if (Math.max(i, older) == i) {
                older = i;
                index_older = index;
            }
            index++;
        }
        System.out.println("Person older is: " + names[index_older]);
    }
}