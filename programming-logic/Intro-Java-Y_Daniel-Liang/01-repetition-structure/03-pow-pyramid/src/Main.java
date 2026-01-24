public class Main {
    public static void main(String[] args) {

        int lines = 8;

        for (int i = 1; i <= lines; i++) {
            StringBuilder line = new StringBuilder();

            if (i == 1) {
                line.append(i);
            } else {
                for (int j = 1; j <= (i-1); j++) {
                    if (j > 2) {
                        line.append((int) Math.pow(2, j - 1)).append(" ");
                    } else {
                        line.append(j).append(" ");
                    }
                }
                line.append((int) Math.pow(2, i - 1)).append(" ");
                for (int j = (i-1); j > 0; j--) {
                    line.append((int) Math.pow(2, j - 1)).append(" ");
                }
            }


            // 2 1
            // 3 2

            System.out.println(justifyCenter(String.valueOf(line), lines*8));
        }

    }

    public static String justifyCenter (String text, int size) {

        if (size > text.length()) {
            int extraSpace = size - text.length();
            text = (" ".repeat(extraSpace/2) + text + (" ".repeat(extraSpace/2)));
        }

        return text;
    }
}