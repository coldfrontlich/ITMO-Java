package character;

import enums.LocationState;
import enums.PhysicalState;

public class Penguins extends Character{
    public Penguins(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
    }

    public void scream(Character character){
        System.out.println(getName() + " кричали на " + character.getName());
    }
}
