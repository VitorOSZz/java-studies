import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        System.out.println(repetition(languages));

    }
    public static String repetition(List<String> languages) {
        List<String> languagesCounted = new ArrayList<>();
        StringBuilder data = new StringBuilder();
        data.append("{");
        for (int i = 0; i < languages.size(); i++) {
            int x = 0;

            if (!languagesCounted.contains(languages.get(i))) {
                for (int j = i; j < languages.size(); j++) {
                    if (Objects.equals(languages.get(j), languages.get(i))) {
                        x++;
                    }
                }
                languagesCounted.add(languages.get(i));
                data.append(languages.get(i)).append(": ").append(x).append(", ");
            }
        }
        data.deleteCharAt(data.length()-1);
        data.deleteCharAt(data.length()-1);
        data.append("}");

        return data.toString();
    }
}