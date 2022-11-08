package attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setCondition(new Effect().turns(1).stat(Stat.SPECIAL_ATTACK, -3));
    }

    @Override
    protected String describe() {
        return "Использует Confide - снижает специальную атаку на один ход";
    }
}
