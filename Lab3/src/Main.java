import character.Attacker;
import character.Character;
import character.Pursuer;
import enums.InteractiveEvilState;
import enums.LocationState;
import enums.PhysicalState;

public class Main {
    public static void main(String[] args) {
        Pursuer pursuer = new Pursuer("Преследователь", LocationState.GALLERY, PhysicalState.INVINCIBLE);
        pursuer.changePhysicalState(PhysicalState.ALIVE);
        pursuer.changeBehavior(InteractiveEvilState.SEEK);
    }
}