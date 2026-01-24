import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
         * This is just an experiment, as this model is fragile.
         * If you want to build something like this, use an Employer class.
        */

        List<List> employers = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<Double> salaries = new ArrayList<>();

        employers.add(ids);
        employers.add(names);
        employers.add(salaries);
        System.out.println(employers);

        addEmployer(1, "Vitor", 1200D, ids, names, salaries);
        System.out.println(employers);
        addEmployer(2, "David", 2400D, ids, names, salaries);
        System.out.println(employers);
        addEmployer(3, "Sarah", 2000D, ids, names, salaries);
        System.out.println();
        for (List list : employers) {
            System.out.println(list);
        }
    }

    public static void addEmployer(int id, String name, double salary, List<Integer> ids, List<String> names, List<Double> salaries) {
        ids.add(id);
        names.add(name);
        salaries.add(salary);
    }
}