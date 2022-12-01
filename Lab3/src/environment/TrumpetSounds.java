package environment;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "TrumpetSounds{ " + "name = " + getName() +
                "; Exists = " + isExists() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        TrumpetSounds trumpetSounds = (TrumpetSounds) obj;
        return (this.getName()).equals(trumpetSounds.getName())
                && ((this.isExists()) == (trumpetSounds.isExists()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.isExists());
    }
}
