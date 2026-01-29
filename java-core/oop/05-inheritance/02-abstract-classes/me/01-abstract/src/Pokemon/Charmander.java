package Pokemon;

public class Charmander extends Pokemon{

    public Charmander(String nickname) {
        super(nickname);
        this.name = "Charmander";
        this.pokedexNumber = 1;
        this.haveMega = false;
        this.firstType = "Fire";
    }

    public Charmander() {
        super("Charmander");
        this.name = "Charmander";
        this.pokedexNumber = 1;
        this.haveMega = false;
        this.firstType = "Fire";
    }

    @Override
    public String possibleAttacks() {
        return "{" + Attacks.TACKLE + ", " + Attacks.QUICK_ATTACK +  ", " +Attacks.EMBER + "}";
    }
}
