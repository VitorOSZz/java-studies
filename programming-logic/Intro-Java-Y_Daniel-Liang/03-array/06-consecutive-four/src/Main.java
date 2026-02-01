public class Main {
    public static void main(String[] args) {
        int[] arrayConsFourTrue = {3, 4, 5, 5, 5, 5, 4, 5};
        int[] arrayConsFourFalse = {3, 4, 5, 5, 6, 5, 5, 4, 5};

        System.out.println(consecutive(arrayConsFourTrue, 4));
        System.out.println(consecutive(arrayConsFourFalse, 4));
    }

    public static boolean consecutive(int[] array, int manyConsecutive) {
        for (int i = 0; i < array.length; i++) {
            int consecutive = 0;

            // check if exist array[i+manyConsecutive]
            if (i+manyConsecutive < array.length) {
                // look for next manyConsecutive
                for (int j = i; j < i+manyConsecutive; j++) {
                    if (array[i] == array[j]) {
                        consecutive ++;
                    }
                }
                if (consecutive >= manyConsecutive) {
                    return true;
                }
            }
        }

        // Default false
        return false;
    }
}