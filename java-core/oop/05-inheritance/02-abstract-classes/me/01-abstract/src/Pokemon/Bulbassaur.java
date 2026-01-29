package Pokemon;

public class Bulbassaur extends Pokemon{

    public Bulbassaur(String nickname) {
        super(nickname);
        this.name = "Pokemon.Bulbassaur";
        this.pokedexNumber = 7;
        this.haveMega = false;
        this.firstType = "Grass";
    }

    public Bulbassaur() {
        super("Pokemon.Bulbassaur");
        this.name = "Pokemon.Bulbassaur";
        this.pokedexNumber = 7;
        this.haveMega = false;
        this.firstType = "Grass";
    }

    @Override
    public String possibleAttacks() {
        return "{" + Attacks.TACKLE + ", " + Attacks.QUICK_ATTACK +  ", " +Attacks.VINE_WHIP + "}";
    }
}
