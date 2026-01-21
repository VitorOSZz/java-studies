import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // in ArrayList you cant put primitive types, so use Wrapper Classes.
        //ArrayList<int> arrayList = new ArrayList<int>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            arrayList.add((int) (Math.random()*100));
        }
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }

        for (Integer i : arrayList) {
            System.out.println(i + " | class: " + i.getClass());
        }
    }
}