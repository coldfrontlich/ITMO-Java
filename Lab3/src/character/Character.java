package character;

import enums.LocationState;
import enums.PhysicalState;
import interfaces.IPhysical;

public abstract class Character implements IPhysical {

    private final String name;
    private LocationState location;
    private PhysicalState physical;

    public Character(String name, LocationState location, PhysicalState physical) {
        this.name = name;
        this.location = location == null ? LocationState.VILLAGE : location;
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
        } else if (condition == PhysicalState.SURVIVED) {
            System.out.println(characterName + (earlyCondition != PhysicalState.SURVIVED ? " сбежал от этого ужаса" : " попивает горячий чай дома"));
        } else if (condition == PhysicalState.INJURED) {
            System.out.println(characterName + (earlyCondition != PhysicalState.INJURED ? " ранен" : " сильно ранен"));
        } else if (condition == PhysicalState.DEAD) {
            System.out.println(characterName + (earlyCondition != PhysicalState.DEAD ? " погиб" : " всё ещё мертв"));
        } else if (condition == PhysicalState.INVINCIBLE) {
            System.out.println(characterName + (earlyCondition != PhysicalState.INVINCIBLE ? " неуязвим" : " всё ещё неуязвим"));
        }
    }
}
