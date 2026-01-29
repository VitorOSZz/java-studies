/* Educational purposes only. */

import Pokemon.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Charmander charmander = new Charmander();
        Pokemon squirquirrtle = new Squirtle("Squirquirrtle");
        Pokemon sapolarapio = new Bulbassaur("Sapo Larapio");

        List<Pokemon> pc = new ArrayList<>();
        pc.add(charmander);
        pc.add(squirquirrtle);
        pc.add(sapolarapio);

        for (Pokemon pokemon : pc) {
            System.out.println(pokemon);
        }

        System.out.println(Attacks.EMBER);
    }
}