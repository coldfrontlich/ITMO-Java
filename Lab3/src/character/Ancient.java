package character;

import enums.InteractiveGoodState;
import enums.LocationState;
import enums.PhysicalState;

public class Ancient extends Hidden{

    public Ancient(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
        System.out.println("Старец " + getName() + " появился на поле боя");
    }

    @Override
    public void changeBehavior(InteractiveGoodState state) {
        setInteractive(state);
        if (state == InteractiveGoodState.RUSHAWAY) {
            System.out.println(getName() + " бежит куда глаза глядят");
        } else if (state == InteractiveGoodState.HIDE){
            System.out.println(getName() + " с помощью своих знаний находит где спрятаться");
        } else if (state == InteractiveGoodState.WAITING) {
            System.out.println(getName() + " ждет что его спасут");
        } else if (state == InteractiveGoodState.LISTENSTEPS) {
            System.out.println(getName() + " вслушивается в шаги убийцы");
        } else if (state == InteractiveGoodState.HOPEFORSURVIVAL) {
            System.out.println(getName() + " молится древним богам о спасении");
        } else if (state == InteractiveGoodState.READFORTUNE) {
            System.out.println(getName() + " гадает на древнем манускрипте");
        }
    }

    @Override
    public void changeLocation(LocationState location) {
        LocationState locationEarly = getLocation();
        setLocation(location);
        if (locationEarly == location) {
            System.out.println(getName() + " остается там же");
        } else if (location == LocationState.VILLAGE) {
            System.out.println(getName() + " сбежал в деревню ");
        } else if (location == LocationState.GALLERY) {
            System.out.println(getName() + " сбежал в галерею ");
        } else if (location == LocationState.UNDERWATERWORLD) {
            System.out.println(getName() + " сбежал в подводный мир ");
        }
    }

    @Override
    public void attackAttacker(Attacker attacker) {
        System.out.println(getName() + " полный ярости атакует маньяка магической тростью");
        attacker.changePhysicalState(PhysicalState.INJURED);
    }
}
