import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Register");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        int age;
        try {
            try {
                System.out.print("Age: ");
                age = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                throw e;
            }
        } catch (InputMismatchException e) {
            System.out.println("Try inside another try");
            throw e;
        }


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