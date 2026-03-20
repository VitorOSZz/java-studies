import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String CELLPHONE_REGEX = "^\\+?55 ?(\\([0-9]{2}\\)|[0-9]{2}) ?9[0-9]{4}-?[0-9]{4}$";

        final String LANDLINE_REGEX = "^\\+?55 ?(\\([0-9]{2}\\)|[0-9]{2}) ?[2-5][0-9]{3}-[0-9]{4}$";

        Scanner input = new Scanner(System.in);

        System.out.print("Digit your Brazilian number: ");
        String brazilianNumber = input.nextLine();

        if (brazilianNumber.matches(CELLPHONE_REGEX)) {
            System.out.println("It's a Brazilian cellphone number.");
        }
        else if (brazilianNumber.matches(LANDLINE_REGEX)) {
            System.out.println("It's a Brazilian landline number.");
        }
        else {
            System.out.println("It's not a valid Brazilian phone number.");
        }

        input.close();
    }
}