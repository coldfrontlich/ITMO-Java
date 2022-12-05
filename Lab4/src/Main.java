//32324
import character.*;
import enums.ConditonState;
import enums.LocationState;
import enums.PhysicalState;
import environment.Picture;
import environment.StrangeVoice;
import environment.TrumpetSounds;
import environment.WhiteSteam;

public class Main {
    public static void main(String[] args) {
        Picture picture = new Picture("Рисунок");
        Penguins penguins = new Penguins("Пингвины", LocationState.DEFAULT, PhysicalState.ALIVE);
        picture.appear();
        Travallers travallers = new Travallers("Мы", LocationState.DEFAULT, PhysicalState.ALIVE);
        Denfort denfort = new Denfort(LocationState.DEFAULT, PhysicalState.ALIVE);
        WhiteSteam whiteSteam = new WhiteSteam();
        TrumpetSounds trumpetSounds = new TrumpetSounds();
        Ancient ancients = new Ancient( LocationState.DEFAULT, PhysicalState.ALIVE);
        Pursuer pursuer = new Pursuer( LocationState.DEFAULT, PhysicalState.ALIVE);
        NightmareCreatures nightmareCreatures = new NightmareCreatures(PhysicalState.ALIVE);
        System.out.println();

        picture.makeImpact(travallers);
        travallers.hear(penguins);
        penguins.scream(travallers);
        System.out.println();

        travallers.hear(pursuer);
        whiteSteam.appear();
        trumpetSounds.appear();
        System.out.println();

        trumpetSounds.condition();
        travallers.rushAway();
        travallers.knowHow(ancients);
        pursuer.showDescription();
        pursuer.showAbilities(travallers);
        System.out.println();

        travallers.hope();
        travallers.showCondition(ConditonState.WITHOUTAGGRESSION);
        travallers.showCondition(ConditonState.GOODINTENSIONS);
        travallers.makeGoodThings(pursuer);
        System.out.println();

        pursuer.checkThreat(travallers);
        System.out.println();

        travallers.runThrough(LocationState.GALLERY);
        travallers.checkCover();
        travallers.useFlashlights(whiteSteam);
        System.out.println();

        StrangeVoice strangeVoice = new StrangeVoice();
        strangeVoice.appear();
        System.out.println();

        pursuer.wounded();
        travallers.look(pursuer);
        denfort.shoutLoud();
        pursuer.hearVoice(denfort);
        System.out.println();

        nightmareCreatures.showDescription();
        pursuer.makeBadThings(ancients);
        travallers.regret(pursuer);
    }
}