public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        for (int i = 0; i < 100; i++) {
            System.out.println(pentagonalNumber(i));
        }
    }

    public static int pentagonalNumber(int i) {
        return (i*(3*i-1))/2;
    }
}
