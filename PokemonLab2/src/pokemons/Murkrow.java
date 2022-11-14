package pokemons;

import attacks.*;
import exceptions.MurkrowException;
import ru.ifmo.se.pokemon.*;

public class Murkrow extends Pokemon {
    public Murkrow(String name, int level) throws MurkrowException {
        super(name, level);
        if (level <= 0) {
            throw new MurkrowException();
        }
        setStats(60, 85,42,85,42,91);
        setType(Type.DARK,Type.FLYING);
        setMove(new DarkPulse(), new FourPlay(), new ShadowBall());
    }
}
