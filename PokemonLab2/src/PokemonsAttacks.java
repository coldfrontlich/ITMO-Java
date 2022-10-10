import ru.ifmo.se.pokemon.*;

class Bulldoze extends PhysicalMove {
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

class PowerGem extends SpecialMove {
    public PowerGem() {
        super(Type.ROCK,80, 100);
    }

    @Override
    protected String describe() {
        return "Использует Power Gem - наносит урон врагу";
    }
}

class ConfuseRay extends StatusMove {
    public ConfuseRay() {
        super(Type.GHOST, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "Использует Confuse Ray - накладывает на соперника эффект растерянности";
    }
}

class DoubleTeam extends StatusMove {
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

class RazorLeaf extends PhysicalMove {
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

class PlayNice extends StatusMove {
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

class Confide extends StatusMove {
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

class DarkPulse extends SpecialMove {
    public DarkPulse() {
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.2) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Использует Dark Pulse - наносит урон и с шансом 20% вызывает страх у соперника";
    }
}

class ShadowBall extends SpecialMove {
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

class FourPlay extends PhysicalMove {
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

class NightShade extends SpecialMove {
    public NightShade(Type type, double pow, double acc) {
        super(type, pow, acc);
    }


    @Override
    protected String describe() {
        return "Использует Night Shade - наносит урон равный уровню";
    }
}


