import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        /*
        with BigDecimal and BigInteger we can "break" some limits of Java/Computer Science
        like 0.1+0.2 != 0.3 and a max value in int numbers
         */

        double a = 0.1d + 0.2d;
        System.out.printf("Working with doubles : a = 0.1d + 0.2d = %.17f\n", a);

        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = new BigDecimal("0.2");
        BigDecimal d = new BigDecimal(String.valueOf(b.add(c)));
        System.out.println("Working with BigDecimal : b = \"0.1\" + c = \"0.2\" + d = String.valueOf(b.add(c))");
        System.out.println("d = " + d);

        BigInteger maxInteger = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        BigInteger b2 = new BigInteger("23233");

        System.out.println("maxInteger = " + maxInteger);
        System.out.println("b2 = " + b2);
        System.out.println("maxInteger + b2 = " + maxInteger.add(b2));
    }

}