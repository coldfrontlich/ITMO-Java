package pokemons;

import attacks.*;
import exceptions.BounsweetException;
import ru.ifmo.se.pokemon.*;

import java.io.IOException;

public class Tsareena extends Steenee {
    public Tsareena(String name, int level) throws BounsweetException {
        super(name, level);
        if (level <= 0) {
            throw new BounsweetException();
        }
        setStats(72, 120, 98, 50, 98, 72);
        setType(Type.GRASS);
        addMove(new Confide());
    }
}
