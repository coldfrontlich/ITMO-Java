package pokemons;

import attacks.*;
import exceptions.BounsweetException;
import ru.ifmo.se.pokemon.*;

import javax.imageio.IIOException;
import java.io.IOException;

public class Steenee extends Bounsweet {
    public Steenee(String name, int level) throws BounsweetException{
        super(name, level);
        if (level <= 0) {
            throw new BounsweetException();
        }
        setStats(52, 40, 48, 40, 48, 62);
        setType(Type.GRASS);
        addMove(new PlayNice());
    }
}
