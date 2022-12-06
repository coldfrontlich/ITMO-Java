package environment;

import character.Travallers;
import character.Character;

import java.util.Objects;

public class Picture extends Environment{

    private String feelLike;

    public String getFeelLike() {
        return feelLike;
    }

    public void setFeelLike(String feelLike) {
        this.feelLike = feelLike;
    }

    public Picture(String name) {
        super(name);
        this.feelLike = "никак";
    }

    @Override
    public void appear() {
        setExists(true);
        System.out.println("Появилась картина");
    }

    public void makeImpact(Character character) {
        if (character instanceof Travallers) {
            setFeelLike("неприятен");
            System.out.println(getName() + " " + getFeelLike() + " " + character.getName() + " так как напоминает о старцах");
        } else {
            System.out.println(getName() + getFeelLike() + " воспринимается" + character.getName());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.isExists(), this.getFeelLike());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Picture picture = (Picture) obj;
        return (this.getName()).equals(picture.getName())
                && ((this.isExists()) == (picture.isExists()))
                && (this.getFeelLike()).equals(picture.getFeelLike());
    }

    @Override
    public String toString() {
        return "Picture{ " + "name = " + getName() +
                "; Exists = " + isExists() +
                "; feelLike = " + getFeelLike() +
                " }";
    }

}
