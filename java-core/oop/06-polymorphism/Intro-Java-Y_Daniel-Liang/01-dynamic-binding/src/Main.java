import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add(1);
        list.add("2");
        list.add(3.5f);
        list.add(4.5d);
        list.add(list);
        System.out.println(list);
    }
}