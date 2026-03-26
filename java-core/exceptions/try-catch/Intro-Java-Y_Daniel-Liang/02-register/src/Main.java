import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Register");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        List<Person> people = new ArrayList<>();
        try {
            Person person = new Person(name, age);
            people.add(person);
        } catch (Exception e) {
            System.out.println("Invalid input:");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Person's registered: " + people);
        }

        System.out.println("End");
    }
}