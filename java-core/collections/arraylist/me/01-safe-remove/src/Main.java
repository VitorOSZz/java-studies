import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i+1);
        }

        System.out.println(list);

        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}