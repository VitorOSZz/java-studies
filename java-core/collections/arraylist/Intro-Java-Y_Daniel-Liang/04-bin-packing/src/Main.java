import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of objects: ");
        int quantityOfObjects = scanner.nextInt();

        System.out.println("Enter the weights of the objects");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < quantityOfObjects; i++) {
            System.out.print(i + "- ");
            array.add(scanner.nextInt());
        }

        System.out.println(array);
        System.out.println(binPacking(array));
    }

    public static List<List<Integer>> binPacking(List<Integer> list) {
        Collections.sort(list);
        List<List<Integer>> binPacks = new ArrayList<>();

        for (int i = list.size(); i > 0; i--) {

            if (list.size() >= 2) {
                if ((list.getFirst() + list.getLast()) <= 10) {
                    List<Integer> array = new ArrayList<>();
                    array.add(list.getLast());
                    array.add(list.getFirst());

                    list.removeFirst();
                    list.removeLast();

                    binPacks.add(array);
                } else {
                    List<Integer> array = new ArrayList<>();
                    array.add(list.getLast());

                    list.removeLast();

                    binPacks.add(array);
                }
            } else {
                List<Integer> array = new ArrayList<>();
                array.add(list.getLast());

                list.removeLast();

                binPacks.add(array);
                return binPacks;
            }
        }
        return binPacks;
    }
}