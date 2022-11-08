package attacks;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND,60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect slow = new Effect().turns(1).stat(Stat.SPEED,-3);
        pokemon.addEffect(slow);
    }

    @Override
    protected String describe() {
        return "Использует Bulldoze - наносит урон и снижает скорость врага на 1 ход";
    }
}
