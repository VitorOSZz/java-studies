import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i < 5+1; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println(list);

        for (int i = 0; i < list.size()/2; i++) {
            String first = list.get(i);
            String second = list.get((list.size()-i)-1);

            list.set(i, second);
            list.set(((list.size()-i)-1), first);
        }

        System.out.println(list);

        //System.out.println(list.reversed());
    }
}