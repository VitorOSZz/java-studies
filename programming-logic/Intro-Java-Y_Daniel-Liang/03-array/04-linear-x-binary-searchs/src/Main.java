public class Main {
    public static void main(String[] args) {
        int[] array = new int[100_000];

        for (int i = 0; i < 100_000; i++) {
            array[i] = i+1;
        }

        long startTime = System.nanoTime();
        int linearResult = linearSearch(array,43_973);
        long endTime = System.nanoTime();
        long linearExecutionTime = endTime - startTime;
        System.out.println("Linear: " + linearResult);
        System.out.println("Linear execution time: " + linearExecutionTime);

        System.out.println();

        startTime = System.nanoTime();
        int binaryResult = binarySearch(array,43_973);
        endTime = System.nanoTime();
        long binaryExecutionTime = endTime - startTime;
        System.out.println("Binary: " +  binaryResult);
        System.out.println("Binary execution time: " + binaryExecutionTime);

        System.out.println((double) linearExecutionTime/binaryExecutionTime);

    }

    public static int linearSearch(int[] array, int numberWanted) {
        for (int i=0; i < array.length; i++) {
            if (array[i] == numberWanted) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int numberWanted) {
        int start = 0;
        int last = array.length-1;

        while (start <= last) {
            int middle = (last+start)/2;

            if (array[middle] < numberWanted) {
                start = middle + 1;
            } else if (array[middle] > numberWanted) {
                last = middle - 1;
            } else if (array[middle] == numberWanted) {
                return middle;
            }
        }

        return -1;
    }
}