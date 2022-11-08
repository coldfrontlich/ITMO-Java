package attacks;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove {
    public PlayNice() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(1).stat(Stat.ATTACK, -1));
    }

    @Override
    protected String describe() {
        return "Использует Play nice - снижает врагу силу аттаки на один ход";
    }
}
