import character.Attacker;
import character.Character;
import character.Pursuer;
import enums.InteractiveEvilState;
import enums.LocationState;
import enums.PhysicalState;

public class Main {
    public static void main(String[] args) {
        Pursuer pursuer = new Pursuer("Преследователь", LocationState.UNDERWATERWORLD, PhysicalState.INVINCIBLE);
        Pursuer pursuer2 = new Pursuer("Преследователь", LocationState.UNDERWATERWORLD, PhysicalState.INVINCIBLE);
        System.out.println(pursuer.equals(pursuer2));
        pursuer.changePhysicalState(PhysicalState.ALIVE);
        pursuer.changeBehavior(InteractiveEvilState.SEEK);
        pursuer.changeLocation(LocationState.VILLAGE);
        pursuer.changeBehavior(InteractiveEvilState.WAITING);
        pursuer.changeBehavior(InteractiveEvilState.PURSUE);
        pursuer.changeBehavior(InteractiveEvilState.CAUGHTUP);
        pursuer.changeBehavior(InteractiveEvilState.LEAVE);
        System.out.println(pursuer);
    }
}