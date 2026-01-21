import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> commands = new ArrayList<>();

        commands.add("Login");
        commands.add("Read");
        commands.add("Write");
        commands.add("Logout");

        System.out.println(check(commands)? "true" : "Sequence Invalid");
    }

    public static boolean check(List<String> commands) {

        if (!commands.getFirst().equalsIgnoreCase("LOGIN")) {
            return false;
        }
        if (!commands.getLast().equalsIgnoreCase("LOGOUT")) {
            return false;
        }

        int login = 0;
        int logout = 0;
        for (String s : commands) {
            if (Objects.equals(s.toUpperCase(), "LOGIN")) {
                login++;
            }
            if (Objects.equals(s.toUpperCase(), "LOGOUT")) {
                logout++;
            }
        }

        return (login == 1 && logout == 1);
    }
}