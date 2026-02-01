public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0, j = 9; i < 10; i++, j--) {
            array[i] = j *10;
        }

        array[3] = 520;
        array[8] = 15;
        array[5] = -15;

        System.out.println(outputArray(array));
        selectionSort(array);
        System.out.println(outputArray(array));
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