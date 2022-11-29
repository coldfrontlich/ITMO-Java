package character;

import enums.LocationState;
import enums.PhysicalState;
import environment.Environment;
import environment.WhiteSteam;

public class Travallers extends Character {

    public Travallers(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
        System.out.println(getName() + " появились");
    }


    public void hear(Character character) {
        System.out.println(getName() + " расслышали " + character.getName());
    }

    public void rushAway() {
        System.out.println(getName() + " со всех ног неслись прочь");
    }

    public void runThrough(LocationState state) {
        setLocation(state);
        if (getLocation() == LocationState.DEFAULT) {
            System.out.println(getName() + " пробегаем");
        } else if (getLocation() == LocationState.GALLERY) {
            System.out.println(getName() + " пробегаем по галерее");
        } else if (getLocation() == LocationState.UNDERWATERWORLD) {
            System.out.println(getName() + " проплываем по подводному миру");
        }
    }

    public void checkCover() {
        if (getLocation() == LocationState.GALLERY) {
            System.out.println("В галерее невозможно укрыться");
        } else {
            System.out.println("Можно укрыться");
        }
    }

    public void knowHow(Character character) {
        if (character instanceof Ancient) {
            System.out.println(getName() + " знали как быстро " + character.getName() + " перемещаются в пространстве");
        } else {
            System.out.println(getName() + " не знали как быстро перемещаются " + character.getName());
        }
    }

    public void hope() {
        System.out.println(getName() + " смутно надеялись");
    }

    public void useFlashlights(Environment environment) {
        if (environment instanceof WhiteSteam) {
            if (environment.isExists()) {
                System.out.println("Лучи фонариков рассеивают облако пара");
            } else {
                System.out.println("Лучи фонариков никак не помогли");
            }
        } else {
            System.out.println(getName() + " освещаем фонарями путь");
        }
    }

    public void look(Character character) {
        if(character instanceof Pursuer) {
            if(character.getPhysical() == PhysicalState.INJURED) {
                System.out.println(getName() + " не решились посмотреть");
            }
        } else {
            System.out.println(getName() + " посмотрели на " + character.getName());
        }
    }

    public void regret(Character character) {
        System.out.println("Жалко оставлять " + character.getName() + " на верную смерть");
    }
}
