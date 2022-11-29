package character;

import enums.LocationState;
import enums.PhysicalState;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Denfort{ " + "name = " + getName() +
                "; location = " + getLocation() +
                "; physical state = " + getPhysical() +
                "; shout = " + isShout() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Denfort denfort = (Denfort) obj;
        return (this.getName()).equals(denfort.getName())
                && (this.getLocation()).equals(denfort.getLocation())
                && (this.getPhysical()).equals(denfort.getPhysical())
                && (this.isShout() == (denfort.isShout()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPhysical(), this.getLocation(), this.isShout());
    }
}
