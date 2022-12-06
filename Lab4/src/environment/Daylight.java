package environment;

import character.Character;

import java.util.Objects;

public class Daylight extends Environment{

    public Daylight(String name) {
        super(name);
    }

    @Override
    public void appear() {
        setExists(true);
        System.out.println("Появился " + getName());
    }

    public void influence(Character character) {
        if (isExists()) {
            System.out.println(getName() + " отрезвил " + character.getName());
        }
    }

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
        Daylight daylight = (Daylight) obj;
        return (this.getName()).equals(daylight.getName())
                && ((this.isExists()) == (daylight.isExists()));
    }

    @Override
    public String toString() {
        return "Daylight{ " + "name = " + getName() +
                "; Exists = " + isExists() +
                " }";
    }
}
