package character;

import enums.LocationState;
import enums.PhysicalState;

public class Denfort extends Character{

    public Denfort(LocationState location, PhysicalState physical) {
        super("Денфорт", location, physical);
    }

    public boolean isShout() {
        return shout;
    }

    private void setShout(boolean shout) {
        this.shout = shout;
    }

    private boolean shout = false;

    public void shoutLoud() {
        setShout(true);
        System.out.println(getName() + " закричал");
    }
}
