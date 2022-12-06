package environment;

import character.Ancient;

import java.util.Objects;

public class Slime extends Environment {
    private Ancient owner;

    public Ancient getOwner() {
        return owner;
    }

    public void setOwner(Ancient owner) {
        this.owner = owner;
    }

    public Slime(String name, Ancient owner) {
        super(name);
        this.owner = owner;
    }

    @Override
    public void appear() {
        setExists(true);
        System.out.println(getName() + " плотно обволакивает " + owner.getAmount() + " мертвых тела " + owner.getName());
    }

    public void giveOffOdor(SmellUnknownOrigin smellUnknownOrigin) {
            System.out.println(getName() + " и являлась источником " + smellUnknownOrigin.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.isExists(), this.getOwner());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Slime slime = (Slime) obj;
        return (this.getName()).equals(slime.getName())
                && ((this.isExists()) == (slime.isExists()))
                && ((this.getOwner()).equals(slime.getOwner()));
    }

    @Override
    public String toString() {
        return "Slime{ " + "name = " + getName() +
                "; Exists = " + isExists() +
                "; owner = " + getOwner() +
                " }";
    }
}
