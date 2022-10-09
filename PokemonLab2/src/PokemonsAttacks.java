import ru.ifmo.se.pokemon.*;

class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND,60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect slow = new Effect().turns(1).stat(Stat.SPEED,- 6);
        pokemon.addEffect(slow);
    }

    @Override
    protected String describe() {
        return "Использует bulldoze - наносит урон и снижает скорость врага на 1 ход";
    }
}

class TakeDown extends PhysicalMove {
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


