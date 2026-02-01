import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 3, 10, 7 , -5, 1, 0, -3};
        int[] array2 = {10, -24, 11, 0, 10, 7 , 6, 12, 0, -3};

        System.out.println(Arrays.toString(array1));
        selectionSort(array1);
        selectionSort(array2);
        int[] array3 = mergeArrays(array1, array2);
        System.out.println(Arrays.toString(array3));
        selectionSort(array3);
        System.out.println(Arrays.toString(array3));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length+array2.length];
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i-array1.length];
            }
        }

        return array3;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}