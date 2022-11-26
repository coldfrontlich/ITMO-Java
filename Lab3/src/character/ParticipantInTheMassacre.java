package character;

import enums.InteractiveGoodState;
import enums.LocationState;
import enums.PhysicalState;

import java.util.Objects;

public class ParticipantInTheMassacre extends Hidden{

    public ParticipantInTheMassacre(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
        System.out.println("Участник резни " + getName() + " появился на поле боя");
    }

    @Override
    public void attackAttacker(Attacker attacker) {
        System.out.println(getName() + " полный ярости атакует маньяка голыми кулаками");
        attacker.changePhysicalState(PhysicalState.INJURED);
    }

    @Override
    public void changeLocation(LocationState location) {
        LocationState locationEarly = getLocation();
        setLocation(location);
        if (locationEarly == location) {
            System.out.println(getName() + " остается ждать маньяка там же");
        } else if (location == LocationState.VILLAGE) {
            System.out.println(getName() + " побежал на поиски маньяка в деревню ");
        } else if (location == LocationState.GALLERY) {
            System.out.println(getName() + " побежал на поиски маньяка в галерею ");
        } else if (location == LocationState.UNDERWATERWORLD) {
            System.out.println(getName() + " побежал на поиски маньяка в подводный мир ");
        }
    }


    @Override
    public void changeBehavior(InteractiveGoodState state) {
        setInteractive(state);
        if (state == InteractiveGoodState.RUSHAWAY) {
            System.out.println(getName() + " бегает в поисках манька ");
        } else if (state == InteractiveGoodState.HIDE){
            System.out.println(getName() + " прячется чтобы подкараулить маньяка");
        } else if (state == InteractiveGoodState.WAITING) {
            System.out.println(getName() + " ждет маньяка");
        } else if (state == InteractiveGoodState.LISTENSTEPS) {
            System.out.println(getName() + " вслушивается в шаги маньяка");
        } else if (state == InteractiveGoodState.HOPEFORSURVIVAL) {
            System.out.println(getName() + " молится о благополучии своей семьи");
        } else if (state == InteractiveGoodState.READFORTUNE) {
            System.out.println(getName() + " гадает на волшебном шаре восьмерке");
        }
    }

    @Override
    public String toString() {
        return "ParticipantInTheMassacre{ " + "name = " + getName() +
                "; location = " + getLocation() +
                "; physical state = " + getPhysical() +
                "; interactive = " + getInteractive() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ParticipantInTheMassacre participantInTheMassacre = (ParticipantInTheMassacre) obj;
        return (this.getName()).equals(participantInTheMassacre.getName())
                && (this.getInteractive()).equals(participantInTheMassacre.getInteractive())
                && (this.getLocation()).equals(participantInTheMassacre.getLocation())
                && (this.getPhysical()).equals(participantInTheMassacre.getPhysical());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getInteractive(), this.getPhysical(), this.getLocation());
    }
}
