public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Total: " + sumDigits(234));

        System.out.println("Total: " + sumDigits("234"));
    }

    public static int sumDigits(int number) {
        int total = 0;

        for (int i = 10; (number*10 / i) != 0; i*=10) {
            int numberExtracted = number%i;
            while (numberExtracted > 10) {
                numberExtracted /= 10;
            }
            total += numberExtracted;
        }
        return total;
    }

    public static int sumDigits(String stringNumber) {
        int total = 0;

        for (int i = 0; i < stringNumber.length(); i++) {
            total += stringNumber.charAt(i) - '0'; // - '0' to casting char to int
        }
        return total;
    }
}