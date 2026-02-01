public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("321 inverse: " + inverse(321) +", is palindrome: " + isPalindrome(321));
        System.out.println("752 inverse: " + inverse(752) +", is palindrome: " + isPalindrome(752));
        System.out.println("1001 inverse: " + inverse(1001) +", is palindrome: " + isPalindrome(1001));
    }

    public static int inverse(int number) {
        String stringNumber = String.valueOf(number);
        StringBuilder palindrome = new StringBuilder();

        for (int i = stringNumber.length(); i > 0; i--) {
//            System.out.println(stringNumber.charAt(i-1));
            palindrome.append(stringNumber.charAt(i-1));
        }

        return Integer.parseInt(String.valueOf(palindrome));
    }

    public static boolean isPalindrome(int number) {
        return (inverse(number) == number);
    }
}