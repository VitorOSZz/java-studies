import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C");
        languages.add("Python");

        System.out.println(languages);

        int langJava = 0;
        int langPython = 0;
        int langC = 0;

        for (String s : languages) {
            if (s.toLowerCase().trim().equals("java")) {
                langJava++;
            } else if (s.toLowerCase().trim().equals("python")) {
                langPython++;
            } else if (s.toLowerCase().trim().equals("c")) {
                langC++;
            }
        }

        System.out.println("Java: " + langJava);
        System.out.println("Python: " + langPython);
        System.out.println("C: " + langC);
    }
}