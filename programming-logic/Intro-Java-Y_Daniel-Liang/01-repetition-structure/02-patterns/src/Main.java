public class Main {
    public static void main(String[] args) {
        int size = 6;
        // Head line
//        System.out.print("|");
        String text = justifyCenter("Pattern A ", (size*2-1));
        text += justifyCenter("Pattern B ", (size*2+3));
        text += justifyCenter("Pattern C ", (size*2));
        text += justifyCenter("Pattern D ", (size*2));
        System.out.println(text);
//      System.out.println("|");

        for (int i = 1; i < size+1; i++) {
            StringBuilder line = new StringBuilder();

            // Pattern A
            StringBuilder lineA = new StringBuilder();
            for (int j = 0; j < i; j++) {
                lineA.append(j + 1).append(" ");
            }
            line.append(addSpace(String.valueOf(lineA), size*2+2));

            // Pattern B
            StringBuilder lineB = new StringBuilder();
            for (int j = 0; j < size; j++) {
                lineB.append(j + 1).append(" ");
            }
            if (i > 1) {
                lineB.delete(lineB.length()-((i-1)*2), lineB.length()-1);
            }
            line.append(addSpace(String.valueOf(lineB), size*2+2));

            // Pattern C
            // I wanted to create myReverse for learning instead of use StringBuilder.reverse()
            line.append(justifyRight(String.valueOf(myReverse(lineA)), size*2+2));

            // Pattern D
            line.append(justifyRight(String.valueOf(lineB), size*2+3));
            System.out.println(line);
        }

    }

    public static String justifyCenter(String text, int size) {
        StringBuilder textBuilder = new StringBuilder();

        if (text.length() < size) {
            int extraSize = size-text.length();
            textBuilder.append(" ".repeat(extraSize/2)).append(text).append(" ".repeat(extraSize));
            text = String.valueOf(textBuilder);
        }


        return text;
    }

    public static String addSpace(String text, int size) {
        StringBuilder textBuilder = new StringBuilder();

        if (size > text.length()) {
            textBuilder.append(text);
            textBuilder.append(" ".repeat((size-1-text.length())));
        }
        text = String.valueOf(textBuilder);

        return text;
    }
    public static String justifyRight(String text, int size) {
        StringBuilder textBuilder = new StringBuilder();

        if (size > text.length()) {
            textBuilder.append(" ".repeat((size-1-text.length())));
            textBuilder.append(text);
        }
        text = String.valueOf(textBuilder);

        return text;
    }
    public static StringBuilder myReverse(StringBuilder lineC) {

        int lineCSize = lineC.length();
        for (int i = 0; i < lineCSize/2; i++) {
            char first = lineC.charAt(i);
            char last = lineC.charAt(lineCSize-1-i);

            lineC.setCharAt(i, last);
            lineC.setCharAt(lineCSize-1-i, first);
        }
        return lineC;
    }
}