package Pokemon;

public class Squirtle extends Pokemon{

    public Squirtle(String nickname) {
        super(nickname);
        this.name = "Pokemon.Squirtle";
        this.pokedexNumber = 4;
        this.haveMega = false;
        this.firstType = "Water";
    }

    public Squirtle() {
        super("Pokemon.Squirtle");
        this.name = "Pokemon.Squirtle";
        this.pokedexNumber = 4;
        this.haveMega = false;
        this.firstType = "Water";
    }

    @Override
    public String possibleAttacks() {
        return "{" + Attacks.TACKLE + ", " + Attacks.QUICK_ATTACK +  ", " +Attacks.BUBBLE + "}";
    }
}
