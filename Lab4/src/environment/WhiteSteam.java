package environment;

import character.Character;
import interfaces.Goodable;

import java.util.Objects;

public class WhiteSteam extends Environment implements Goodable {

    public WhiteSteam() {
        super("Облака белого пара");
        System.out.println("Появились облаки белого пара");
    }

    @Override
    public void appear() {
        setExists(true);
        System.out.println("За " + getName());
    }

    @Override
    public String toString() {
        return "WhiteSteam{ " + "name = " + getName() +
                "; Exists = " + isExists() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        WhiteSteam whiteSteam = (WhiteSteam) obj;
        return (this.getName()).equals(whiteSteam.getName())
                && ((this.isExists()) == (whiteSteam.isExists()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.isExists());
    }

    @Override
    public void makeGoodThings(Character character) {
        System.out.println(getName() + " оказали помощь " + character.getName() + ", закрыв плотной завесой");
    }
}
