package pokemons;

import attacks.*;
import exceptions.KomalaException;
import ru.ifmo.se.pokemon.*;

public class Komala extends Pokemon {
    public Komala(String name, int level) throws KomalaException {
        super(name, level);
        if (level <= 0) {
            throw new KomalaException();
        }
        setStats(65, 115, 65, 75, 95, 65);
        setType(Type.NORMAL);
        setMove(new Bulldoze(),new TakeDown(), new PowerGem(), new ConfuseRay());
    }
}
