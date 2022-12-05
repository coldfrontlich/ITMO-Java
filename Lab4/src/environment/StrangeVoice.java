package environment;

import character.Travallers;

import java.util.Objects;

public class StrangeVoice extends Environment {

    public StrangeVoice() {
        super("Странные звуки");
        System.out.println("Появились странные звуки");
    }

    @Override
    public void appear() {
        if (isExists()) {
            System.out.println("Вновь прогремел звук \"Текели-ли! Текели-ли!\"");
        } else {
            setExists(true);
            System.out.println("Текели-ли! Текели-ли!");
        }
    }

    @Override
    public String toString() {
        return "StrangeVoice{ " + "name = " + getName() +
                "; Exists = " + isExists() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        StrangeVoice strangeVoice = (StrangeVoice) obj;
        return (this.getName()).equals(strangeVoice.getName())
                && ((this.isExists()) == (strangeVoice.isExists()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.isExists());
    }
}
