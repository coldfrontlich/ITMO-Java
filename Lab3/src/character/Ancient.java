package character;

import enums.LocationState;
import enums.PhysicalState;

import java.util.Objects;

public class Ancient extends Character{

    private boolean reliefOK;

    public boolean isReliefOK() {
        return reliefOK;
    }

    public void setReliefOK(boolean reliefOK) {
        this.reliefOK = reliefOK;
    }
    public Ancient( LocationState location, PhysicalState physical) {
        super("Старцы", location, physical);
        reliefOK = true;
        System.out.println(getName() + " появились");
    }






    @Override
    public String toString() {
        return "Ancient{ " + "name = " + getName() +
                "; location = " + getLocation() +
                "; physical state = " + getPhysical() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Ancient ancient = (Ancient) obj;
        return (this.getName()).equals(ancient.getName())
                && (this.getLocation()).equals(ancient.getLocation())
                && (this.getPhysical()).equals(ancient.getPhysical());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPhysical(), this.getLocation());
    }


}
