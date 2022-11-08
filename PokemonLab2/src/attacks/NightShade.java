package attacks;

import ru.ifmo.se.pokemon.*;

public class NightShade extends SpecialMove {
    public NightShade(Type type, double pow, double acc) {
        super(type, pow, acc);
    }


    @Override
    protected String describe() {
        return "Использует Night Shade - наносит урон равный уровню";
    }
}
