package environment;

import java.util.Objects;

public abstract class Environment {
    private final String name;
    private boolean exists;

    public Environment(String name) {
        this.name = name;
        exists = false;
    }

    public String getName() {
        return name;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public abstract void appear();

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.isExists());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Environment environment = (Environment) obj;
        return (this.getName()).equals(environment.getName())
                && ((this.isExists()) == (environment.isExists()));
    }

    @Override
    public String toString() {
    return "Environment{ " + "name = " + getName() +
                "; Exists = " + isExists() +
                " }";
    }
}
