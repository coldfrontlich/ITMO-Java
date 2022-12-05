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

    public void shoutLoud(Ancient ancient) {
        setShout(true);
        System.out.println(getName() + " закричал вспомнив о барельефах " + ancient.getName());
    }

    @Override
    public String toString() {
        return "Denfort{ " + "name = " + getName() +
                "; location = " + getLocation() +
                "; physical state = " + getPhysical() +
                "; condition state = " + getCondition() +
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
                && (this.getCondition()).equals(denfort.getCondition())
                && (this.isShout() == (denfort.isShout()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPhysical(), this.getLocation(),this.getCondition(), this.isShout());
    }
}
