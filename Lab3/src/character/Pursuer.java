package character;

import enums.InteractiveEvilState;
import enums.LocationState;
import enums.PhysicalState;

public class Pursuer extends Attacker {

    public Pursuer(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
        System.out.println("Преследователь появился на поле боя");
    }

    private void findLocations(LocationState location) {
        if (location == LocationState.GALLERY) {
            System.out.println("Преследователь ищет жертв в Галерее ");
        } else if (location == LocationState.VILLAGE) {
            System.out.println("Преследователь ищет жертв в деревне ");
        } else if (location == LocationState.UNDERWATERWORLD) {
            System.out.println("Преследователь ищет жертв в подводном мире ");
        } else {
            System.out.println("Преследователь ищет вокруг себя");
        }
    }

    private void hideLocations(LocationState location) {
        if (location == LocationState.GALLERY) {
            System.out.println("Преследователь прячется за стендом в Галерее ");
        } else if (location == LocationState.VILLAGE) {
            System.out.println("Преследователь прячется за деревьями в деревне ");
        } else if (location == LocationState.UNDERWATERWORLD) {
            System.out.println("Преследователь прячется за руинами древних в подводном мире ");
        } else {
            System.out.println("Преследователь прячется");
        }
    }

    @Override
    public void changeBehavior(InteractiveEvilState state) {
        setInteractive(state);
        if (state == InteractiveEvilState.SEEK) {
            findLocations(getLocation());
        } else if (state == InteractiveEvilState.LEAVE){
            System.out.println(getName() + " уходит, количество жертв - " + getKillsCount());
        } else if (state == InteractiveEvilState.WAITING) {
            hideLocations(getLocation());
        } else if (state == InteractiveEvilState.PURSUE) {
            System.out.println("Преследователь следует за жертвой");
        } else if (state == InteractiveEvilState.CAUGHTUP) {
            System.out.println("Преследователь догнал и зарезал жертву");
            setKillsCount(getKillsCount() + 1);
        }
    }
}
