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


    public void changePhysicalState(PhysicalState condition) {
        PhysicalState earlyCondition = this.getPhysical();
        setPhysical(condition);
        String characterName = this.getName();
        if (condition == PhysicalState.ALIVE) {
            System.out.println(characterName + (earlyCondition != PhysicalState.ALIVE ? " живой" : " живее всех живых"));
        } else if (condition == PhysicalState.INJURED) {
            System.out.println(characterName + (earlyCondition != PhysicalState.INJURED ? " ранен" : " сильно ранен"));
        } else if (condition == PhysicalState.DEAD) {
            System.out.println(characterName + (earlyCondition != PhysicalState.DEAD ? " погиб" : " всё ещё мертв"));
        }
    }


    public void showCondition(ConditonState conditonState) {
        if (conditonState == ConditonState.WITHOUTAGGRESSION) {
            System.out.println(getName() + " - без агрессии ");
        } else if (conditonState == ConditonState.GOODINTENSIONS) {
            System.out.println(getName() + " - с добрыми намерениями");
        } else if (conditonState == ConditonState.CURIOSITY) {
            System.out.println(getName() + " - проявление любознательности");
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
