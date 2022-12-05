package environment;

public class Daylight extends Environment{

    public Daylight(String name) {
        super(name);
    }

    @Override
    public void appear() {
        setExists(true);
        System.out.println("Появился " + getName());
    }
}
