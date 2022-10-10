import ru.ifmo.se.pokemon.*;

public class Murkrow extends Pokemon {
    public Murkrow(String name, int level){
        super(name, level);
        setStats(60, 85,42,85,42,91);
        setType(Type.DARK,Type.FLYING);
        setMove(new DarkPulse(), new FourPlay(), new ShadowBall());
    }
}
