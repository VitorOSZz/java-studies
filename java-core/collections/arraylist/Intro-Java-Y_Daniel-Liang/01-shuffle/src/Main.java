import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1004);

        System.out.println(list);

        swap(list,0,list.size()-1);
        System.out.println(list);
        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            int index = rand.nextInt(list.size());
            swap(list,index,list.size()-1);
        }
    }

    public static void swap(List<Integer> list, int index1, int index2) {
        Integer temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}