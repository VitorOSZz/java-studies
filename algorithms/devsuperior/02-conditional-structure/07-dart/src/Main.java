import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 3 values of distance");
        System.out.print("First: ");
        float first_distance = scanner.nextFloat();
        System.out.print("Second: ");
        float second_distance = scanner.nextFloat();
        System.out.print("Third: ");
        float third_distance = scanner.nextFloat();

        float higher_distance = first_distance;
        if (second_distance> third_distance && second_distance > first_distance) {
            higher_distance = second_distance;
        }

        if (third_distance>first_distance && third_distance>second_distance) {
            higher_distance = third_distance;
        }

//        higher_distance = Math.max(Math.max(first_distance,second_distance),third_distance);

//        ArrayList<Float> distances = new ArrayList<>();
//        distances.add(first_distance);
//        distances.add(second_distance);
//        distances.add(third_distance);
//
//        higher_distance = 0;
//        for (float i : distances) {
//            if (higher_distance < i) {
//                higher_distance = i;
//            }
//        }

        System.out.println("Higher distance: " + higher_distance);

    }
}