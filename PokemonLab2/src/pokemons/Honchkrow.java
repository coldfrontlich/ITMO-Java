package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Honchkrow extends Murkrow {
    public Honchkrow(String name, int level) {
        super(name, level);
        setStats(100, 125, 52, 105, 52, 71 );
        setType(Type.DARK, Type.FLYING);
        addMove(new NightShade(Type.GHOST, this.getLevel(), 100));
    }
}
