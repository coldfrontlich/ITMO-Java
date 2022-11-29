package character;

import enums.ConditonState;
import enums.LocationState;
import enums.PhysicalState;
import interfaces.ICondition;
import interfaces.IPhysical;

public abstract class Character implements IPhysical, ICondition {

    private final String name;
    private LocationState location;
    private PhysicalState physical;

    public Character(String name, LocationState location, PhysicalState physical) {
        this.name = name;
        this.location = location == null ? LocationState.DEFAULT : location;
        this.physical = physical == null ? PhysicalState.ALIVE : physical;
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

    @Override
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

    @Override
    public void showCondition(ConditonState conditonState) {
        if (conditonState == ConditonState.WITHOUTAGGRESSION) {
            System.out.println(getName() + " - без агрессии ");
        } else if (conditonState == ConditonState.GOODINTENSIONS) {
            System.out.println(getName() + " - с добрыми намерениями");
        } else if (conditonState == ConditonState.CURIOSITY) {
            System.out.println(getName() + " - проявление любознательности");
        }
    }
}
