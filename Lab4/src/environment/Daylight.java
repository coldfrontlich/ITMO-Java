package environment;

import character.Character;

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
}
