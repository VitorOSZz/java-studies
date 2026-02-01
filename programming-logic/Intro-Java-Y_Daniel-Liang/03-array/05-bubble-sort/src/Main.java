import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2 , 8};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            if (i+1 < array.length) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }
            }
        }
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}