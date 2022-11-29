package environment;

public class TrumpetSounds extends Environment {

    public TrumpetSounds() {
        super("Трубные звуки");
        System.out.println("Появились трубные звуки");
    }

    @Override
    public void appear() {
        setExists(true);
        System.out.println("В трубных звуках");
    }

    public void condition() {
        if (isExists()) {
            System.out.println(getName() + " ещё не отзвучали");
        } else {
            System.out.println(getName() + " замолкли");
        }
    }
}
