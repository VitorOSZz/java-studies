import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(displayPattern(3));
    }

    public static String displayPattern(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < number; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < i+1; j++) {
                line.append(j+1).append(" ");
            }
            stringBuilder.append("-" + justifyRight(String.valueOf(line), (number+1)*2));
            if (!(i == number-1)) {
                stringBuilder.append("\n");
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static String justifyRight(String text, int digits) {
        int spaces = 0;
        if (digits-text.length() > 0) {
            spaces = digits-text.length();
        }

        return " ".repeat(spaces) + text;
    }
}