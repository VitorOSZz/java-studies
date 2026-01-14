import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the name of Person 1");
        String name_person1 = scanner.next();

        System.out.println("Insert the age of Person 1");
        int age_person1 = scanner.nextInt();

        System.out.println("Insert the name of Person 2");
        String name_person2 = scanner.next();

        System.out.println("Insert the age of Person 2");
        int age_person2 = scanner.nextInt();

        float average_age = (float) (age_person1 + age_person2) /2;
        System.out.println("The average age between " + name_person1 + " and " + name_person2 + " is: " + average_age );
    }
}