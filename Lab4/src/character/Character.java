package character;

import enums.ConditonState;
import enums.LocationState;
import enums.PhysicalState;

import java.util.Objects;

public abstract class Character {

    private final String name;
    private LocationState location;
    private PhysicalState physical;

    public ConditonState getCondition() {
        return condition;
    }

    public void setCondition(ConditonState condition) {
        this.condition = condition;
    }

    private ConditonState condition;

    public Character(String name, LocationState location, PhysicalState physical) {
        this.name = name;
        this.location = location == null ? LocationState.DEFAULT : location;
        this.physical = physical == null ? PhysicalState.ALIVE : physical;
        this.condition = ConditonState.WITHOUTAGGRESSION;
    }

    public String getName() {
        return this.name;
    }

    public LocationState getLocation() {
        return this.location;
    }

    public void setLocation(LocationState location) {
        this.location = location;
    }

    public PhysicalState getPhysical() {
        return this.physical;
    }

    public void setPhysical(PhysicalState physical) {
        this.physical = physical;
    }





    public void showConditionWithText() {
        if (getCondition() == ConditonState.WITHOUTAGGRESSION) {
            System.out.println(getName() + " - без агрессии ");
        } else if (getCondition() == ConditonState.GOODINTENSIONS) {
            System.out.println(getName() + " - с добрыми намерениями");
        } else if (getCondition() == ConditonState.CURIOSITY) {
            System.out.println(getName() + " - проявление любознательности");
        } else if (getCondition() == ConditonState.SHOCK){
            System.out.println(getName() + " - переходит в состояние шока");
        }
    }

    public void choosePath(boolean right) {
        if (right) {
            System.out.println(getName() + " пошел по правильному пути ");
        } else {
            System.out.println(getName() + " пошел по ложному пути");
        }
    }

    @Override
    public String toString() {
        return "Character{ " + "name = " + getName() +
                "; location = " + getLocation() +
                "; physical state = " + getPhysical() +
                "; condition state = " + getCondition() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Character character = (Character) obj;
        return (this.getName()).equals(character.getName())
                && (this.getLocation()).equals(character.getLocation())
                && (this.getPhysical()).equals(character.getPhysical())
                && (this.getCondition()).equals(character.getCondition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPhysical(), this.getLocation(), this.getCondition());
    }
}
