import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        System.out.println(Arrays.deepToString(array));
        shuffle(array);
        System.out.println(Arrays.deepToString(array));
    }

    public static void shuffle(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int index1 = (int) (Math.random()* array.length);
            int index2 = (int) (Math.random()* array.length);
            System.out.println("Index1: " + index1 + " | Index2: " +index2);
            swap(array, index1, index2);
        }
    }

    public static void swap(int[][] array, int index1, int index2) {
        int[] temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}