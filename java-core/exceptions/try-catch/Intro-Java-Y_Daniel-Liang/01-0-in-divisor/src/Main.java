import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//         ArithmeticException
//        System.out.println(divide(3,0));

        try {
            System.out.println(divide(3,0));
        }  catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            System.out.println("the code continues");
        }

        System.out.println("End");
    }

    public static int divide(int dividend, int divisor) {
        return dividend /divisor;
    }
}