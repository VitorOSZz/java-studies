import java.util.ArrayList;
import java.util.List;

public class Village {
    public final String name;
    private static int numberOfNinjasAllVillages;
    private int numberOfNinjasThisVillage;
    private final List<Ninja> ninjaArraylist = new ArrayList<>();

    public Village(String name) {
        this.name = name;
    }

    public static int getNumberOfNinjasAllVillages() {
        return numberOfNinjasAllVillages;
    }

    public int getNumberOfNinjasThisVillage() {
        return numberOfNinjasThisVillage;
    }

    public void createNinja(String name) {
        Ninja ninja = new Ninja(name, this);
        ninjaArraylist.add(ninja);
        numberOfNinjasAllVillages++;
        numberOfNinjasThisVillage++;
    }

    public List<Ninja> getNinjaArraylist() {
        return List.copyOf(this.ninjaArraylist);
    }


}
