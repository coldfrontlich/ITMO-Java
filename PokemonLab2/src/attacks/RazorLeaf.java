package attacks;

import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf() {
        super(Type.GRASS, 55, 95);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setCondition(new Effect().stat(Stat.ATTACK, 3).turns(1));
    }


    @Override
    protected String describe() {
        return "Использует Razor Leaf - наносит критический урон";
    }
}
