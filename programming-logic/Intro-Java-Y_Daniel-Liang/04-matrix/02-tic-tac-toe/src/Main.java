import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character [][] fullTictactoe = new Character[3][3];

        boolean running = false;
        while (!running) {

            // Round X
            insertAnswer(scanner, 'X', fullTictactoe);
            // Check if a player have won
            running = playerHasWon('X', fullTictactoe);
            if (running) {
                System.out.println(getTicTacToeText(fullTictactoe));
                System.out.println("Player X Won.");
                break;
            }

            // Round O
            insertAnswer(scanner, 'O', fullTictactoe);
            running = playerHasWon('O', fullTictactoe);
            if (running) {
                System.out.println(getTicTacToeText(fullTictactoe));
                System.out.println("Player O Won.");
                break;
            }
        }
    }

    public static boolean playerHasWon(char player, Character[][] fullTictactoe) {
        // Column

        boolean[] columnValues = new boolean[3];

        for (int i = 0; i < fullTictactoe.length; i++) {
            for (int j = 0; j < fullTictactoe.length; j++) {
                Character[] characterArray = fullTictactoe[j];

//                System.out.println("Column: " + Arrays.toString(characterArray));

                if (characterArray[i] != null) {
                    columnValues[j] = (characterArray[i] == player);
                } else {
                    columnValues[j] = false;
                }
            }
//            System.out.println("Column Values" + Arrays.toString(columnValues));
            // Check if a player have won and print
            boolean won = true;
            for (boolean b : columnValues) {
                if (!b) {
                    won = false;
                }
            }
            if (won) {
                return true;
            }
        }

        // Row

        boolean[] rowBoolean = new boolean[3];

        for (int i = 0; i < fullTictactoe.length; i++) {
            Character[] characterArray = fullTictactoe[i];

            for (int j = 0; j < characterArray.length; j++) {
                if (characterArray[j] != null) {
                    rowBoolean[j] = (characterArray[j] == player);
                } else {
                    rowBoolean[j] = false;
                }
            }

//            System.out.println(Arrays.toString(characterArray));
//            System.out.println(Arrays.toString(rowBoolean));
            // Check if a player have won and print
            boolean won = true;
            for (boolean b : rowBoolean) {
                if (!b) {
                    won = false;
                }
            }
            if (won) {
                return true;
            }
        }

        // Diagonal

        // Right Diagonal
        boolean[] rightDiagonal = new boolean[3];
        int y = 2;
        for (int x = 0; x < 3; x++) {
//            System.out.println("x:" + x + " y:"+ y + " " + fullTictactoe[y][x]);
            if (fullTictactoe[y][x] != null) {
                rightDiagonal[x] = (fullTictactoe[y][x] == player);
            }

            y-=1;
        }

//        System.out.println(Arrays.toString(rightDiagonal));
        // Check if a player have won and print
        boolean won = true;
        for (boolean b : rightDiagonal) {
            if (!b) {
                won = false;
            }
        }
        if (won) {
                return true;
        }

        // Left Diagonal
        boolean[] leftDiagonal = new boolean[3];
        for (int i = 0; i < 3; i++) {
            if (fullTictactoe[i][i] != null) {
                leftDiagonal[i] = (fullTictactoe[i][i] == player);
            }
        }

//        System.out.println(Arrays.toString(leftDiagonal));
        // Check if a player have won and print
        won = true;
        for (boolean b : leftDiagonal) {
            if (!b) {
                won = false;
            }
        }
        if (won) {
                return true;
        }
        return false;
    }

    public static void insertAnswer(Scanner scanner, char player, Character[][] fullTictactoe) {
        boolean answered = false;
        int rowAnswer, columnAnswer;

        while (!answered) {
            System.out.println(getTicTacToeText(fullTictactoe));

            System.out.print("Enter a row (1, 2, or 3) for player " + player + ": ");
            rowAnswer = scanner.nextInt()-1;
            System.out.print("Enter a column (1, 2, or 3) for player " + player + ": ");
            columnAnswer = scanner.nextInt()-1;

            if (fullTictactoe[rowAnswer][columnAnswer] == null) {
                fullTictactoe[rowAnswer][columnAnswer] = player;
                answered = true;
            } else {
                System.out.println("This coordinate already putted");
            }
        }



    }
    public static String getTicTacToeText(Character[][] tictactoe) {
        StringBuilder text = new StringBuilder();

        for (Character[] sArray : tictactoe) {
            text.append("|");
            for (Character s : sArray) {
                text.append(" ");
                if (s == null) {
                    text.append("-");
                } else {
                    text.append(s);
                }
                text.append(" |");
            }
            text.append("\n");
        }

        return text.toString();
    }
}