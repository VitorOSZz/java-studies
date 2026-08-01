import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        File vitor = new File("vitor.txt");
        System.out.println("Vitor: " + vitor.exists());

        StringBuilder text = new StringBuilder();
        try  {
            Scanner input = new Scanner(vitor);
            while (input.hasNextLine()) {
                text.append(input.nextLine()).append("\n");
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            PrintWriter output = new PrintWriter(vitor);
            output.print(text);
            output.println("Hello World");

            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}