package character;

import enums.InteractiveEvilState;
import enums.InteractiveGoodState;
import enums.LocationState;
import enums.PhysicalState;
import interfaces.IInteracvtiveGood;

public abstract class Hidden extends Character implements IInteracvtiveGood {

    private InteractiveGoodState interactive;

    public InteractiveGoodState getInteractive() {
        return interactive;
    }

    public void setInteractive(InteractiveGoodState interactive) {
        this.interactive = interactive;
    }

    public Hidden(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
        this.interactive = InteractiveGoodState.WAITING;
    }

    public abstract void attackAttacker(Attacker attacker);
}
