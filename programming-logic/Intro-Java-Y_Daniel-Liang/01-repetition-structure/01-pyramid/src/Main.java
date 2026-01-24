import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter how many lines will have the pyramid.");

        int times = 7;
        for (int i = 1; i < times; i++) {
            StringBuilder line = new StringBuilder();

            for (int j = i-1; j >= 0; j--) {
                line.append((j + 1)).append(" ");
            }
            for (int j = 0; j < i-1; j++) {
                line.append((j + 2)).append(" ");
            }
            System.out.println(justifyMiddle(String.valueOf(line), 25));
        }
    }

    public static String justifyMiddle(String text, int size) {
        String newText = "";

        if ((text.length()-1) >= size) {
            newText = text;
        } else if ((text.length()-1) < size) {
            int extraSize = size-(text.length()-1);
            String space = " ";
            newText = space.repeat(extraSize/2) + text + space.repeat(extraSize/2);
        }
        return newText;
    }
}