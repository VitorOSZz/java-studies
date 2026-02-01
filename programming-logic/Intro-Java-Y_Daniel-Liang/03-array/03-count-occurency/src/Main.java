public class Main {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 5, 4, 3, 23, 43, 2, 0};
        int[] arrayTimes = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int thisNumberOccurs = 1;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    thisNumberOccurs++;
                }
            }
            arrayTimes[i] = thisNumberOccurs;
        }

        for (int i = 0; i < array.length; i++) {
            boolean alreadyPrinted = false;
            for (int j = i-1; j >= 0; j--) {
                if (array[j] == array[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                System.out.print(array[i] + " occur " + arrayTimes[i] + " time");
                if (arrayTimes[i] > 1) {
                    System.out.println("s");
                } else {
                    System.out.println();
                }
            }
        }

        System.out.print("{ ");
        for (int i : arrayTimes) {
            System.out.print(i + " ");
        }
        System.out.print("}");
    }
}