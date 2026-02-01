import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] words = {"pokemon"};
        String[] words = {"aurelio", "goku", "ruby", "vitor", "lindo", "day", "sun", "ultra", "minecraft"};

        // generate a random word
        String word = randomItem(words);
        System.out.println("Word: " + word);
        // word in array
        char[] letters = new char[word.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = word.charAt(i);
        }
        // array of letters corrects
        Character[] correctLetters = new Character[letters.length];
        // while | game
//        System.out.println(Arrays.toString(correctLetters));
        boolean gameRunning = false;
        while (!gameRunning) {
            System.out.println(showArrayFormatted(correctLetters));

            System.out.println("Enter a letter: ");
            char guessedChar = scanner.next().toLowerCase().charAt(0);

            if (!addLetterToCorrects(letters, correctLetters, guessedChar)) {
                System.out.println("You lose");
                gameRunning = true;
            }

            if (!hasUndiscoveredLetters(correctLetters)) {
                System.out.println(showArrayFormatted(correctLetters));
                System.out.println("You win");
                gameRunning = true;
            }
        }
        scanner.close();
    }

    public static boolean hasUndiscoveredLetters(Character[] array) {
        for (Character c : array) {
            if (c == null) {
                return true;
            }
        }

        return false;
    }

    public static String showArrayFormatted(Character[] correctLetters){
        StringBuilder text = new StringBuilder();
        text.append("[ ");
        for (Character s : correctLetters) {
            if (s == null) {
                text.append("_ ");
            } else {
                text.append(s).append(" ");
            }
        }
        text.append("]");

        return text.toString();
    }

    public static boolean addLetterToCorrects(char[] letters, Character[] correctLetters, char letter) {
        boolean exist = false;
        int index = 0;
        for (char s : letters) {
            if (s == letter) {
                correctLetters[index] = letter;
                exist = true;
            }
            index ++;
        }
        return exist;
    }

    public static String randomItem(String[] array) {
        int randomIndex = (int) (Math.random() * (array.length));
        return array[randomIndex];
    }
}