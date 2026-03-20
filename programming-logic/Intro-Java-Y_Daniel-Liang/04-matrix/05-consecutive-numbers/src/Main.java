public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 3, 4, 5, 6},
                {3, 4, 3, 6, 0, 8, 9},
                {9, 3, 3, 0, 3, 4, 3},
                {2, 1, 3, 1, 2, 3, 4},
                {5, 3, 3, 3, 9, 8, 7},
                {6, 5, 4, 3, 2, 1, 0}
        };

        System.out.println(checkConsecutive(matrix, 4));
    }

    public static boolean checkConsecutive(int[][] matrix, int consecutiveWanted) {
        // Row
        for (int[] intArray : matrix) {
            Integer[] numbers = new Integer[consecutiveWanted];
            // {0, 1, 0, 3, 1, 6, 1}

            for (int i = 0; i < intArray.length; i++) {
                for (int j = 0; j < consecutiveWanted; j++) {
                    if (i+j < intArray.length) {
                        numbers[j] = intArray[i+j];
                    } else {
                        numbers[j] = null;
                    }
                }

                // Check if all Integers are equal and not null
                if (check(numbers)) {
                    System.out.println("Row consecutive");
                    return true;
                }
            }

        }
        // Column

        for (int column = 0; column <= matrix.length; column++) {
            for (int i = 0; i < matrix.length; i++) {
                Integer[] numbers = new Integer[consecutiveWanted];

                for (int j = 0; j < numbers.length; j++) {
                    if ( i+j < matrix.length) {
                        numbers[j] = matrix[i+j][column];
                    } else {
                        numbers[j] = null;
                    }

                }

//                System.out.println(check(numbers) + Arrays.toString(numbers));
                if (check(numbers)) {
                    System.out.println("Column consecutive");
                    return true;
                }
            }
        }
        // Right Diagonal

        for (int row = 0; row < matrix.length; row++) {
            for (int i = 0; i < matrix[row].length; i++) {
//                System.out.print(matrix[row][i] + " ");
                Integer[] numbers = new Integer[consecutiveWanted];
                for (int j = 0; j < numbers.length; j++) {
                    if (row+j >= matrix.length || i+j > matrix.length) {
                        numbers[j] = null;

                    } else {
                        numbers[j] = matrix[row+j][i+j];
                    }
//                    System.out.println(Arrays.toString(numbers));

                }

                if (check(numbers)) {
                    System.out.println("Right Diagonal consecutive");
                    return true;
                }
            }
        }

        // Left Diagonal
        for (int row = 0; row < matrix.length; row++) {
            for (int i = 0; i < matrix[row].length; i++) {
                Integer[] numbers = new Integer[consecutiveWanted];

//                System.out.println("[" + row + ", " + i + "]");

                if (row-consecutiveWanted+1 >= 0 && i+consecutiveWanted-1 < matrix[row].length) {
                    for (int j = 0; j < consecutiveWanted; j++) {
                        numbers[j] = matrix[row-j][i+j];
                    }
                    if (check(numbers)) {
                        System.out.println("Left Diagonal consecutive");
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean check(Integer[] numbers) {
        // Check if all Integers are equal and not null
        boolean rowConsecutive = true;
        for (Integer k : numbers) {
            if (numbers[0] != null) {
                if (!numbers[0].equals(k)) {
                    rowConsecutive = false;
                }
            } else {
                rowConsecutive = false;
            }
        }
//                System.out.println(Arrays.toString(numbers));
        return rowConsecutive;
    }
}