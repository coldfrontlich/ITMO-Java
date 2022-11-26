package character;

import enums.InteractiveEvilState;
import enums.LocationState;
import enums.PhysicalState;
import interfaces.IInteractiveEvil;

public abstract class Attacker extends Character implements IInteractiveEvil {
    private InteractiveEvilState interactive;
    private int killsCount;

    public int getKillsCount() {
        return killsCount;
    }

    public void setKillsCount(int killsCount) {
        if (killsCount < 0) {
            this.killsCount = 0;
        } else {
            this.killsCount = killsCount;
        }
    }

    public InteractiveEvilState getInteractive() {
        return interactive;
    }

    public void setInteractive(InteractiveEvilState interactive) {
        this.interactive = interactive;
    }

    public Attacker(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
        this.interactive = InteractiveEvilState.WAITING;
        this.killsCount = 0;
    }

    public abstract void killCitizen(Hidden hidden);

}
