import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[][] matrix = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},

                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},

                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        boolean[] allChecks = new boolean[3];
        // 01 pretending to have done the sudoku
        matrix = solveSudoku(matrix);
        // 02 Check all AllRows
        boolean allRows = true;
        for (int i = 0; i < 9; i++) {
//            System.out.println(i + "-Row: " + checkRow(matrix, i));
            if (!checkRow(matrix, i)) {
                allRows = false;
            }
        }
        // 03 Check all AllColumns
        boolean allColumns = true;
        for (int i = 0; i < 9; i++) {
//            System.out.println(i + "-Column: " + checkColumn(matrix, i));
            if (!checkColumn(matrix, i)) {
                allColumns = false;
            }
        }
        // 04 Check all Squares
        boolean allSquares = true;
        boolean[] squares = new boolean[9];
        for (int i = 0, times = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++, times++) {
                int x = 0, y = 0;
                if (j > 0) {
                    x = (j*3);
                }
                if (i > 0) {
                    y = (i*3);
                }
                squares[times] = checkSquare(matrix, x, y);
//                System.out.println(times + "- x: " + x + " | y: " + y + " "+ checkSquare(matrix, x, y));
            }
        }

        for (boolean b : squares) {
            if (!b) {
                allSquares = false;
                break;
            }
        }

        allChecks[0] = allRows;
        allChecks[1] = allColumns;
        allChecks[2] = allSquares;

        boolean win = true;
        for (boolean b : allChecks) {
            if (!b) {
                win = false;
            }
        }

        // 05- finish game

        if (win) {
            System.out.println("You win.");
        } else {
            System.out.println("You lose.");
        }

    }

    public static int[][] solveSudoku(int[][] matrix) {
        return new int[][]{
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
    }
    public static boolean checkRow(int[][] matrix, int rowNumber) {
        boolean[] numbers = new boolean[9];

        for (int i = 0; i < 9; i++) {
            if (matrix[0][i]-1 >= 0) {
//                System.out.println(matrix[0][i]);
                numbers[matrix[0][i]-1] = true;
            }
        }

        for (boolean b : numbers) {
            if (!b) {
                return false;
            }
        }
//        System.out.println(Arrays.toString(numbers));
        return true;
    }
    public static boolean checkColumn(int[][] matrix, int columnNumber) {
        boolean[] numbers = new boolean[9];

        for (int i = 0; i < 9; i++) {
            if ((matrix[i][columnNumber]-1) >= 0) {
//                System.out.println(matrix[i][columnNumber]);
                numbers[matrix[i][columnNumber]-1] = true;
            }
        }

        for (boolean b : numbers) {
            if (!b) {
                return false;
            }
        }
//        System.out.println(Arrays.toString(numbers));
        return true;
    }

    public static boolean checkSquare(int[][] matrix, int xIndex, int yIndex) {
        // Create inline-square
        int[] inlineSquare = new int[9];
        for (int i = 0; i < 3; i++) {
            inlineSquare[i] = matrix[yIndex][xIndex+i];
        }
        for (int i = 0; i < 3; i++) {
            inlineSquare[i+3] = matrix[yIndex+1][xIndex+i];
        }
        for (int i = 0; i < 3; i++) {
            inlineSquare[i+6] = matrix[yIndex+2][xIndex+i];
        }

        boolean[] numbers = new boolean[9];

        for (int i = 0; i < 9; i++) {
            if (inlineSquare[i]-1 >= 0) {
                numbers[inlineSquare[i]-1] = true;
            }
        }

        for (boolean b : numbers) {
            if (!b) {
                return false;
            }
        }

//        System.out.println(Arrays.toString(inlineSquare));
        return true;
    }
}