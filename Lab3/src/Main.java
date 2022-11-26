import character.*;
import character.Character;
import enums.InteractiveEvilState;
import enums.InteractiveGoodState;
import enums.LocationState;
import enums.PhysicalState;

public class Main {
    public static void main(String[] args) {
        Pursuer pursuer = new Pursuer("Преследователь", LocationState.UNDERWATERWORLD, PhysicalState.INVINCIBLE);
        Ancient ancient1 = new Ancient("Игорь", LocationState.VILLAGE, PhysicalState.ALIVE);
        ParticipantInTheMassacre participantInTheMassacre1 = new ParticipantInTheMassacre("Олег", LocationState.VILLAGE, PhysicalState.ALIVE);
        ancient1.changeLocation(LocationState.GALLERY);
        participantInTheMassacre1.changeLocation(LocationState.GALLERY);
        pursuer.changeBehavior(InteractiveEvilState.SEEK);
        pursuer.changeLocation(LocationState.GALLERY);
        ancient1.changeBehavior(InteractiveGoodState.HOPEFORSURVIVAL);
        ancient1.changeBehavior(InteractiveGoodState.HIDE);
        participantInTheMassacre1.changeBehavior(InteractiveGoodState.HIDE);
        participantInTheMassacre1.changeBehavior(InteractiveGoodState.LISTENSTEPS);
        pursuer.changeBehavior(InteractiveEvilState.SEEK);
        ancient1.changeBehavior(InteractiveGoodState.RUSHAWAY);
        pursuer.changeBehavior(InteractiveEvilState.CAUGHTUP);
        ancient1.attackAttacker(pursuer);
        pursuer.killCitizen(ancient1);
        participantInTheMassacre1.changeBehavior(InteractiveGoodState.RUSHAWAY);
        participantInTheMassacre1.attackAttacker(pursuer);
        pursuer.changeBehavior(InteractiveEvilState.PURSUE);
        participantInTheMassacre1.changePhysicalState(PhysicalState.INJURED);
        pursuer.killCitizen(participantInTheMassacre1);
        pursuer.changeBehavior(InteractiveEvilState.LEAVE);
        System.out.println(pursuer);
        System.out.println(ancient1);
        System.out.println(participantInTheMassacre1);
    }
}