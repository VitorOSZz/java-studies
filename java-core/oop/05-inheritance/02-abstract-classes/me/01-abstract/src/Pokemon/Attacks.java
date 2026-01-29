package Pokemon;

public enum Attacks {

    TACKLE(Types.NORMAL, 40, 100, 35),
    QUICK_ATTACK(Types.NORMAL, 40, 100, 30),
    EMBER(Types.FIRE, 40, 100, 25),
    BUBBLE(Types.WATER, 40, 100, 30),
    VINE_WHIP(Types.GRASS, 45, 100, 25);

    public Types type;
    public int power;
    public int accuracy;
    public int pp;

    Attacks(Types type, int power, int accuracy, int pp) {
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
    }

    @Override
    public String toString() {
        return "{" +
                "type=" + type +
                ", power=" + power +
                ", accuracy=" + accuracy +
                ", pp=" + pp +
                '}';
    }
}
