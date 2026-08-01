import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File lyrics = new File("lyrics.txt");
        Scanner inputLyrics = new Scanner(lyrics);

        File lyricsCopy = new File("lyricsCopy.txt");
        PrintWriter outputCopy = new PrintWriter(lyricsCopy);
        StringBuilder text = new StringBuilder();

        while ( inputLyrics.hasNextLine() ) {
            text.append(inputLyrics.nextLine()).append("\n");
        }

        text = new StringBuilder(text.toString().replaceAll("louca", "biru teteia"));
        outputCopy.println(text);

        outputCopy.close();
    }
}