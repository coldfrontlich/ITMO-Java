package character;

import enums.InteractiveEvilState;
import enums.LocationState;
import enums.PhysicalState;

import java.util.Objects;

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

    public void changeLocation(LocationState location) {
        LocationState locationEarly = getLocation();
        setLocation(location);
        if (locationEarly == location) {
            System.out.println("Преследователь остается там же ");
        } else if (location == LocationState.VILLAGE) {
            System.out.println("Преследователь переходит в деревню ");
        } else if (location == LocationState.GALLERY) {
            System.out.println("Преследователь переходит в галерею ");
        } else if (location == LocationState.UNDERWATERWORLD) {
            System.out.println("Преследователь переходит в подводный мир ");
        }
    }

    @Override
    public String toString() {
        return "Pursuer{ " + "name = " + getName() +
                "; location = " + getLocation() +
                "; physical state = " + getPhysical() +
                "; interactive = " + getInteractive() +
                "; kill count = " + getKillsCount() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pursuer pursuer = (Pursuer) obj;
        return (this.getName()).equals(pursuer.getName())
                && (this.getInteractive()).equals(pursuer.getInteractive())
                && (this.getLocation()).equals(pursuer.getLocation())
                && (this.getPhysical()).equals(pursuer.getPhysical())
                && ((this.getKillsCount()) == (pursuer.getKillsCount()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getInteractive(), this.getPhysical(), this.getLocation(), this.getKillsCount());
    }
}
