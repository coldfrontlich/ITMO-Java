package attacks;

import ru.ifmo.se.pokemon.*;

public class FourPlay extends PhysicalMove {
    public FourPlay() {
        super(Type.DARK,95, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int)pokemon.getStat(Stat.ATTACK));
    }

    @Override
    protected String describe() {
        return "Использует Four Play - наносит урон равный атаке врага";
    }
}
