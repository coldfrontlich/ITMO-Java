package pokemons;

import attacks.*;
import exceptions.MurkrowException;
import ru.ifmo.se.pokemon.*;

public class Honchkrow extends Murkrow {
    public Honchkrow(String name, int level) throws MurkrowException {
        super(name, level);
        if (level <= 0) {
            throw new MurkrowException();
        }
        setStats(100, 125, 52, 105, 52, 71 );
        setType(Type.DARK, Type.FLYING);
        addMove(new NightShade(Type.GHOST, this.getLevel(), 100));
    }
}
