import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "- ");
            list.add(input.nextInt());
        }

        System.out.println(list);
        removeDuplicate(list);
        System.out.println(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }

        list.clear();
        list.addAll(newList);
    }
}