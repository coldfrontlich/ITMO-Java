package character;

import enums.LocationState;
import enums.PhysicalState;
import interfaces.Evilable;

import java.util.Objects;

public class Pursuer extends Character implements Evilable {

    public Pursuer(LocationState location, PhysicalState physical) {
        super("Преследователь", location, physical);
        System.out.println("Преследователь появился");
    }

    public void showDescription(){
        System.out.println(getName() + " выживший участник немыслимой бойни");
    }

    public void showAbilities(Character character) {
        if (character instanceof Travallers) {
            System.out.println(getName() + " мог догнать нас меньше чем за минуту");
        } else {
            System.out.println(getName() + " мог догнать " + character.getName() + " меньше чем за минуту");
        }
    }

    public void checkThreat(Character character) {
        if (character instanceof Travallers) {
            System.out.println(getName() + " не чувствует от них никакой угрозы");
        } else {
            System.out.println(getName() + " чувствует угрозу");
        }
    }

    public void wounded() {
        changePhysicalState(PhysicalState.INJURED);
    }

    public void hearVoice(Character character) {
        if (character instanceof Denfort) {
            Denfort denfort = (Denfort) character;
            if (denfort.isShout()) {
                System.out.println(getName() + " услышал крик Денфорта и устремился вперед");
            }
        } else {
            System.out.println(getName() + " услышал крик " + character.getName());
        }
    }


    @Override
    public void makeBadThings(Character character) {
        if (character instanceof Ancient) {
            Ancient ancient = (Ancient) character;
            ancient.setReliefOK(false);
            System.out.println(getName() + " испоганил барельеф " + ancient.getName());
        } else {
            character.changePhysicalState(PhysicalState.DEAD);
            System.out.println(getName() + "догнал и убил " + character.getName());
        }
    }


    @Override
    public String toString() {
        return "Pursuer{ " + "name = " + getName() +
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
        Pursuer pursuer = (Pursuer) obj;
        return (this.getName()).equals(pursuer.getName())
                && (this.getLocation()).equals(pursuer.getLocation())
                && (this.getCondition()).equals(pursuer.getCondition())
                && (this.getPhysical()).equals(pursuer.getPhysical());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPhysical(), this.getLocation(), this.getCondition());
    }


}
