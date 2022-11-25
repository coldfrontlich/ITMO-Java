package character;

import enums.InteractiveEvilState;
import enums.LocationState;
import enums.PhysicalState;

public class Pursuer extends Attacker {

    public Pursuer(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
        System.out.println("Преследователь появился на поле боя");
    }

    @Override
    public void changeBehavior(InteractiveEvilState state) {
        if (state == InteractiveEvilState.SEEK) {
            setInteractive(InteractiveEvilState.SEEK);
            if (getLocation() == LocationState.GALLERY) {
                System.out.println("Преследователь ищет жертв в Галерее ");
            }
        }
    }
}
