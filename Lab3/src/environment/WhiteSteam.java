package environment;

public class WhiteSteam extends Environment {

    public WhiteSteam() {
        super("Облака белого пара");
        System.out.println("Появились облаки белого пара");
    }

    @Override
    public void appear() {
        setExists(true);
        System.out.println("За " + getName());
    }
}
