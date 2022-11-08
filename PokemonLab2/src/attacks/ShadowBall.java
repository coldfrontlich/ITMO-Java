package attacks;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.2) {
            pokemon.setCondition(new Effect().turns(1).stat(Stat.SPECIAL_DEFENSE, -1));
        }
    }

    @Override
    protected String describe() {
        return "Использует Shadow Ball - наносит урон и уменьшает специальную защиту врага на один ход";
    }
}
