package character;

import enums.InteractiveEvilState;
import enums.LocationState;
import enums.PhysicalState;
import interfaces.IInteractiveEvil;

public abstract class Attacker extends Character implements IInteractiveEvil {
    private InteractiveEvilState interactive;

    public InteractiveEvilState getInteractive() {
        return interactive;
    }

    public void setInteractive(InteractiveEvilState interactive) {
        this.interactive = interactive;
    }

    public Attacker(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
        this.interactive = InteractiveEvilState.WAITING;
    }

}
