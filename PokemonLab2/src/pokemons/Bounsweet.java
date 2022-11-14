package pokemons;

import attacks.*;
import exceptions.BounsweetException;
import ru.ifmo.se.pokemon.*;

import java.io.IOException;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name, int level) throws BounsweetException {
        super(name, level);
        if (level <= 0) {
            throw new BounsweetException();
        }
        setStats(42, 30, 38,30,38,32);
        setType(Type.GRASS);
        setMove(new DoubleTeam(), new RazorLeaf());
    }
}
