package environment;

public abstract class Environment {
    private final String name;
    private boolean Exists;

    public Environment(String name) {
        this.name = name;
        Exists = false;
    }

    public String getName() {
        return name;
    }

    public boolean isExists() {
        return Exists;
    }

    public void setExists(boolean exists) {
        Exists = exists;
    }

    public abstract void appear();
}
