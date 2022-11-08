package attacks;

import ru.ifmo.se.pokemon.*;


public class TakeDown extends PhysicalMove {

    public TakeDown() {
        super(Type.NORMAL, 90, 85);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int)damage / 4);
    }

    @Override
    protected String describe() {
        return "Использует Take down - наносит урон врагу и наносит себе 1/4 от этого урона";
    }
}
