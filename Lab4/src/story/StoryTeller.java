package story;

import character.*;
import character.Character;
import enums.ConditonState;
import enums.LocationState;
import enums.PhysicalState;
import environment.*;
import interfaces.Evilable;
import interfaces.Goodable;


public class StoryTeller {

    public static void evilness(Evilable evilable, Character character) {
        evilable.makeBadThings(character);
    }

    public static void goodness(Goodable goodable, Character character) {
        goodable.makeGoodThings(character);
    }

    public static void tellStory() {
        Travallers travallers = new Travallers("Мы", LocationState.DEFAULT, PhysicalState.ALIVE);
        Denfort denfort = new Denfort(LocationState.DEFAULT, PhysicalState.ALIVE);
        WhiteSteam whiteSteam = new WhiteSteam();
        TrumpetSounds trumpetSounds = new TrumpetSounds();
        Ancient ancients = new Ancient( LocationState.DEFAULT, PhysicalState.DEAD, 4);
        Pursuer pursuer = new Pursuer( LocationState.DEFAULT, PhysicalState.ALIVE);
        NightmareCreatures nightmareCreatures = new NightmareCreatures(PhysicalState.ALIVE);
        System.out.println();

        Picture picture = new Picture("Рисунок");
        picture.appear();
        picture.makeImpact(travallers);
        Penguins penguins = new Penguins("Пингвины", LocationState.DEFAULT, PhysicalState.ALIVE);
        travallers.hear(penguins);
        penguins.scream(travallers);
        SmellUnknownOrigin smellUnknownOrigin = new SmellUnknownOrigin("Запах неизвестного происхождения");
        smellUnknownOrigin.appear();
        smellUnknownOrigin.pushedOut(new SmellUnknownOrigin.FormerSmell("Прежний запах"));
        System.out.println();

        travallers.look(ancients);
        penguins.click(LocationState.DEFAULT);
        travallers.examineRemains(ancients);
        denfort.shoutLoud(ancients);
        System.out.println();

        Slime slime = new Slime("Черная слизь", ancients);
        slime.appear();
        slime.giveOffOdor(smellUnknownOrigin);
        System.out.println();

        Daylight daylight = new Daylight("Дневной свет");
        daylight.appear();
        travallers.climb(daylight);
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
        System.out.println();

        pursuer.choosePath(false);
        travallers.choosePath(true);
        penguins.makeGoodThings(travallers);
        whiteSteam.makeGoodThings(travallers);
        System.out.println();

        smellUnknownOrigin.checkStanding();
        StoryTeller.evilness(new Evilable(){
            public void makeBadThings(Character character){
                System.out.println(character.getName() + " переходит в состояние шока");
            }
        }, denfort);
        System.out.println();

        Penguins.Floor floor = penguins.new Floor();
        floor.polish();
        pursuer.makeBadThings(penguins);
        strangeVoice.appear();
        System.out.println();

        daylight.influence(travallers);
        travallers.look(new Character("несчастный Гедни", LocationState.DEFAULT, PhysicalState.DEAD)
        {

        });
        class Dog extends Character {
            public Dog(String name, LocationState location, PhysicalState physical) {
                super(name, location, physical);
            }
        }
        travallers.look(new Dog("Собака", LocationState.DEFAULT, PhysicalState.DEAD));
        StoryTeller.goodness(new Goodable() {
            public void makeGoodThings(Character character) {
                System.out.println(character.getName() + " никогда не потревожит их");
            }
        }, new Character("Никто", LocationState.DEFAULT, PhysicalState.ALIVE) {
        });
        System.out.println();

        travallers.climb(LocationState.PEAK);
        travallers.farewell();
        System.out.println();
    }
}
