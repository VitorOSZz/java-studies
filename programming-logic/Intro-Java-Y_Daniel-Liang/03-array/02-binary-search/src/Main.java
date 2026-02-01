public class Main {
    public static void main(String[] args) {
        // Initialize array
        int[] array = new int[10];

        for (int i = 0, j = 9; i < 10; i++, j--) {
            array[i] = j *10;
        }

        array[3] = 520;
        array[8] = 15;
        array[5] = -15;

        System.out.println(outputArray(array));

        // Sorting array
        selectionSort(array);
        System.out.println(outputArray(array));

        // Binary Search

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - Binary Search(" + array[array.length-1-i] + "): " + binarySearch(array, array[array.length-1-i]));;
        }

//        System.out.println(binarySearch(array, -15));

    }

    public static int binarySearch(int[] array, int numberWanted) {
        int min = 0;
        int max = array.length;

        int middle = (max-min)/2;
        while (middle >= 0) {
            if (array[middle] > numberWanted) {
                max = middle;
            } else if (array[middle] < numberWanted) {
                min = middle;
            } else {
                return middle;
            }
            middle = (max+min)/2;
        }

        return -1;
    }

    public static String outputArray(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("array={ ");
        for (int i : array) {
            stringBuilder.append(i).append(" ");
        }
        stringBuilder.append("}");

        return stringBuilder.toString();
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min_index = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            if (i != min_index) {
                swap(array, i, min_index);
            }
        }
    }

    public static void swap(int[] array, int index, int index2) {
        int temp = array[index];
        array[index] = array[index2];
        array[index2] = temp;
    }
}