package Pokemon;

public abstract class Pokemon {

    int pokedexNumber;
    public String name;
    String nickname;
    String firstType;
    String secondType;
    boolean haveMega;

    public Pokemon(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "pokedexNumber=" + pokedexNumber +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", firstType='" + firstType + '\'' +
                ", secondType='" + secondType + '\'' +
                ", haveMega=" + haveMega +
                ", possibleAttacks=" + this.possibleAttacks() +
                '}';
    }

    abstract String possibleAttacks();

}
