import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        * 11.9 (Largest rows and columns) Write a program that randomly fills in 0s and 1s into an n-by-n matrix,
        * prints the matrix, and finds the rows and columns with the most 1s.
        * */


        // Input
        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        // Process
        System.out.println("The random array is: ");

        List<List> matrix = generateRandomMatrix(size);

        // Process - output matrix
        for (int i = 0; i < matrix.size(); i++) {
            System.out.println(matrix.get(i));
        }
        // Output largest
        System.out.println("The largest row index: " + getLargestRowIndex(matrix));
        System.out.println("The largest column index: " + getLargestColumnIndex(matrix));

        input.close();
    }

    public static List<List> generateRandomMatrix(int size) {
        Random rand = new Random();
        List<List> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Integer> array = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                array.add(rand.nextInt(2));
            }
            list.add(array);
        }

        return list;
    }

    public static List<Integer> getLargestRowIndex(List<List> list) {
        List<Integer> result = new ArrayList<>();
        int largest = 0;

        for (int i = 0; i < list.size(); i++) {
            int numberOf1s = 0;
            for (Object j : list.get(i)) {
                if (j.equals(1)) {
                    numberOf1s++;
                }
            }

            if (largest < numberOf1s) {
                largest = numberOf1s;
                result.clear();
                result.add(i);
            } else if (largest == numberOf1s) {
                result.add(i);
            }
        }

        return result;
    }

    public static List<Integer> getLargestColumnIndex(List<List> list) {
        List<Integer> result = new ArrayList<>();
        int largest = 0;

        for (int i = 0; i < list.size(); i++) {
            int numberOf1s = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).get(i).equals(1)) {
                    numberOf1s++;
                };
            }

            if (largest < numberOf1s) {
                largest = numberOf1s;
                result.clear();
                result.add(i);
            } else if (largest == numberOf1s) {
                result.add(i);
            }
        }

        return result;
    }
}