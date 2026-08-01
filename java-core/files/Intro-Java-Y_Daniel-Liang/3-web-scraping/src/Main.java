import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = URI.create("https://vitoroszz.github.io/Html-Css/desafios/desafio%20016/").toURL();

        System.out.println(url);

        Scanner input = new Scanner(url.openStream());

        StringBuilder text = new StringBuilder();
        while (input.hasNextLine()) {
            text.append(input.nextLine()).append("\n");
        }

        System.out.println(text);
    }
}