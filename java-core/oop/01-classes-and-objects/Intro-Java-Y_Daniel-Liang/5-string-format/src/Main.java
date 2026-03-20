import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        final String STRING_DESIGN = "|%-6s|%4d|";
        final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0." + "#".repeat(2) + "#");

        String s = STRING_DESIGN.formatted(45.556, 14);

        System.out.printf((STRING_DESIGN) + "%n", DECIMAL_FORMAT.format(45.556), 14);
        System.out.printf((STRING_DESIGN) + "%n", DECIMAL_FORMAT.format(10.5), 28);
        System.out.printf((STRING_DESIGN) + "%n", DECIMAL_FORMAT.format(59.9976), 42);
        System.out.printf((STRING_DESIGN) + "%n", DECIMAL_FORMAT.format(70.55999999996), 56);

//        System.out.println(s);
    }
}