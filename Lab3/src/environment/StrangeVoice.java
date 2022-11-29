package environment;

public class StrangeVoice extends Environment {

    public StrangeVoice() {
        super("Странные звуки");
        System.out.println("Появились странные звуки");
    }

    @Override
    public void appear() {
        setExists(true);
        System.out.println("Текели-ли! Текели-ли!");
    }
}
