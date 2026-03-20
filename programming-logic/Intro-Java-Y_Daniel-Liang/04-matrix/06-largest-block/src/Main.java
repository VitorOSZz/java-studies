import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 0, 1},
                {1, 1, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };

        System.out.println(Arrays.toString(findLargestBlock(matrix)));
//        System.out.println(Arrays.deepToString(filterMatrix(matrix, 2, 2, 4, 4)));

    }

    public static int[] findLargestBlock(int[][] matrix) {

        int highestQuantity = 0;
        int rowIndex = 0;
        int columnIndex = 0;

        for (int row = 0; row < matrix.length; row++) {
//            System.out.print("[ ");
            for (int column = 0; column < matrix[row].length; column++) {
//                System.out.print("["+row+","+column+"] ");

                int quantity = 0;

                if (matrix[row][column] == 1) {
                    boolean stop = false;
                    while (!stop) {
                        quantity++;
                        if (row+quantity < matrix.length && column+quantity < matrix[row].length) {
                            for (int[] intArray : filterMatrix(matrix, row, column, row + quantity, column + quantity)) {
                                for (int i : intArray) {
                                    if (i != 1) {
                                        quantity--;
                                        stop = true;
                                        break;
                                    }
                                }
                            }
                        } else {
                            stop = true;
                        }
                    }
                    if (quantity > highestQuantity) {
                        highestQuantity = quantity;
                        rowIndex = row;
                        columnIndex = column;
                    }
                }

            }
//            System.out.println("]");
        }
        return new int[] {rowIndex, columnIndex, highestQuantity};
    }

    public static int[][] filterMatrix(int[][] matrix,
                                       int indexStartRow,
                                       int indexStartColumn,
                                       int indexFinalRow,
                                       int indexFinalColumn) {
        int[][] newMatrix = new int[indexFinalRow-indexStartRow+1][indexFinalColumn-indexStartColumn+1];

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = matrix[indexStartRow+i][indexStartColumn+j];
            }
        }

        return newMatrix;
    }
}