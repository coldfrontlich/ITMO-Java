package attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setCondition(new Effect().turns(1).stat(Stat.EVASION, + 1));
    }

    @Override
    protected String describe() {
        return "Использует Double Team - увеличивает свое уклонение на 1 ход";
    }
}
