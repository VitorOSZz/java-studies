public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public int getLife() {
        return life;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(Champion attacker) {
        int damage = attacker.attack - this.armor;

        if (damage <= 0) {
            damage = 1;
        }
        this.life = Math.max(0, (this.life-damage));
    }

    public String status() {
        String text = this.name + ": " + this.life + " HP";
        if (this.life <= 0) {
            text += (" (dead)");
        }
        return text;
    }
}
