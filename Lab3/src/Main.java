import character.Ancient;
import character.Attacker;
import character.Character;
import character.Pursuer;
import enums.InteractiveEvilState;
import enums.LocationState;
import enums.PhysicalState;

public class Main {
    public static void main(String[] args) {
        Pursuer pursuer = new Pursuer("Преследователь", LocationState.UNDERWATERWORLD, PhysicalState.INVINCIBLE);
        Ancient ancient1 = new Ancient("Игорь", LocationState.VILLAGE, PhysicalState.ALIVE);
        pursuer.changePhysicalState(PhysicalState.INVINCIBLE);
        ancient1.attackAttacker(pursuer);
        pursuer.changeBehavior(InteractiveEvilState.SEEK);
        pursuer.changeLocation(LocationState.VILLAGE);
        pursuer.changeBehavior(InteractiveEvilState.WAITING);
        pursuer.changeBehavior(InteractiveEvilState.PURSUE);
        pursuer.changeBehavior(InteractiveEvilState.CAUGHTUP);
        pursuer.killCitizen(ancient1);
        pursuer.changeBehavior(InteractiveEvilState.LEAVE);
        System.out.println(pursuer);
    }
}