package environment;

import character.Travallers;
import character.Character;

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
}
