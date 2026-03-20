import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        System.out.println(Arrays.deepToString(array));
        // First sort
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i][0] > array[j][0]) {
                    swap(array, i, j);
                }
            }
        }
        // Second sort
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][0] == array[j][0]) {
                    if (array[i][1] < array[j][1]) {
                        swap(array, i, j);
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void swap(int[][] array, int index1, int index2) {
        int[] temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}